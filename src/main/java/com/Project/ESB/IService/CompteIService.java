package com.Project.ESB.IService;

import java.util.List;

import com.Project.ESB.Model.Compte;

public interface CompteIService {

	 Compte ajouter(Compte compte,String nom,String mail,String nom_pr);
	 Boolean activer(Long id);
	 Boolean desactiver(Long id);
	 Compte modifier(Compte compte);
	 Compte authentifier(String login,String mdp);
	 List<Compte> rechercher(long id);

}
