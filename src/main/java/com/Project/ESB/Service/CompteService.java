package com.Project.ESB.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.Project.ESB.IService.CompteIService;
import com.Project.ESB.Model.Compte;
import com.Project.ESB.Model.Droit;
import com.Project.ESB.Model.ParametreApp;
@Entity
@Service

@DiscriminatorValue("v")
public class CompteService  implements CompteIService  {
	  @PersistenceContext
	   
	  private List<Compte>list=new ArrayList<>();
		private EntityManager em;
	   private static Scanner x;
		public  Compte ajouter(Compte compte,String nom,String mail,String nom_pr) {
		Droit droit=em.find(Droit.class, nom);
		ParametreApp parametreApp=em.find(ParametreApp.class, nom_pr);
		compte.setDroit(droit);
		compte.setParametreApp(parametreApp);
		em.persist(compte);
		
		return compte;
	
	}

		@Override
		public Boolean activer(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Boolean desactiver(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Compte modifier(Compte compte) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Compte authentifier(String login, String mdp) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public List<Compte> rechercher(long id) {
			// TODO Auto-generated method stub
			return null;
		}

	

	



}