package com.inspire.sys;

import com.inspire.jpa.BaseDao;
import com.inspire.jpa.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Component
public class OperatorService extends BaseService<Operator> {

	@Autowired
	private OperatorDao operatorDao;

	@Override
	protected Class<Operator> getDomainClass() {
		return Operator.class;
	}

	@Override
	protected BaseDao<Operator, String> getBaseDao() {
		return operatorDao;
	}

	@Override
	protected void BaseSaveCheck(Operator obj) {

	}

	public Operator findBySusername(String susername){
//		return this.operatorDao.findBySusername(susername);
		return new Operator();
	}

}