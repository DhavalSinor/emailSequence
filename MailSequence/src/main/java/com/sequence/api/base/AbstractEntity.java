package com.sequence.api.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Nawaz
 */
@Data
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 5810148605693053142L;

    /**
     * Created date for this entity. This would be auto populated.
     */
    @Column(name = "SYS_CREATE_TIME")
    private Date createdDate;

    /**
     * Created date for this entity. This would be auto populated.
     */
    @Column(name = "SYS_UPDATE_TIME")
    private Date updatedDate;

    /**
     * Created by for this entity
     */
    @Column(name = "SYS_CREATED_BY")
    private String createdBy;

    /**
     * Updated By for this entity
     */
    @Column(name = "SYS_UPDATED_BY")
    private String updatedBy;

    /**
     * Automatically add create date
     */
    @PrePersist
    public void prePersist() {
        this.createdDate = new Date();
    }

    /**
     * Automatically update date
     */
    @PreUpdate
    public void preUpdate() {
        this.updatedDate = new Date();
    }
}