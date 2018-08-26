package com.inspire.serviceUtils;

import com.inspire.service.IParameterService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Component
@Transactional(readOnly = true)
public class TagParamService implements IParameterService {

    @Override
    public String genarateSeqNo(String name) {
        return null;
    }

    @Override
    public Date getServerTime() {
        return null;
    }
}
