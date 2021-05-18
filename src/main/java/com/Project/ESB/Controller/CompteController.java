package project.esb.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.esb.demo.model.CompteModel;
import project.esb.demo.service.CompteService;

@RestController
@RequestMapping("/CompteModel")
public class CompteController {
	private final CompteService compteService;
	
public CompteController(CompteService compteService)	{
	this.compteService = compteService;
}

@GetMapping("/rechercher/{id}")
public ResponseEntity<CompteModel>rechercherById(@PathVariable("id") Long id){
	CompteModel compteModel = (CompteModel) compteService.rechercher(id);
	return new ResponseEntity<>(compteModel,HttpStatus.OK);
}

@PostMapping("/ajouter")
public ResponseEntity<CompteModel>ajouter(@RequestBody CompteModel compteModel) {
CompteModel  newCompteModel=compteService.ajouter(compteModel);
return new ResponseEntity<>(newCompteModel,HttpStatus.CREATED);

}
@PutMapping("/modifier")
public ResponseEntity<CompteModel>updateCompteModel(@RequestBody CompteModel compteModel) {
CompteModel  updateCompteModel=compteService.modifier(compteModel);
return new ResponseEntity<>(updateCompteModel,HttpStatus.OK);

}


}
