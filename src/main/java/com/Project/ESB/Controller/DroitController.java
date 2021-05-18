package project.esb.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.esb.demo.model.DroitModel;
import project.esb.demo.model.ProtocoleModel;
import project.esb.demo.service.DroitService;
import project.esb.demo.service.ProtocoleService;


	@RestController
	@RequestMapping("/DroitModel")
	public class DroitController{
		private final DroitService droitService;
		
		public DroitController(DroitService droitService)	{
		this.droitService = droitService;
	}



	@PostMapping("/ajouter")
	public ResponseEntity<DroitModel>ajouter(@RequestBody DroitModel droitModel) {
		DroitModel  newDroitModel=droitService.ajouter(droitModel);
	return new ResponseEntity<>(newDroitModel,HttpStatus.CREATED);

	}
	@PutMapping("/modifier")
	public ResponseEntity<DroitModel>updateDroitModel(@RequestBody DroitModel droitModel) {
		DroitModel  updateDroitModel=droitService.modifier(droitModel);
	return new ResponseEntity<>(updateDroitModel,HttpStatus.OK);

	}

	}


