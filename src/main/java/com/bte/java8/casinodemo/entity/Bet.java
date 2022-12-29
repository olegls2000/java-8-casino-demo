package com.bte.java8.casinodemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString

@Entity
@Table(name = "bet")
public class Bet {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private Long value;

    @ManyToOne
    private UserAccount userAccount;

    @OneToOne
    private GameResult gameResult;

}
