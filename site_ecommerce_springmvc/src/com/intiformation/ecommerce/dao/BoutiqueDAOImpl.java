package com.intiformation.ecommerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.Panier;
import com.intiformation.ecommerce.entity.Produit;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;

@Repository
public class BoutiqueDAOImpl implements IBoutiqueDao {

	// declaration de la session hibernate
	@Autowired
	private SessionFactory sf;

	/**
	 * injection spring
	 * 
	 * @param sf
	 */
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	/**
	 * Ajout d'une cat�gorie
	 */
	@Override
	public Long ajouterCategorie(Categorie cat) {
		sf.getCurrentSession().save(cat);
		return cat.getIdCategorie();
	}

	/**
	 * Suppression d'un catg�orie
	 */
	@Override
	public void supprimerCategrorie(Long idcat) {
		sf.getCurrentSession().delete(getCategorie(idcat));
	}

	/**
	 * Modification  d'une cat�gorie
	 */
	@Override
	public void modifierCategorie(Categorie cat) {
		sf.getCurrentSession().update(cat);
	}

	/**
	 * R�cup de la liste des cat�gorie
	 */
	@Override
	public List<Categorie> listCategories() {
		return sf.getCurrentSession()
				 .createQuery("from categorie")
				 .list();
	}

	/**
	 * R�cup d'une cat�gorie via son ID
	 */
	@Override
	public Categorie getCategorie(Long idCat) {
		return sf.getCurrentSession().get(Categorie.class, idCat);
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {

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
