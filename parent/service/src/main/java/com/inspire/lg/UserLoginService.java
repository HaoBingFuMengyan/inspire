package com.inspire.lg;

import com.google.common.collect.Sets;
import com.inspire.hy.Member;
import com.inspire.hy.MemberDao;
import com.inspire.hy.User;
import com.inspire.hy.UserDao;
import com.inspire.securityShiro.ILoginService;
import com.inspire.securityShiro.ILoginUser;
import com.inspire.securityShiro.ShiroUsernamePasswordToken;
import com.inspire.utils.Consts;
import com.inspire.utils.DateUtils;
import com.inspire.utils.StringHelper;
import com.inspire.utils.T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Collection;
import java.util.HashSet;

/**
 * 用户管理类.
 * 
 * @frogsing van
 */
// Spring Service Bean的标识.
@Component
@Transactional
public class UserLoginService implements ILoginService {

	private static Logger logger = LoggerFactory.getLogger(UserLoginService.class);

	@Autowired
	private UserDao userDao;
//	@Autowired
//	private SinglepointloginDao singlepointloginDao;
	@Autowired
	private MemberDao memberDao;

	/**
	 * 获取用户信息
	 */
	@Override
	public ILoginUser getIUser(ShiroUsernamePasswordToken token) {
		User user = userDao.findBySusername(token.getUsername());

		if (user == null)
			return null;
		if (user.getBisdelete() == Consts.BoolType.YES.val())
			return null;
		if (user.getBisvalid()== Consts.BoolType.NO.val())
			return null;
		Member member = memberDao.getOne(user.getSmemberid());

		if (member == null)
			return null;
		LoginUser u = new LoginUser(user.getId(), user.getSusername(), user.getSname(),
				token.prePassword(user.getSpassword()), member.getImembertype(), user.getBisadmin(),
				user.getDlastloginsuccessdate(), user.getSmemberid(),
				member.getScnname() == null ? "" : member.getScnname(), member.getSmemberno(), member.getIauthtype(),
				Consts.BoolType.NO.val(), user.getSlikename(), user.getSmobile(), member.getBisselfsaler());
		return u;
	}

	/*
	 * 获取用户权限
	 */
	@Override
	@Transactional(readOnly = true)
	public Collection<String> getUserPurview(ILoginUser user) {

		LoginUser u = (LoginUser) user;

		Collection<String> db;
		Collection<String> rs = Sets.newHashSet();
		if (user.IsAdmin()) {
			if (u.getBissalesman() == Consts.BoolType.YES.val()) {
				db = userDao.getAllPurview(u.getMembertype(), u.getAuthtype(), 1, u.getMemberId());
			} else {
				db = userDao.getAllPurview(u.getMembertype(), u.getAuthtype(), 0, u.getMemberId());
			}
			Collection<String> special = userDao.getAllSpecialPurview(u.getMembertype(), u.getMemberId());
			if (special != null)
				db.addAll(special);
		} else {
			db = userDao.getAllPurview(user.getId());
		}
		for (String t : db) {
			String[] as = t.split(",");
			for (String b : as) {
				rs.add(b.trim());
			}
		}
		logger.info("所有权限:" + rs.toString());
		return rs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.frogsing.service.sys.ILoginService#DoLoginOk(java.lang.String)
	 */
	@Override
	public void DoLoginOk(ILoginUser user) {
		userDao.updateLoginTime(user.getId(), DateUtils.getCurrentDateTime());
	}

	@Override
	public Collection<String> getUserRole(ILoginUser user) {
		// LoginUser u=(LoginUser)user;
		HashSet<String> map = Sets.newHashSet("user");

		if (user instanceof LoginUser) {
			LoginUser u = (LoginUser) user;
			map.add(Consts.AuthenticateType.get(u.getAuthtype()).name());
			if (u.getMembertype() == Consts.MemberType.EXCHANGE.val())
				map.add("selfseller");
		}
		return map;
	}

	@Override
	public void doLoginIntegral(ILoginUser user) {

	}

	@Override
	public String getRedirectUrl(ServletRequest request,ServletResponse response, javax.security.auth.Subject subject) {
		return "index.shtml";
	}

	private String newLoginPoint(String susername) {
		String key = StringHelper.randomNum(128);
		Singlepointlogin t = new Singlepointlogin();
		t.setDaddtime(T.now());
		t.setDvalidtime(DateUtils.addSeconds(T.now(), 120));
		t.setSusername(susername);
		t.setSkey(key);
		singlepointloginDao.save(t);
		singlepointloginDao.deleteInvalid(T.now());
		return key;
	}

	@Override
	public String getSuccessUrl(ServletRequest request, ServletResponse response) {
		return "index.shtml";
	}

}
