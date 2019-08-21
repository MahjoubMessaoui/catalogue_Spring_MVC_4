package com.whitecape.catalogue_mvc_4.controller;

import com.whitecape.catalogue_mvc_4.entites.Produit;
import com.whitecape.catalogue_mvc_4.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("produit")
public class ProduitController {
@Autowired
   private ProduitRepository produitRepository;


@GetMapping("index")
    public String Home(Model model,
        @RequestParam(name="page",defaultValue = "0")int p,
        @RequestParam(name="size",defaultValue = "5")int s,
                       @RequestParam(name="motcle",defaultValue = "")String mc){
     Page<Produit> produitpage=
             produitRepository.chercher("%"+mc+"%",new PageRequest(p,s));
    model.addAttribute("listproduits",produitpage.getContent());
 int[] pages=new int[produitpage.getTotalPages()];
 model.addAttribute("pages",pages);
 model.addAttribute("size",s);
 model.addAttribute("pageCaurante",p);
 model.addAttribute("motcle",mc);
        return "produits";
    }
 @GetMapping("/delete")
    public String delete(Long id,String motcle,int page, int size){
    produitRepository.deleteById(id);
    return "redirect:index?page="+page+"&size="+size+"&motcle="+motcle ;
    }
}
