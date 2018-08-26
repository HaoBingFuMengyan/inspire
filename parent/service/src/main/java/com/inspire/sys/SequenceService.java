package com.inspire.sys;

import com.google.common.collect.Lists;
import com.inspire.exception.E;
import com.inspire.exception.ServiceException;
import com.inspire.jpa.BaseDao;
import com.inspire.jpa.BaseService;
import com.inspire.persistence.DynamicSpecifications;
import com.inspire.persistence.SearchFilter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class SequenceService extends BaseService<Sequence> {
    private SequenceDao sequenceDao;

    @Autowired
    public void setSequenceDao(SequenceDao sequenceDao) {
        this.sequenceDao = sequenceDao;
    }

    @Override
    protected Class<Sequence> getDomainClass() {
        return Sequence.class;
    }

    @Override
    protected BaseDao<Sequence, String> getBaseDao() {
        return sequenceDao;
    }

    @Override
    protected void BaseSaveCheck(Sequence obj) {
        if(StringUtils.isBlank(obj.getId())){
//            if(sequenceDao.count(sys_sequence.scode,obj.getScode())>0)
//                E.S("代码已经存在");
        }else{
//            if(sequenceDao.count(sys_sequence.scode,obj.getScode())>1)
//                E.S("代码已经存在");
        }
    }

    public Sequence findByScode(String scode){
        return sequenceDao.findByScode(scode);
    }

    /**
     * 获取所有单据编号信息列表
     * List<Sequence>
     */
    @Transactional(readOnly = true)
    public Page<Sequence> getSequenceByInfo (Pageable page, Sequence sequence){
        List<SearchFilter> ss= Lists.newArrayList();
        if(StringUtils.isNotBlank(sequence.getScode()))
            ss.add(new SearchFilter("scode", SearchFilter.Operator.LIKE,sequence.getScode()));
        if(StringUtils.isNotBlank(sequence.getSobjectname()))
            ss.add(new SearchFilter("sobjectname",SearchFilter.Operator.LIKE,sequence.getSobjectname()));


        Specification<Sequence> spec= DynamicSpecifications.bySearchFilter(ss, Sequence.class);



        return sequenceDao.findAll( spec,page);
    }

    /**
     * 根据id数组删除单据编号
     * @param checkboxId 单据编号数组
     */
    public void delete (String [] checkboxId) throws ServiceException {
        try{
            for (String id : checkboxId) {
                if(StringUtils.isNotBlank(id)){
                    if(sequenceDao.findById(id).orElse(new Sequence())!=null){
                        sequenceDao.deleteById(id);
                    }
                }
            }
        }catch(Exception ex){

            ex.printStackTrace();
            throw new ServiceException("根据id数组删除单据编号失败");
        }
    }

    /**
     * 根据id获取单据编号对象
     * Sequence
     */
    @Transactional(readOnly = true)
    public Sequence getById(String id){
        return sequenceDao.findById(id).orElse(new Sequence());
    }



}
