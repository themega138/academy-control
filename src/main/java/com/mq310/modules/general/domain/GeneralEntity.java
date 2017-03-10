package com.mq310.modules.general.domain;

import com.vaadin.data.util.ObjectProperty;

import javax.persistence.*;

/**
 * Created by moises on 12/02/17.
 */
@MappedSuperclass
public abstract class GeneralEntity {

    private ObjectProperty<Long> idProperty = new ObjectProperty<Long>(0L);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId(){
        return idProperty.getValue();
    }

    public void setId(Long id){
        idProperty.setValue(id);
    }

    @Transient
    public ObjectProperty<Long> getIdProperty() {
        return idProperty;
    }
}
