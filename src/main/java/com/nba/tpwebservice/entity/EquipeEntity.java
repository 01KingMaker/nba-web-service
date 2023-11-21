package com.nba.tpwebservice.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "equipe", schema = "public", catalog = "port")
public class EquipeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_equipe")
    private String idEquipe;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "ville")
    private String ville;
    @Basic
    @Column(name = "pays")
    private String pays;
    @Basic
    @Column(name = "date_creation")
    private Timestamp dateCreation;

    public String getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipeEntity that = (EquipeEntity) o;
        return Objects.equals(idEquipe, that.idEquipe) && Objects.equals(nom, that.nom) && Objects.equals(ville, that.ville) && Objects.equals(pays, that.pays) && Objects.equals(dateCreation, that.dateCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipe, nom, ville, pays, dateCreation);
    }
}
