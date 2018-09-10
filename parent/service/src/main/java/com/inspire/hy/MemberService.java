package com.inspire.hy;

import com.inspire.jpa.BaseDao;
import com.inspire.jpa.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService extends BaseService<Member>{
    @Autowired
    private MemberDao memberDao;

    @Override
    protected Class<Member> getDomainClass() {
        return Member.class;
    }

    @Override
    protected BaseDao<Member, String> getBaseDao() {
        return memberDao;
    }

    @Override
    protected void BaseSaveCheck(Member obj) {

    }
}
