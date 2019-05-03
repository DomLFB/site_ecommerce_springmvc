package com.intiformation.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "user")
@Table(name = "users")
public class User {

	/* ################################################################ */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long idUser;
	
	@Column(name = "nom_user")
	private String userName;
	
	@Column(name = "psd_user")
	private String password;
	
	@Column(name = "activer_user")
	private boolean actived;

	/* ################################################################ */
	public User() {
		super();
	}

	public User(Long idUser, String userName, String password, boolean actived) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.actived = actived;
	}

	public User(String userName, String password, boolean actived) {
		super();
		this.userName = userName;
		this.password = password;
		this.actived = actived;
	}

	/* ################################################################ */
	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	
	
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", userName=" + userName + ", password=" + password + ", actived=" + actived
				+ "]";
	}

}
