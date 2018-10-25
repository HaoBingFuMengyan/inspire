package com.inspire.hy;

import com.inspire.jpa.BaseDao;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;


public interface SinglepointloginDao extends BaseDao<Singlepointlogin,String> {

    @Query("delete from Singlepointlogin t where t.dvalidtime<?1")
    @Modifying
    void deleteInvalid(Date now);

    Singlepointlogin findBySkey(String id);

}
