package com.inspire.hy;

import com.inspire.jpa.BaseDao;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends BaseDao<User,String>{

    @Query("select count(*) from User where smobile=?1")
    long countSmobile(String smobile);

    User findBySusername(String susername);
}
