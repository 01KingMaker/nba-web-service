package com.nba.tpwebservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "v_match_joueur", schema = "public", catalog = "port")
public class VMatchJoueurEntity {
    @Basic
    @Getter
    @Setter
    @Column(name = "nombre")
    private Long nombre;
    @Basic
    @Column(name = "id_equipe_joueur")
    private String idEquipeJoueur;
    @Id
    @Column(name = "id_saison")
    private String idSaison;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "id_joueur")
    private String idJoueur;

    public String getIdEquipeJoueur() {
        return idEquipeJoueur;
    }

    public void setIdEquipeJoueur(String idEquipeJoueur) {
        this.idEquipeJoueur = idEquipeJoueur;
    }

    public String getIdSaison() {
        return idSaison;
    }

    public void setIdSaison(String idSaison) {
        this.idSaison = idSaison;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(String idJoueur) {
        this.idJoueur = idJoueur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VMatchJoueurEntity that = (VMatchJoueurEntity) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(idEquipeJoueur, that.idEquipeJoueur) && Objects.equals(idSaison, that.idSaison) && Objects.equals(nom, that.nom) && Objects.equals(idJoueur, that.idJoueur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, idEquipeJoueur, idSaison, nom, idJoueur);
    }
}
