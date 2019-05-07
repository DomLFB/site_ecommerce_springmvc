package com.intiformation.ecommerce.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.intiformation.ecommerce.entity.Produit;
import com.intiformation.ecommerce.service.IAdminProduitMetier;

@Controller
public class AdminProduitController {

	@Autowired
	private IAdminProduitMetier adminProduit;

	/**
	 * pour injection spring
	 * @param boutiqueMetier
	 */
	public void setAdminProduit(IAdminProduitMetier adminProduit) {
		this.adminProduit = adminProduit;
	}

	@RequestMapping(value="/produits/liste", method = RequestMethod.GET)
	public String index(ModelMap modelProduit) {
		
		//Récup de la liste des produits
		List<Produit> listProduits = adminProduit.listProducts();
		
		//Données à retourner vers la vue
		modelProduit.addAttribute("liste_produits_attribut", listProduits);
		
		//Renvoi du nom logique de la vue
		return "produits";
	}//fin index
	
	/**
	 * permet d'afficher le formulaire d'ajout du produit
	 * @return
	 */
	@RequestMapping(value="/formAjoutProduit", method=RequestMethod.GET)
	public String formulaireAjout(Model attribut) {
		
		
		
		return "";
		
	}//fin formulaireAjout
	
	
	/**
	 * Ajout d'un produit
	 * @return
	 */
	@RequestMapping(value="/ajouterProduit", method=RequestMethod.POST)
	public String saveProd() {
		return "";
	}
	
	
	
}
