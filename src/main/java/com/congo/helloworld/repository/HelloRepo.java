package com.congo.helloworld.repository;

import com.congo.helloworld.entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepo extends JpaRepository<Hello, Long> {

}
