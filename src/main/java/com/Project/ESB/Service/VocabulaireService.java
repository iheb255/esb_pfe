package com.Project.ESB.Service;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;


import com.Project.ESB.IService.VocabulaireIService;
import com.Project.ESB.Model.TypeVocabulaire;
import com.Project.ESB.Model.Vocabulaire;

@Entity
@Service

public class VocabulaireService extends TypeVocabulaire implements VocabulaireIService {
	@PersistenceContext
	private EntityManager em;
	@Override
	public Vocabulaire ajouter(Vocabulaire vocabulaire,String nom) {
		Object em = null;
		TypeVocabulaire typeVocabulaire=((EntityManager) em).find(TypeVocabulaire.class, nom);
		vocabulaire.setTypeVocabulaire(typeVocabulaire);
		 ((EntityManager) em).persist(vocabulaire);
		
		return vocabulaire;
	
	
		
	}
	
	@Override
	public Vocabulaire modifier(Vocabulaire vocabulaire) {
		// TODO Auto-generated method stub
		return null;
	}

}
