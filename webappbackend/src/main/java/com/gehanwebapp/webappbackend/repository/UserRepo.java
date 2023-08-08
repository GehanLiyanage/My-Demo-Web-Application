package com.gehanwebapp.webappbackend.repository;

import com.gehanwebapp.webappbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
