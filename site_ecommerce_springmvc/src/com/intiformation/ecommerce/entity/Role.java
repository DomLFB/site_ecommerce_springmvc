package com.intiformation.ecommerce.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "role")
@Table(name = "roles")
public class Role {

	/* ################################################################ */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_role")
	private Long idRole;
	
	@Column(name = "nom_role")
	private String roleName;

	/**
	 * Many role to one user
	 */
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id_user")
	private User utilisateur;
	
	
	/* ################################################################ */
	public Role() {
		super();
	}

	public Role(Long idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
	}

	/* ################################################################ */
	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
	
	public User getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", roleName=" + roleName + ", utilisateur=" + utilisateur + "]";
	}

	

}
