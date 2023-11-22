package com.nba.tpwebservice.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "match", schema = "public", catalog = "port")
public class MatchEntity {
    @Id
    @Column(name = "id_match")
    private String idMatch;
    @Basic
    @Column(name = "id_equipe1")
    private String idEquipe1;
    @Basic
    @Column(name = "id_equipe2")
    private String idEquipe2;
    @Basic
    @Column(name = "point_equipe1")
    private Integer pointEquipe1;
    @Basic
    @Column(name = "point_equipe2")
    private Integer pointEquipe2;
    public MatchEntity(){
        this.pointEquipe1 = 0;
        this.pointEquipe2 = 0;
    }

    public String getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(String idMatch) {
        this.idMatch = idMatch;
    }

    public String getIdEquipe1() {
        return idEquipe1;
    }

    public void setIdEquipe1(String idEquipe1) {
        this.idEquipe1 = idEquipe1;
    }

    public String getIdEquipe2() {
        return idEquipe2;
    }

    public void setIdEquipe2(String idEquipe2) {
        this.idEquipe2 = idEquipe2;
    }

    public Integer getPointEquipe1() {
        return pointEquipe1;
    }

    public void setPointEquipe1(Integer pointEquipe1) {
        this.pointEquipe1 = pointEquipe1;
    }

    public Integer getPointEquipe2() {
        return pointEquipe2;
    }

    public void setPointEquipe2(Integer pointEquipe2) {
        this.pointEquipe2 = pointEquipe2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchEntity that = (MatchEntity) o;
        return Objects.equals(idMatch, that.idMatch) && Objects.equals(idEquipe1, that.idEquipe1) && Objects.equals(idEquipe2, that.idEquipe2) && Objects.equals(pointEquipe1, that.pointEquipe1) && Objects.equals(pointEquipe2, that.pointEquipe2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatch, idEquipe1, idEquipe2, pointEquipe1, pointEquipe2);
    }
}
