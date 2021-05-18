package com.Project.ESB.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.ESB.Model.CompteRendu;
import com.Project.ESB.Service.CompteRenduService;

@RestController
@RequestMapping("/Compte")
public class CompteRenduController {
	private final CompteRenduService compteRenduService;
	
public CompteRenduController(CompteRenduService compteRenduService)	{
	this.compteRenduService = compteRenduService;
}



@PostMapping("/créer")
public ResponseEntity<CompteRendu>créerCompteRendu(@RequestBody CompteRendu compteRendu) {
CompteRendu  newCompteRendu=compteRenduService.créer(compteRendu);
return new ResponseEntity<>(newCompteRendu,HttpStatus.CREATED);



}
}
