package com.Project.ESB.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Project.ESB.IService.ConsommateurWSIService;
import com.Project.ESB.Model.ConsommateurWS;
import com.Project.ESB.Model.Droit;


public class ConsommateurWSService implements ConsommateurWSIService {

	
	private List<ConsommateurWS> ConsommateurWSs = new ArrayList<>(Arrays.asList(
			new ConsommateurWS()
			));
	@Override
	public ConsommateurWS ajouter(ConsommateurWS consommateurWS) {
		ConsommateurWSs.add(consommateurWS);
		return consommateurWS;
	
	}
	
	
	@Override
	public ConsommateurWS modifier(ConsommateurWS consommateurWS) {
		for (ConsommateurWS consommateurWS1: list) {
			Long id = null;
			if(consommateurWS1.getId()==consommateurWS1.getId()) {
				consommateurWS.setnom(consommateurWS.getnom());
				return consommateurWS1;
			}
		}
	
	}

}
