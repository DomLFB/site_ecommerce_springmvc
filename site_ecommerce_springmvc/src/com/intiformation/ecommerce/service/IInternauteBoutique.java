package com.intiformation.ecommerce.service;

import java.util.List;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.Panier;
import com.intiformation.ecommerce.entity.Produit;

public interface IInternauteBoutique {

	public List<Categorie> listCategories();

	public Categorie getCategorie(Long idCat);

	public List<Produit> listProducts();

	public List<Produit> productsById(String mc);

	public List<Produit> productsByCategories(Long idCat);

	public List<Produit> productsSelected();

	public Produit getProduct(Long idP);

	public Commande CommandSaving(Panier p, Client c);
}
