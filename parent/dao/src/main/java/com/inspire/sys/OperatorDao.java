package com.inspire.sys;

import com.inspire.jpa.BaseDao;

public interface OperatorDao extends BaseDao<Operator, String> {

	Operator findBySusername(String susername);
	
}
