package com.Project.ESB.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Compte implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,updatable = false)
	private long id;
	private String nom;
	private String mail;
	public Compte() {}
	
	public Compte(String nom,String mail)
	{
		this.nom=nom;
		this.mail=mail;
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
	public String getmail() {
		return mail;
	}
	public void setmail(String mail) {
		this.mail=mail;
	}
	
@Override
public String toString() {
	return "Compte{" +
"id=" + id +
",nom="+nom+'/'+
",mail="+mail+'/'+
'}';
}

public void setDroit(Droit droit) {
	// TODO Auto-generated method stub
	
}

public void setParametreApp(ParametreApp parametreApp) {
	// TODO Auto-generated method stub
	
}
}
