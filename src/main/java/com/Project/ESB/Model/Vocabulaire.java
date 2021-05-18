package com.Project.ESB.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Vocabulaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,updatable = false)
	private long id;
	private String nom;
	
	public Vocabulaire() {}
	
	public Vocabulaire(String nom)
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
	return "Vocabulaire{" +
"id=" + id +
",nom="+nom+'/'+

'}';
}

public void setTypeVocabulaire(TypeVocabulaire typeVocabulaire) {
	// TODO Auto-generated method stub
	
}}


