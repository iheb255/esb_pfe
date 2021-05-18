package com.Project.ESB.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Project.ESB.IService.ParametreAppIService;
import com.Project.ESB.Model.ConsommateurWS;
import com.Project.ESB.Model.ParametreApp;

public class ParametreAppService implements ParametreAppIService {

	private List<ParametreApp> ParametreApps = new ArrayList<>(Arrays.asList(
			new ParametreApp()
			));
	@Override
	public ParametreApp ajouter(ParametreApp parametreApp) {
		ParametreApps.add(parametreApp);
		return parametreApp;
	}

	@Override
	public ParametreApp modifier(ParametreApp parametreApp) {
		for (ParametreApp parametreApp1: list) {
			Long id = null;
			if(parametreApp1.getId()==parametreApp1.getId()) {
				parametreApp.settype_parametre(parametreApp.gettype_parametre());
				return parametreApp1;
	}
		}}
}
