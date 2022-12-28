package com.deshayes.mediatheque_java.dto;

import com.deshayes.mediatheque_java.entity.Livre;
import lombok.Builder;

import java.util.Date;
import java.util.UUID;
@Builder
public class LivreDto {

    private UUID id;

    private String title;

    private Date dateParution;

    private String description;

    private String file;

    private String auteur;

    private String disponible;

    private EmpruntDto emprunt;



    public LivreDto fromEntity(Livre livre){
        if(livre == null)
            return null;

        String dispo = "";

        if (livre.isDispo()){
            dispo = "disponible";
        }else {
            dispo = "le livre n'est pas disponible";
        }
        LivreDto livredto = LivreDto.builder()
                .id(livre.getId())
                .title(livre.getTitle())
                .auteur(livre.getAuteur())
                .description(livre.getDescrition())
                .file(livre.getFile())
                .dateParution(livre.getDateParution())
                .emprunt(fromEntity(livre.getEmprunt()))
                .build();

        if (livre.isDispo()){
            livredto.disponible = "disponible";
        }else {
            livredto.disponible = "non disponible";
        }

        if (!livre.isDispo()){
            li
        }


    }

    public static String
}
