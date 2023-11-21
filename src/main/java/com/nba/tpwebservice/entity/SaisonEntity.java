package com.nba.tpwebservice.entity;

import com.nba.tpwebservice.repository.EquipeRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "saison", schema = "public", catalog = "port")
@Getter
@Setter

public class SaisonEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_saison")
    private String idSaison;
    @Basic
    @Column(name = "details")
    private String details;
    @Basic
    @Column(name = "debut")
    private Timestamp debut;
    @Basic
    @Column(name = "fin")
    private Timestamp fin;

    @Transient
    List<EquipeEntity> listEquipe;

    @Transient
    List<MatchEntity> listMatch;

    public String getIdSaison() {
        return idSaison;
    }

    public void setIdSaison(String idSaison) {
        this.idSaison = idSaison;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaisonEntity that = (SaisonEntity) o;
        return Objects.equals(idSaison, that.idSaison) && Objects.equals(details, that.details) && Objects.equals(debut, that.debut) && Objects.equals(fin, that.fin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSaison, details, debut, fin);
    }
}
