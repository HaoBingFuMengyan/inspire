package com.inspire.sys;

import com.inspire.jpa.BaseService;
import com.inspire.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by haobingfu on 2018/8/26.
 */
@Controller
@RequestMapping(value = "/sys/sequence")
public class SequenceController extends BaseController<Sequence, Sequence> {

    @Autowired
    private SequenceService sequenceService;

    @Override
    protected BaseService<Sequence> getBaseService() {
        return sequenceService;
    }

    @Override
    protected String getPackName() {
        return "sys";
    }

    @Override
    protected String getObjectName() {
        return "sequence-list";
    }

    @Override
    protected String getDefaultSort() {
        return "desc_scode";
    }

    /**
     *	验证代码是否存在
     */
    @RequestMapping(value="checkScode.shtml")
    @ResponseBody
    public String checkScode(String oldScode,String scode){
        if(scode != null && scode.equals(oldScode))
            return "true";
        else if(scode != null && sequenceService.findByScode(scode) == null)
            return "true";
        return "false";
    }
}
