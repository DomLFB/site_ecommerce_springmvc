package com.intiformation.ecommerce.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "produit")
@Table(name = "produits")
public class Produit {

	/* ################################################################ */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produit")
	private Long idProduit;
	
	@Column(name = "designation_prod")
	private String designation;
	
	@Column(name = "description_prod")
	private String description;
	
	@Column(name = "prix_prod")
	private double prix;
	
	@Column(name = "quantite_prod")
	private int quantite;
	
	@Column(name = "selection_prod")
	private boolean selectionne;
	
	@Column(name = "photo_prod")
	private String photo;

	/**
	 * Many produit to one categorie
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "categorie_id", referencedColumnName = "id_categorie")
	private Categorie categorie;

	/**
	 * Many produit to many commande
	 * 
	 * Produit = coté maître
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "produit_assoc_commande", 
			   joinColumns = @JoinColumn(name = "produit_id"), 
			   inverseJoinColumns = @JoinColumn(name = "commande_id"))
	private List<Commande> listecommande;
	
	/* ################################################################ */
	public Produit() {
		super();
	}

	public Produit(Long idProduit, String designation, String description, double prix, int quantite,
			boolean selectionne, String photo) {
		super();
		this.idProduit = idProduit;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
	}

	public Produit(String designation, String description, double prix, int quantite, boolean selectionne,
			String photo) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
		this.selectionne = selectionne;
		this.photo = photo;
	}

	/* ################################################################ */
	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public boolean isSelectionne() {
		return selectionne;
	}

	public void setSelectionne(boolean selectionne) {
		this.selectionne = selectionne;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Commande> getListecommande() {
		return listecommande;
	}

	public void setListecommande(List<Commande> listecommande) {
		this.listecommande = listecommande;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", designation=" + designation + ", description=" + description
				+ ", prix=" + prix + ", quantite=" + quantite + ", selectionne=" + selectionne + ", photo=" + photo
				+ ", categorie=" + categorie + ", listecommande=" + listecommande + "]";
	}

	

}
