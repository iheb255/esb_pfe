package com.Project.ESB.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.ESB.Model.Droit;
import com.Project.ESB.Service.DroitService;

	@RestController
	@RequestMapping("/Droit")
	public class DroitController {
		private final DroitService DroitService;
		
	public DroitController(DroitService droitService)	{
		this.DroitService = droitService;
	}
	@PostMapping("/ajouter")
	public ResponseEntity<Droit>ajouterDroit(@RequestBody Droit droit) {
		Droit  newDroit=DroitService.ajouter(droit);
	return new ResponseEntity<>(newDroit,HttpStatus.CREATED);

	}
	@PutMapping("/modifier")
	public ResponseEntity<Droit>modifierDroit(@RequestBody Droit droit) {
		Droit  modifierDroit=DroitService.modifier(droit);
	return new ResponseEntity<>(modifierDroit,HttpStatus.OK);

	}
	}

