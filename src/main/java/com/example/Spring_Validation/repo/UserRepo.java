package com.example.Spring_Validation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_Validation.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
