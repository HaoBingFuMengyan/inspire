package com.inspire.sys;

import com.inspire.jpa.BaseDao;


public interface SequenceDao extends BaseDao<Sequence,String> {

    Sequence findByScode(String scode);
}
