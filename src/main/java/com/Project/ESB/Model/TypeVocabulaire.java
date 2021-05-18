package com.Project.ESB.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeVocabulaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,updatable = false)
	private long id;
	private String nom;
	
	public TypeVocabulaire() {}
	
	public TypeVocabulaire(String nom)
	{
		this.nom=nom;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	public String getnom() {
		return nom;
	}
	public void setnom(String nom) {
		this.nom=nom;
	}

	
@Override
public String toString() {
	return "TypeVocabulaire{" +
"id=" + id +
",nom="+nom+'/'+

'}';
}

}
