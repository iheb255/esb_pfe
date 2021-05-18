package com.Project.ESB.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class WebService {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(nullable = false,updatable = false)
		private long id;
		private String type_service;
		
		public WebService () {}
		
		public WebService  (String type_service)
		{
			this.type_service=type_service;
			
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id=id;
		}
		public String gettype_service() {
			return type_service ;
		}
		public void settype_service(String type_service) {
			this.type_service=type_service;
		}
		
		
		
		
		
	@Override
	public String toString() {
		return "WebService{" +
	"id=" + id +
	",type_service="+type_service+'/'+
	'}';
	}	
}
