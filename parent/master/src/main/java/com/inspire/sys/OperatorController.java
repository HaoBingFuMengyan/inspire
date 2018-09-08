package com.inspire.sys;

import com.inspire.jpa.BaseService;
import com.inspire.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by haobingfu on 2018/4/16.
 */
@Controller
@RequestMapping(value = "/operator")
public class OperatorController extends BaseController<Operator,Operator> {

    @Autowired
    private OperatorService operatorService;

    @Override
    protected BaseService<Operator> getBaseService() {
        return operatorService;
    }

    @Override
    protected String getDefaultSort() {
        return "desc_soperatorno";
    }

    @Override
    protected String getPackName() {
        return "sys";
    }

    @Override
    protected String getObjectName() {
        return "operator-list";
    }
}
