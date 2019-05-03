package com.intiformation.ecommerce.service;

import com.intiformation.ecommerce.entity.Produit;

public interface IAdminCategoriesMetier extends IAdminProduitMetier {

	public Long ajouterProduit(Produit p, Long idCat);

	public void supprimerProduit(Long idP);

	public void modifierProduit(Produit p);
}
