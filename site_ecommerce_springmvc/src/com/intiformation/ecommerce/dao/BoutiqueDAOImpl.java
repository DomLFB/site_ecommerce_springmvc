package com.intiformation.ecommerce.dao;

import java.util.List;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.Panier;
import com.intiformation.ecommerce.entity.Produit;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;

public class BoutiqueDAOImpl implements IBoutiqueDao{

	@Override
	public Long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> listCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCategrorie(Long idcat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> listproduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitsSelectionnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduit(Long idP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerProduit(Long idP) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerRole(Role r, Long userID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
