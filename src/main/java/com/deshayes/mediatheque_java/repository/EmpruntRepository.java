package com.deshayes.mediatheque_java.repository;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmpruntRepository extends JpaRepository<EmpruntRepository, UUID> {
}
