package com.nba.tpwebservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "v_joueur_saison", schema = "public", catalog = "port")
public class VJoueurSaisonEntity {

    @Getter
    @Setter
    @Column(name = "debut")
    private Timestamp debut;
    @Getter
    @Setter
    @Column(name = "fin")
    private Timestamp fin;
    @Getter
    @Setter
    @Column(name = "id_saison")
    private String idSaison;
    @Getter
    @Setter
    @Column(name = "dossart")
    private String dossart;
    @Id
    @Getter
    @Setter
    @Column(name = "id_joueur")
    private String idJoueur;

    @Getter
    @Setter
    @Transient
    JoueurEntity joueur;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VJoueurSaisonEntity that = (VJoueurSaisonEntity) o;
        return Objects.equals(debut, that.debut) && Objects.equals(fin, that.fin) && Objects.equals(idSaison, that.idSaison) && Objects.equals(dossart, that.dossart) && Objects.equals(idJoueur, that.idJoueur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debut, fin, idSaison, dossart,  idJoueur);
    }

}
