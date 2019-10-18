package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.future.batch4.devSurabaya.projectphase1.model.constants.BaseEntityConstant;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
public abstract class BaseEntity {
    @Id
    @Column(name = BaseEntityConstant.ID)
    @GeneratedValue(generator = BaseEntityConstant.SYSTEM_UUID)
    @GenericGenerator(name = BaseEntityConstant.SYSTEM_UUID, strategy = BaseEntityConstant.STRATEGY_UUID2)
    private String id;

    @Version
    @Column(name = BaseEntityConstant.VERSION)
    private Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
