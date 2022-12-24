package com.deshayes.mediatheque_java.entity;

import com.deshayes.mediatheque_java.enums.Roles;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "Utilisateur")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UUID")
    private Long UUID;


    @Column(name = "nom")
    @NotBlank @NotNull
    private String nom;

    @Column(name = "prenom")
    @NotBlank @NotNull
    private String prenom;

    @Column(name = "email")
    @NotNull @NotBlank @Email
    private String email;

    @Column(name = "datedenaissance")
    private Instant dateDeNaissance;

    @Column(name = "motdepasse")
    private String motDePasse;

    @Embedded
    private Adresse adresse;

    @Enumerated(EnumType.STRING)
    private Roles roles = Roles.USER;

    @OneToMany(mappedBy = "user")
    private List<Emprunt> emprunts;
}
