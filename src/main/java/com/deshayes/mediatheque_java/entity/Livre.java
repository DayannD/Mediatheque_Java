package com.deshayes.mediatheque_java.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private Long id;

    @Column(name = "Title",length = 255)
    @NotBlank @NotNull
    private String title;

    @Column(name = "Date Parution")
    @NotNull
    private Date dateParution;

    @Column(name = "Description",length = 255)
    @NotBlank @NotNull
    private String descrition;

    @Column(name = "File",length = 255)
    @NotBlank @NotNull
    private String file;

    @Column(name = "Auteur",length = 255)
    @NotBlank @NotNull
    private String auteur;

    @Column(name = "Disponible")
    @NotNull
    private boolean isDispo;

    @NotNull
    @OneToOne
    private Emprunt emprunt;
}
