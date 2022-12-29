package com.bte.java8.casinodemo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString
@Entity
@Table(name = "game_result")
public class GameResult {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private BetItem position1;
    private BetItem position2;
    private BetItem position3;
    @Column(name = "game_time")
    private LocalDateTime gameTime;
}
