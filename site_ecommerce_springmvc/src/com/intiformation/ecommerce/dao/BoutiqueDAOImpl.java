package com.intiformation.ecommerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	 * Ajout d'une catégorie
	 */
	@Transactional
	@Override
	public Long ajouterCategorie(Categorie cat) {
		sf.getCurrentSession().save(cat);
		return cat.getIdCategorie();
	}

	/**
	 * Suppression d'un catgéorie
	 */
	@Transactional
	@Override
	public void supprimerCategrorie(Long idcat) {
		sf.getCurrentSession().delete(getCategorie(idcat));
	}

	/**
	 * Modification  d'une catégorie
	 */
	@Transactional
	@Override
	public void modifierCategorie(Categorie cat) {
		sf.getCurrentSession().update(cat);
	}

	/**
	 * Récup de la liste des catégorie
	 */
	@Transactional
	@Override
	public List<Categorie> listCategories() {
		return sf.getCurrentSession()
				 .createQuery("from categorie")
				 .list();
	}

	/**
	 * Récup d'une catégorie via son ID
	 */
	@Transactional
	@Override
	public Categorie getCategorie(Long idCat) {
		return sf.getCurrentSession().get(Categorie.class, idCat);
	}

	@Transactional
	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		//Recherche de la categorie + stockage dans variable type Categorie
		Categorie categorie = getCategorie(idCat);
		
		// Ajout du produit dans la bdd
		sf.getCurrentSession().save(p);
		
		// Ajout de la categorie dans le produit
		p.setCategorie(categorie);
		
		//Modif du produit
		sf.getCurrentSession().update(p);
		
		//retourne l'id du produit
		return p.getIdProduit();
	}

	@Transactional
	@Override
	public List<Produit> listproduits() {
		return sf.getCurrentSession()
				 .createQuery("from produit")
				 .list();
	}

	@Transactional
	@Override
	public List<Produit> produitsParMotCle(String mc) {
		Query requete = sf.getCurrentSession().createQuery("from produit p where p.designation = :designation");
		requete.setParameter("designation", mc);
		return requete.list();
	}

	@Transactional
	@Override
	public List<Produit> produitsParCategorie(Long idCat) {
		Query requete = sf.getCurrentSession().createQuery("from produit p where p.idProduit = :idProduit");
		requete.setParameter("idProduit", idCat);
		return requete.list();
	}

	@Transactional
	@Override
	public List<Produit> produitsSelectionnes() {
		return null;
	}

	@Transactional
	@Override
	public Produit getProduit(Long idP) {
		return sf.getCurrentSession().get(Produit.class, idP);
	}

	@Transactional
	@Override
	public void supprimerProduit(Long idP) {
		sf.getCurrentSession().delete(getProduit(idP));
	}

	@Transactional
	@Override
	public void modifierProduit(Produit p) {
		sf.getCurrentSession().update(p);
	}

	@Transactional
	@Override
	public void ajouterUser(User user) {
		sf.getCurrentSession().save(user);
	}

	@Transactional
	@Override
	public void attribuerRole(Role r, Long userID) {

		
	}

	@Transactional
	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
