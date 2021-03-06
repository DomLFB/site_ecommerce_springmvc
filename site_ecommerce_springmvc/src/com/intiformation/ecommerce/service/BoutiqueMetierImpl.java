package com.intiformation.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intiformation.ecommerce.dao.IBoutiqueDao;
import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.Panier;
import com.intiformation.ecommerce.entity.Produit;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;

@Service
public class BoutiqueMetierImpl implements IAdminProduitMetier {
	/* ##################################################################### */
	// Déclaration du DAO pour pouvoir injecter Spring
	private IBoutiqueDao iBoutiqueDAO;

	/* ##################################################################### */
	/**
	 * Setter pour injection Spring
	 * 
	 * @param iBoutiqueDAO
	 */
	public void setiBoutiqueDAO(IBoutiqueDao iBoutiqueDAO) {
		this.iBoutiqueDAO = iBoutiqueDAO;
	}

	/* ##################################################################### */

	@Transactional
	@Override
	public List<Categorie> listCategories() {
		return iBoutiqueDAO.listCategories();
	}

	@Transactional
	@Override
	public Categorie getCategorie(Long idCat) {
		return iBoutiqueDAO.getCategorie(idCat);
	}

	@Transactional
	@Override
	public List<Produit> listProducts() {
		return iBoutiqueDAO.listproduits();
	}

	@Transactional
	@Override
	public List<Produit> productsById(String mc) {
		return iBoutiqueDAO.produitsParMotCle(mc);
	}

	@Transactional
	@Override
	public List<Produit> productsByCategories(Long idCat) {
		return iBoutiqueDAO.produitsParCategorie(idCat);
	}

	@Transactional
	@Override
	public List<Produit> productsSelected() {
		return iBoutiqueDAO.produitsSelectionnes();
	}

	@Transactional
	@Override
	public Produit getProduct(Long idP) {
		return iBoutiqueDAO.getProduit(idP);
	}

	@Transactional
	@Override
	public Commande CommandSaving(Panier p, Client c) {
		return iBoutiqueDAO.enregistrerCommande(p, c);
	}

	@Transactional
	@Override
	public Long addCategorie(Categorie c) {
		return iBoutiqueDAO.ajouterCategorie(c);
	}

	@Transactional
	@Override
	public void deleteCategrorie(Long idcat) {
		iBoutiqueDAO.supprimerCategrorie(idcat);

	}

	@Transactional
	@Override
	public void updateCategorie(Categorie c) {
		iBoutiqueDAO.modifierCategorie(c);

	}

	@Transactional
	@Override
	public void addUser(User u) {
		iBoutiqueDAO.ajouterUser(u);

	}

	@Transactional
	@Override
	public void getRole(Role r, Long userID) {
		iBoutiqueDAO.attribuerRole(r, userID);

	}

}
