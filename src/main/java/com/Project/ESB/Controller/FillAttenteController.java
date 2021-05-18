package project.esb.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.esb.demo.model.DroitModel;
import project.esb.demo.model.FillAttenteModel;
import project.esb.demo.service.DroitService;
import project.esb.demo.service.FillAttenteService;

	@RestController
	@RequestMapping("/FillAttenteModel")
	public class FillAttenteController{
		private final FillAttenteService fillAttenteService;
		
		public FillAttenteController(FillAttenteService fillAttenteService)	{
		this.fillAttenteService = fillAttenteService;
	}



	@PostMapping("/creer")
	public ResponseEntity<FillAttenteModel>creer(@RequestBody FillAttenteModel fillAttenteModel) {
		FillAttenteModel  newFillAttenteModel=fillAttenteService.creer(fillAttenteModel);
	return new ResponseEntity<>(newFillAttenteModel,HttpStatus.CREATED);

	}


	}



