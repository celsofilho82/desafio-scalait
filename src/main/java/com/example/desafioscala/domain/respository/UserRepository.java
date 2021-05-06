package com.example.desafioscala.domain.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.desafioscala.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
