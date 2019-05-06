package com.intiformation.ecommerce.service;

import com.intiformation.ecommerce.entity.Produit;

public interface IAdminCategoriesMetier extends IAdminProduitMetier {

	public Long addProduct(Produit p, Long idCat);

	public void deleteProduct(Long idP);

	public void updateProduct(Produit p);
}
