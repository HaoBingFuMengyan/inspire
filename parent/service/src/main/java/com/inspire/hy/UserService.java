package com.inspire.hy;

import com.inspire.exception.E;
import com.inspire.jpa.BaseDao;
import com.inspire.jpa.BaseService;
import com.inspire.utils.B;
import com.inspire.utils.Consts;
import com.inspire.utils.DateUtils;
import com.inspire.utils.MD5;
import com.inspire.vo.hy.TRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserService extends BaseService<User>{
    @Autowired
    private UserDao userDao;
    @Autowired
    private MemberDao memberDao;

    @Override
    protected Class<User> getDomainClass() {
        return User.class;
    }

    @Override
    protected BaseDao<User, String> getBaseDao() {
        return userDao;
    }

    @Override
    protected void BaseSaveCheck(User obj) {

    }

    public User findBySusername(String susername){
        return this.userDao.findBySusername(susername);
    }

    /**
     * 会员注册
     * @param vo
     * @return
     */
    public Member register(TRegister vo){
        if (vo == null)
            E.S("非法操作");
        // 会员信息记录到会员表,交易员信息记录到交易员表,初始化系统信息
        if (B.Y(vo.getSusername())) {
            E.S("用户名不能为空");
        }
        if (B.Y(vo.getSpassword())) {
            E.S("请输入用户密码");
        }
        if (vo.getSpassword().length() < 6) {
            E.S("密码长度不能少于6位");
        }
        if (userDao.countSmobile(vo.getSmobile()) > 0) {
            E.S("手机号不能重复！");
        }

        Member memberBean = new Member();

        memberBean.setImembertype(Consts.MemberType.MEMBER.val());//会员类型
        memberBean.setIscope(Consts.BoolType.YES.val());
        Date currDate = DateUtils.getCurrentDateTime();
        memberBean.setSmemberno("HY"+DateUtils.getCurrentTimeNumber()+memberDao.count());
        memberBean.setBcaflag(Consts.BoolType.NO.val());// 默认设置使用CA
        memberBean.setDapplydate(currDate);// 申请日期
        memberBean.setImemberstatus(Consts.MemberStatus.NORMAL.val());// 设置会员为待完善资料
        memberBean.setBdelete(Consts.BoolType.NO.val());// 设置会员是否删除
        memberBean.setIauthtype(Consts.BoolType.NO.val());
        memberBean.setSmobile(vo.getSusername());

        memberDao.save(memberBean);// 保存会员信息
        User operatorBean = new User();
        operatorBean.setSoperatorno("U"+DateUtils.getCurrentTimeNumber()+userDao.count());// 设置交易员编号
        operatorBean.setSusername(vo.getSusername());// 交易员登录名 //fan:手机号可以改,所以手机号不要作为用户名
        operatorBean.setSname(vo.getSname());// 交易员名称
        operatorBean.setSpassword(vo.getSpassword());
        operatorBean.setSmobile(vo.getSusername());// 联系手机
        operatorBean.setSemail(vo.getSemail());// 联系邮箱
        operatorBean.setSphone(vo.getSphone());// 联系电话

        operatorBean.setSmemberid(memberBean.getId());// 设置会员ID
        operatorBean.setSpassword(MD5.encode(vo.getSpassword()));// 加密密码
        operatorBean.setBisadmin(Consts.BoolType.YES.val());// 设置为默认管理员
        operatorBean.setBisvalid(Consts.BoolType.YES.val());// 设置交易员是否有效
        operatorBean.setBisdelete(Consts.BoolType.NO.val());// 设置交易员是否删除
        operatorBean.setBisymobile(Consts.BoolType.YES.val());
        operatorBean.setBisyemail(Consts.BoolType.NO.val());
        userDao.saveAndFlush(operatorBean);// 保存交易员信息

        return memberBean;
    }
}
