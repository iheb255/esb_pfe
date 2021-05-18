package com.Project.ESB.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FillAttente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,updatable = false)
	private long id;
	private Vocabulaire type_service;
	
	public FillAttente() {}
	
	public FillAttente (Vocabulaire type_service)
	{
		this.type_service=type_service;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	public Vocabulaire gettype_service() {
		return type_service;
	}
	public void settype_service(Vocabulaire type_service) {
		this.type_service=type_service;
	}
	
	
	
@Override
public String toString() {
	return "FillAttente{" +
"id=" + id +
",type_service="+type_service+'/'+
'}';
}
}
