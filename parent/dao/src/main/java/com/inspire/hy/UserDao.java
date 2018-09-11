package com.inspire.hy;

import com.inspire.jpa.BaseDao;

public interface UserDao extends BaseDao<User,String>{

    User findBySusername(String susername);
}
