package com.deshayes.mediatheque_java.repository;

import com.deshayes.mediatheque_java.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LivreRepository extends JpaRepository<Livre, UUID> {
}
