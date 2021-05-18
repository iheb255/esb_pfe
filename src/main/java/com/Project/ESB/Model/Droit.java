package com.Project.ESB.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Droit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,updatable = false)
	private long id;
	private String nom;
	private Vocabulaire type_droit;
	
	public Droit() {}
	
	public Droit (Vocabulaire type_droit)
	{
		this.type_droit=type_droit;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	public Vocabulaire gettype_droit() {
		return type_droit ;
	}
	public void settype_droit(Vocabulaire type_droit) {
		this.type_droit=type_droit;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	
@Override
public String toString() {
	return "Droit{" +
"id=" + id +
",type_droit="+type_droit+'/'+
'}';
}


	
}
