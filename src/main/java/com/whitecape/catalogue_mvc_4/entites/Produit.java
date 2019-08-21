package com.whitecape.catalogue_mvc_4.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Produit implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String desig;
    private double prix;
    private int quantite;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }


    public Produit(String desig, double prix, int quantite) {
        this.desig = desig;
        this.prix = prix;
        this.quantite = quantite;
    }


    public Produit() {
    }
}
