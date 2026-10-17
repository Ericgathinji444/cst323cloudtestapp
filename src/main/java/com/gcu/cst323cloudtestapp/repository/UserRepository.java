package com.gcu.cst323cloudtestapp.repository;

import com.gcu.cst323cloudtestapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}