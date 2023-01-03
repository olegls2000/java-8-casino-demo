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
@Table(name = "bet_result")
public class BetResult {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "balance")
    private Long balance;

    @ManyToOne
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    @OneToOne
    @JoinColumn(name = "bet_id")
    private Bet bet;

}
