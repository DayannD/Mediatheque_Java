package com.deshayes.mediatheque_java.dto;

import com.deshayes.mediatheque_java.entity.Adresse;
import com.deshayes.mediatheque_java.entity.User;
import com.deshayes.mediatheque_java.enums.Roles;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;
@Data
@Builder
public class UserDto {

    private UUID id;

    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private String motDePasse;

    private Adresse adresse;

    private Roles roles;


    public UserDto fromEntity(User user){
        if (user == null)
            return null;

        return UserDto.builder()
                .id(user.getId())
                .prenom(user.getPrenom())
                .email(user.getEmail())
                .nom(user.getNom())
                .dateDeNaissance(user.getDateDeNaissance())
                .motDePasse(user.getMotDePasse())
                .adresse(user.getAdresse())
                .build();
    }


    public User toEntity(UserDto userDto){
        if (userDto == null)
            return null;

        return User.builder()
                .id(userDto.getId())
                .prenom(userDto.getPrenom())
                .email(userDto.getEmail())
                .nom(userDto.getNom())
                .dateDeNaissance(userDto.getDateDeNaissance())
                .motDePasse(userDto.getMotDePasse())
                .adresse(userDto.getAdresse())
                .build();
        }

}
