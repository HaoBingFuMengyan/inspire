package com.inspire;


import com.inspire.sys.Sequence;
import com.inspire.sys.SequenceDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class JunitTest {

    @Autowired
    private SequenceDao sequenceDao;

    @Test
    public void test(){
        List<Sequence> list = sequenceDao.findAll();

        log.info(String.valueOf(list.size()));

        Page<Sequence> pagelist = sequenceDao.findAll(new PageRequest(0,100));

        log.info(String.valueOf(pagelist.getContent().size()));

        Specification<Sequence> spec = null;
        Page<Sequence> page = sequenceDao.findAll(spec,new PageRequest(0,1000));

        log.info(String.valueOf(page.getContent().size()));
    }
}
