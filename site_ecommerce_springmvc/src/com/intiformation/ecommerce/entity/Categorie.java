package com.intiformation.ecommerce.entity;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "categorie")
@Table(name = "categories")
public class Categorie {

	/* ################################################################ */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categorie")
	private Long idCategorie;
	
	@Column(name = "nom_cat")
	private String nomCategorie;
	
	@Column(name = "photo_cat")
	private Byte[] photo;
	
	@Column(name = "description_cat")
	private String description;

	
	/**
	 * One categorie to many produit
	 */
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categorie" )
	List<Produit> produit;
	
	
	/* ################################################################ */

	public Categorie() {
		super();
	}

	public Categorie(Long idCategorie, String nomCategorie, Byte[] photo, String description) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
	}

	public Categorie(String nomCategorie, Byte[] photo, String description) {
		super();
		this.nomCategorie = nomCategorie;
		this.photo = photo;
		this.description = description;
	}

	/* ################################################################ */

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public Byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public List<Produit> getProduit() {
		return produit;
	}

	public void setProduit(List<Produit> produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", photo="
				+ Arrays.toString(photo) + ", description=" + description + ", produit=" + produit + "]";
	}

	

}
