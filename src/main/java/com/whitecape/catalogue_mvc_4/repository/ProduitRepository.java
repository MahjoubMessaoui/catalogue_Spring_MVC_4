package com.whitecape.catalogue_mvc_4.repository;

import com.whitecape.catalogue_mvc_4.entites.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface ProduitRepository extends JpaRepository<Produit,Long> {

    @Query("Select p from Produit p where p.desig like:x")

    Page<Produit> chercher(@Param("x") String mc, Pageable pageable);



}
