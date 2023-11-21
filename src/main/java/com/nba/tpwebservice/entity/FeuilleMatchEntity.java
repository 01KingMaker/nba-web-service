package com.nba.tpwebservice.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "feuille_match", schema = "public", catalog = "port")
public class FeuilleMatchEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_feuille_match")
    private int idFeuilleMatch;
    @Basic
    @Column(name = "id_match")
    private String idMatch;
    @Basic
    @Column(name = "id_equipe_joueur")
    private String idEquipeJoueur;

    public int getIdFeuilleMatch() {
        return idFeuilleMatch;
    }

    public void setIdFeuilleMatch(int idFeuilleMatch) {
        this.idFeuilleMatch = idFeuilleMatch;
    }

    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    public String getIdEquipeJoueur() {
        return idEquipeJoueur;
    }

    public void setIdEquipeJoueur(String idEquipeJoueur) {
        this.idEquipeJoueur = idEquipeJoueur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeuilleMatchEntity that = (FeuilleMatchEntity) o;
        return idFeuilleMatch == that.idFeuilleMatch && Objects.equals(idMatch, that.idMatch) && Objects.equals(idEquipeJoueur, that.idEquipeJoueur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFeuilleMatch, idMatch, idEquipeJoueur);
    }
}
