package com.softpower.demo.springsession.domain.user.jpa;

import com.softpower.demo.springsession.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserJpa extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
