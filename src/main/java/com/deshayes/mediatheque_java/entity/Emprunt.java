package com.deshayes.mediatheque_java.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private UUID id;

    @Column(name = "Date")
    @NotNull
    private Date date;

    @ManyToOne
    private User user;

    @OneToOne
    @JoinColumn(name = "emprunt")
    private Livre livre;

    @Column(name = "Loan")
    @NotNull
    private boolean isLoan;

    @Column(name = "Rendering")
    @NotNull
    private boolean isRendering;

    @Column(name = "Loat at")
    @NotNull
    private Date loanAt;



}
