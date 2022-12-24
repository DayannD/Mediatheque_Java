package com.deshayes.mediatheque_java.repository;

import com.deshayes.mediatheque_java.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
