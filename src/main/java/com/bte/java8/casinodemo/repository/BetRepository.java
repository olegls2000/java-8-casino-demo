package com.bte.java8.casinodemo.repository;

import com.bte.java8.casinodemo.entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepository
        extends JpaRepository<Bet, Long> {
}
