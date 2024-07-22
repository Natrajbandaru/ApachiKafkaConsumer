package com.javateche.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestingRepo extends JpaRepository<TestingJavatecheEntity,Integer> {


}
