package com.bte.java8.casinodemo.repository;

import com.bte.java8.casinodemo.entity.BetResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetResultRepository extends JpaRepository<BetResult, Long> {

    BetResult findOneByUserAccountIdOrderByIdDesc(Long userAccountId);
}
