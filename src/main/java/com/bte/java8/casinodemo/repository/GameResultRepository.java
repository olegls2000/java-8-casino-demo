package com.bte.java8.casinodemo.repository;

import com.bte.java8.casinodemo.entity.GameResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameResultRepository
        extends JpaRepository<GameResult, Long> {
}
