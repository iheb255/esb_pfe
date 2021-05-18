package com.Project.ESB.IService;

import com.Project.ESB.Model.Vocabulaire;

public interface VocabulaireIService {
	
	Vocabulaire ajouter(Vocabulaire vocabulaire,String nom);
	Vocabulaire modifier(Vocabulaire vocabulaire);

}
