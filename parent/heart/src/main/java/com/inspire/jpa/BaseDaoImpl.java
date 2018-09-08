package com.inspire.jpa;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import java.io.Serializable;

@NoRepositoryBean
public class BaseDaoImpl <T, ID extends Serializable> extends SimpleJpaRepository<T,ID>
        implements BaseDao<T,ID> {

    private final EntityManager entityManager;

    //父类没有不带参数的构造方法，这里手动构造父类
    public BaseDaoImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
    }

}
