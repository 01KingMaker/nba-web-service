package com.nba.tpwebservice.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "action", schema = "public", catalog = "port")
public class ActionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_action")
    private String idAction;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "valeur")
    private Integer valeur;

    public String getIdAction() {
        return idAction;
    }

    public void setIdAction(String idAction) {
        this.idAction = idAction;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
        ActionEntity that = (ActionEntity) o;
        return Objects.equals(idAction, that.idAction) && Objects.equals(nom, that.nom) && Objects.equals(valeur, that.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAction, nom, valeur);
    }
}
