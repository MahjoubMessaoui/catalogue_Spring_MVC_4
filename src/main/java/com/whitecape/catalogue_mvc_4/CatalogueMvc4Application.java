package com.whitecape.catalogue_mvc_4;

import com.whitecape.catalogue_mvc_4.entites.Produit;
import com.whitecape.catalogue_mvc_4.repository.ProduitRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CatalogueMvc4Application {

    public static void main(String[] args) {   SpringApplication.run(CatalogueMvc4Application.class, args);
    /*  ApplicationContext ctx =

        ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
        produitRepository.save(new Produit("imprimante",450,4));
        produitRepository.save(new Produit("ordinateur",1500,3));
        produitRepository.save(new Produit("imp",1200,5));
        produitRepository.findAll().forEach(p-> System.out.println(p.getDesig()));
        produitRepository.findAll().forEach(produit -> System.out.println(produit.getPrix()));
    */
    }

}
