package com.bte.java8.casinodemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString

//@Entity
@Table(name = "bet_result")
public class BetResult {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private Long balance;
    private UserAccount userAccount;

}
