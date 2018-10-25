package com.inspire.hy;

import com.inspire.jpa.BaseDao;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Date;

public interface UserDao extends BaseDao<User,String>{

    @Query("select count(*) from User where smobile=?1")
    long countSmobile(String smobile);

    User findBySusername(String susername);

    @Modifying
    @Query("update User set dlastloginsuccessdate=?2 where id=?1")
    void updateLoginTime(String id, Date currentDateTime);

    @Query("select distinct(p.surlpath) from  Actor ro join ro.rightList p  where ((ro.iroletype=?1 and ro.imemberstatus=?2 and ro.iorgtype=?3 and ro.bissystem=1 ) or ro.smemberid=?4) and ro.bisspecial=0")
    Collection<String> getAllPurview(int membertype, int iauthtype, int bisseller, String smemberid);


    @Query("select distinct(p.surlpath) from  Actor ro join ro.rightList p  where ro.id in ( select u.sspecialroleid from Actor u where  u.iroletype=?1 and u.smemberid=?2 and u.bisspecial=1)")
    Collection<String> getAllSpecialPurview(int membertype, String smemberid);


    @Query("select distinct(p.surlpath) from  Actor ro join ro.rightList p  where ro.id in (select o.sroleid from  UserActor o where o.suserid=?1)")
    Collection<String> getAllPurview(String userid);
}
