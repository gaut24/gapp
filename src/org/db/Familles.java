package org.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Familles {
	@Id
	@GeneratedValue
	private Long id_famille;
	private String nom;
	
	public Long getId_famille() {
		return id_famille;
	}
	public void setId_famille(Long id_famille) {
		this.id_famille = id_famille;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
