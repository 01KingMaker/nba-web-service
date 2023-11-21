package com.nba.tpwebservice.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "action_match", schema = "public", catalog = "port")
public class ActionMatchEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_action_match")
    private int idActionMatch;
    @Basic
    @Column(name = "id_equipe_joueur")
    private String idEquipeJoueur;
    @Basic
    @Column(name = "id_action")
    private String idAction;
    @Basic
    @Column(name = "date_action")
    private Timestamp dateAction;
    @Basic
    @Column(name = "valeur")
    private Integer valeur;

    public int getIdActionMatch() {
        return idActionMatch;
    }

    public void setIdActionMatch(int idActionMatch) {
        this.idActionMatch = idActionMatch;
    }

    public String getIdEquipeJoueur() {
        return idEquipeJoueur;
    }

    public void setIdEquipeJoueur(String idEquipeJoueur) {
        this.idEquipeJoueur = idEquipeJoueur;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionMatchEntity that = (ActionMatchEntity) o;
        return idActionMatch == that.idActionMatch && Objects.equals(idEquipeJoueur, that.idEquipeJoueur) && Objects.equals(idAction, that.idAction) && Objects.equals(dateAction, that.dateAction) && Objects.equals(valeur, that.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idActionMatch, idEquipeJoueur, idAction, dateAction, valeur);
    }
}
