package com.nba.tpwebservice.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "v_joueur_saison", schema = "public", catalog = "port")
public class VJoueurSaisonEntity {
    @Basic
    @Column(name = "debut")
    private Timestamp debut;
    @Basic
    @Column(name = "fin")
    private Timestamp fin;
    @Basic
    @Column(name = "id_saison")
    private String idSaison;
    @Basic
    @Column(name = "dossart")
    private String dossart;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    private String prenom;
    @Basic
    @Column(name = "date_naissance")
    private Timestamp dateNaissance;
    @Id
    @Column(name = "id_joueur")
    private String idJoueur;

    @Transient
    JoueurEntity joueur;
    @Column(name = "id")
    private Long id;

    public void setJoueur(JoueurEntity joueur) {
        this.joueur = joueur;
    }

    public JoueurEntity getJoueur() {
        return joueur;
    }

    public Timestamp getDebut() {
        return debut;
    }

    public void setDebut(Timestamp debut) {
        this.debut = debut;
    }

    public Timestamp getFin() {
        return fin;
    }

    public void setFin(Timestamp fin) {
        this.fin = fin;
    }

    public String getIdSaison() {
        return idSaison;
    }

    public void setIdSaison(String idSaison) {
        this.idSaison = idSaison;
    }

    public String getDossart() {
        return dossart;
    }

    public void setDossart(String dossart) {
        this.dossart = dossart;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Timestamp getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Timestamp dateNaissance) {
        this.dateNaissance = dateNaissance;
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
        VJoueurSaisonEntity that = (VJoueurSaisonEntity) o;
        return Objects.equals(debut, that.debut) && Objects.equals(fin, that.fin) && Objects.equals(idSaison, that.idSaison) && Objects.equals(dossart, that.dossart) && Objects.equals(nom, that.nom) && Objects.equals(prenom, that.prenom) && Objects.equals(dateNaissance, that.dateNaissance) && Objects.equals(idJoueur, that.idJoueur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debut, fin, idSaison, dossart, nom, prenom, dateNaissance, idJoueur);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
