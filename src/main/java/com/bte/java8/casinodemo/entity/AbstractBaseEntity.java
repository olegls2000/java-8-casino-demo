package com.bte.java8.casinodemo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
public abstract class AbstractBaseEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
}
