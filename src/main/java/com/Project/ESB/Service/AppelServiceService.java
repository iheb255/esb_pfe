package com.Project.ESB.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.ESB.IService.AppelServiceIService;
import com.Project.ESB.Model.AppelService;

import com.Project.ESB.Repository.AppelServiceRepository;

@Service
public class AppelServiceService implements AppelServiceIService {

	@Autowired
	private AppelServiceRepository appelServiceRepository;
	@Override
	public AppelService creer(AppelService appelService) {
		// TODO Auto-generated method stub
		return appelServiceRepository.creer(appelService);
	}	 

}
