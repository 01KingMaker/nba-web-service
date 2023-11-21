package com.nba.tpwebservice.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "equipe_joueur", schema = "public", catalog = "port")
public class EquipeJoueurEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_equipe_joueur")
    private String idEquipeJoueur;
    @Basic
    @Column(name = "id_equipe")
    private String idEquipe;
    @Basic
    @Column(name = "id_joueur")
    private String idJoueur;
    @Basic
    @Column(name = "dossart")
    private String dossart;
    @Basic
    @Column(name = "id_saison")
    private String idSaison;

    public String getIdEquipeJoueur() {
        return idEquipeJoueur;
    }

    public void setIdEquipeJoueur(String idEquipeJoueur) {
        this.idEquipeJoueur = idEquipeJoueur;
    }

    public String getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getIdJoueur() {
        return idJoueur;
    }

    public void setIdJoueur(String idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getDossart() {
        return dossart;
    }

    public void setDossart(String dossart) {
        this.dossart = dossart;
    }

    public String getIdSaison() {
        return idSaison;
    }

    public void setIdSaison(String idSaison) {
        this.idSaison = idSaison;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipeJoueurEntity that = (EquipeJoueurEntity) o;
        return Objects.equals(idEquipeJoueur, that.idEquipeJoueur) && Objects.equals(idEquipe, that.idEquipe) && Objects.equals(idJoueur, that.idJoueur) && Objects.equals(dossart, that.dossart) && Objects.equals(idSaison, that.idSaison);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipeJoueur, idEquipe, idJoueur, dossart, idSaison);
    }
}
