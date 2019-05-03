package com.intiformation.ecommerce.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="commande")
@Table(name="commandes")
public class Commande {
	/* ################################################################ */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_commande")
	private Long idCommande;
	
	@Column(name = "date_com")
	private Date dateCommande;

	/**
	 * Many commande to many produit
	 * 
	 * Commande = côté esclave
	 */
	@ManyToMany(mappedBy = "listecommande")
	private List<Produit> listeproduit;
	
	/**
	 * many commande to one client
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "client_id", referencedColumnName = "id_client")
	private Client client;
	
	
	/* ################################################################ */
	public Commande() {
		super();
	}

	public Commande(Long idCommande, Date dateCommande) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
	}

	/* ################################################################ */
	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	
	public List<Produit> getListeproduit() {
		return listeproduit;
	}

	public void setListeproduit(List<Produit> listeproduit) {
		this.listeproduit = listeproduit;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", dateCommande=" + dateCommande + ", listeproduit="
				+ listeproduit + ", client=" + client + "]";
	}

	

}
