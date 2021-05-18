package com.Project.ESB.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project.ESB.Model.Compte;
import com.Project.ESB.Service.CompteService;



@RestController
@RequestMapping("/Compte")
public class CompteController {
	private final CompteService compteService;
	
public CompteController(CompteService compteService)	{
	this.compteService = compteService;
}

@GetMapping("/rechercher/{id}")
public ResponseEntity<Compte>rechercherById(@PathVariable("id") Long id){
	Compte compte = (Compte) compteService.rechercher(id);
	return new ResponseEntity<>(compte,HttpStatus.OK);
}

@PostMapping("/ajouter")
public ResponseEntity<Compte>ajouter(@RequestBody Compte compte) {
Compte  newCompte=compteService.ajouter(compte);
return new ResponseEntity<>(newCompte,HttpStatus.CREATED);

}
@PutMapping("/modifier")
public ResponseEntity<Compte>modifierCompte(@RequestBody Compte compte) {
Compte  modifierCompte=compteService.modifier(compte);
return new ResponseEntity<>(modifierCompte,HttpStatus.OK);

}


}


