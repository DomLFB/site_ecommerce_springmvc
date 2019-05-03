package com.intiformation.ecommerce.entity;

public class LigneCommande {
	/* ################################################################ */
	private int quantite;
	private int prix;

	/* ################################################################ */
	public LigneCommande() {
		super();
	}

	public LigneCommande(int quantite, int prix) {
		super();
		this.quantite = quantite;
		this.prix = prix;
	}

	/* ################################################################ */
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "LigneCommande [quantite=" + quantite + ", prix=" + prix + "]";
	}

}
