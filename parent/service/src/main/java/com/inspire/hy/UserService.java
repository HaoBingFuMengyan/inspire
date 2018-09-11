package com.inspire.hy;

import com.inspire.jpa.BaseDao;
import com.inspire.jpa.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService extends BaseService<User>{
    @Autowired
    private UserDao userDao;

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
}
