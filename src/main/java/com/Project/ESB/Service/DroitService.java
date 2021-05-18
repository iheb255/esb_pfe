package com.Project.ESB.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import org.springframework.stereotype.Service;

import com.Project.ESB.IService.DroitIService;
import com.Project.ESB.Model.Droit;

@Entity
@Service

public class DroitService  implements DroitIService {
	
	
	private List<Droit> Droits = new ArrayList<>(Arrays.asList(
			new Droit()
			));
	@Override
	public Droit ajouter(Droit droit,String nom) {
		Droits.add(droit);
		return droit;
	
	}
	@Override

		
		public Droit modifier(Droit droit) {
			for (Droit droit1: list) {
				Long id = null;
				if(droit.getId()==droit.getId()) {
					droit.setNom(droit.getNom());
					return droit1;
				}
			}
		
	}
}
