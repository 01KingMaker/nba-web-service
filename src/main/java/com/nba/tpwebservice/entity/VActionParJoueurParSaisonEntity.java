package com.nba.tpwebservice.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "v_action_par_joueur_par_saison", schema = "public", catalog = "port")
public class VActionParJoueurParSaisonEntity {
    @Basic
    @Column(name = "id_saison")
    private String idSaison;
    @Basic
    @Column(name = "id_joueur")
    private String idJoueur;
    @Basic
    @Column(name = "dossart")
    private String dossart;
    @Basic
    @Column(name = "id_equipe_joueur")
    private String idEquipeJoueur;
    @Id
    @Column(name = "id_action_match")
    private Integer idActionMatch;
    @Basic
    @Column(name = "id_action")
    private String idAction;
    @Basic
    @Column(name = "date_action")
    private Timestamp dateAction;
    @Basic
    @Column(name = "valeur")
    private Integer valeur;
    @Basic
    @Column(name = "id_match")
    private String idMatch;
    @Basic
    @Column(name = "id")
    private Integer id;

    public String getIdSaison() {
        return idSaison;
    }

    public void setIdSaison(String idSaison) {
        this.idSaison = idSaison;
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

    public String getIdEquipeJoueur() {
        return idEquipeJoueur;
    }

    public void setIdEquipeJoueur(String idEquipeJoueur) {
        this.idEquipeJoueur = idEquipeJoueur;
    }

    public Integer getIdActionMatch() {
        return idActionMatch;
    }

    public void setIdActionMatch(Integer idActionMatch) {
        this.idActionMatch = idActionMatch;
    }

    public String getIdAction() {
        return idAction;
    }

    public void setIdAction(String idAction) {
        this.idAction = idAction;
    }

    public Timestamp getDateAction() {
        return dateAction;
    }

    public void setDateAction(Timestamp dateAction) {
        this.dateAction = dateAction;
    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VActionParJoueurParSaisonEntity that = (VActionParJoueurParSaisonEntity) o;
        return Objects.equals(idSaison, that.idSaison) && Objects.equals(idJoueur, that.idJoueur) && Objects.equals(dossart, that.dossart) && Objects.equals(idEquipeJoueur, that.idEquipeJoueur) && Objects.equals(idActionMatch, that.idActionMatch) && Objects.equals(idAction, that.idAction) && Objects.equals(dateAction, that.dateAction) && Objects.equals(valeur, that.valeur) && Objects.equals(idMatch, that.idMatch) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSaison, idJoueur, dossart, idEquipeJoueur, idActionMatch, idAction, dateAction, valeur, idMatch, id);
    }
}
