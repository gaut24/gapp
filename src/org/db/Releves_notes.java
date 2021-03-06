package org.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Releves_notes {
	@Id
	private int id_releve;
	private int id_personne;
	private int id_from;
	private int id_competence;
	private String resultat;
	private String commentaire;
	
	public int getId_releve() {
		return id_releve;
	}
	public void setId_releve(int id_releve) {
		this.id_releve = id_releve;
	}
	public int getId_personne() {
		return id_personne;
	}
	public void setId_personne(int id_personne) {
		this.id_personne = id_personne;
	}
	public int getId_competence() {
		return id_competence;
	}
	public void setId_competence(int id_competence) {
		this.id_competence = id_competence;
	}
	public String getResultat() {
		return resultat;
	}
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public int getId_from() {
		return id_from;
	}
	public void setId_from(int id_from) {
		this.id_from = id_from;
	}
	public Releves_notes() {}
	public Releves_notes(int id_personnes, int id_from, int id_comp, String resultat, String commentaire) {
	      this.id_personne = id_personnes;
	      this.id_from = id_from;
	      this.id_competence = id_comp;
	      this.resultat = resultat;
	      this.commentaire = commentaire;
	   }
	
}
