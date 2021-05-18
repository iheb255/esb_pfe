package com.Project.ESB.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
	public class ParametreApp {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(nullable = false,updatable = false)
		private long id;
		private String type_parametre;
		
		public ParametreApp() {}
		
		public ParametreApp (String  type_parametre)
		{
			this. type_parametre= type_parametre;
			
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id=id;
		}
		public String gettype_parametre() {
			return  type_parametre ;
		}
		public void settype_parametre(String  type_parametre) {
			this. type_parametre= type_parametre;
		}
		
		
		
		
		
	@Override
	public String toString() {
		return "ParametreApp{" +
	"id=" + id +
	", type_parametre="+ type_parametre+'/'+
	'}';
	}	
}
