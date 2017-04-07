package com.thoughtworks.gaia.product.model;

import com.thoughtworks.gaia.common.jpa.IdBaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by heming on 4/7/17.
 */
@Entity
@Table(name="A")
public class AModel extends IdBaseModel{
    @Column(name="name",length = 64,nullable = false)
    private String name;
    @Column(name="time_created",nullable = false,updatable = false)
    private Date time_created;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime_created() {
        return time_created;
    }

    public void setTime_created(Date time_created) {
        this.time_created = time_created;
    }
}
