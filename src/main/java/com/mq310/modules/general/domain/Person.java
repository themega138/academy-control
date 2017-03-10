package com.mq310.modules.general.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Created by moises on 12/02/17.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person extends GeneralEntity{
}
