package com.inspire.hy;

import com.google.common.collect.Lists;
import com.inspire.hyBase.ActorBase;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hy_actor")
public class Actor extends ActorBase {


    private List<Right> rightList = Lists.newArrayList();

    @ManyToMany()
    @JoinTable(name = "hy_actorright", joinColumns = {@JoinColumn(name = "sroleid")}, inverseJoinColumns = {@JoinColumn(name = "spurviewid")})
    @Fetch(FetchMode.SUBSELECT)
    @Lazy(true)
    public List<Right> getRightList() {
        return rightList;
    }

    public void setRightList(List<Right> rightList) {
        this.rightList = rightList;
    }
}
