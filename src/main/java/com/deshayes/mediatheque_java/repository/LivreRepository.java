package com.deshayes.mediatheque_java.repository;

import com.deshayes.mediatheque_java.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
}
