package com.nba.tpwebservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "action_match", schema = "public", catalog = "port")
public class ActionMatchEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_action_match")
    @Getter
    @Setter
    private int idActionMatch;
    @Basic
    @Getter
    @Setter
    @Column(name = "id_equipe_joueur")
    private String idEquipeJoueur;
    @Basic
    @Getter
    @Setter
    @Column(name = "id_action")
    private String idAction;
    @Basic
    @Getter
    @Setter
    @Column(name = "date_action")
    private Timestamp dateAction;
    @Basic
    @Getter
    @Setter
    @Column(name = "valeur")
    private Integer valeur;
    @Getter
    @Setter
    @Column(name = "id_match")
    private String idMatch;

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
