package com.intiformation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.service.IAdminCategoriesMetier;

@Controller
public class AdminCategoriesController {

	/**
	 * Déclaration du Service IAdminCategoriesMetier
	 */
	@Autowired
	private IAdminCategoriesMetier adminCat;

	
	/**
	 * Setter pour l'injection 
	 * @param adminCat
	 */
	public void setAdminCat(IAdminCategoriesMetier adminCategories) {
		this.adminCat = adminCat;
	}
	
	/* ######################################################################## */
	
	@RequestMapping(value = "/categories/liste", method = RequestMethod.GET)
	public String index(ModelMap modeleCategories) {
		
		// Récupération de la liste des catégories de la BDD 
		List<Categorie> listCat = adminCat.listCategories();
		
		// Données à retourner vers la vue 
		modeleCategories.addAttribute("liste_categories_attribut", listCat);
		
		// Renvoi du nom logique de la vue 
		// Résolution de la vue : fonctionnaires  > WEB-INF/views/categories.jsp
		return "categories"; 
	} // End index () 
	
	@RequestMapping(value = "categories/check", method = RequestMethod.POST)
	public String saveCat( ) {
		
		// Ajouter une nouvelle catégorie dans la BDD via le service 
		
		
		return "redirect : /categories/liste"; 
	} // End saveCat
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
