package project.esb.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import project.esb.demo.service.CompteRenduService;
import project.esb.demo.model.CompteRenduModel;


public class CompteRenduController {

	private CompteRenduService compteRenduService;

	@PostMapping("/créer")
	public ResponseEntity<CompteRenduModel>créer(@RequestBody CompteRenduModel compteRenduModel) {
		CompteRenduModel  newCompteRenduModel=compteRenduService.créer(compteRenduModel);
	return new ResponseEntity<>(newCompteRenduModel,HttpStatus.CREATED);

	}
}
