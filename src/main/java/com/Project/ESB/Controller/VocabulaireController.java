package com.Project.ESB.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.ESB.IService.VocabulaireIService;
import com.Project.ESB.Model.Vocabulaire;
import com.Project.ESB.Service.VocabulaireService;

@RestController
@RequestMapping("/Vocabulaire")
public class VocabulaireController {
	private final VocabulaireIService VocabulaireService;
	
public VocabulaireController(VocabulaireService VocabulaireService)	{
	this.VocabulaireService = VocabulaireService;
}
@PostMapping("/ajouter")
public ResponseEntity<Vocabulaire>ajouterVocabulaire(@RequestBody Vocabulaire Vocabulaire) {
	Vocabulaire  newVocabulaire=VocabulaireService.ajouter(Vocabulaire);
return new ResponseEntity<>(newVocabulaire,HttpStatus.CREATED);

}
@PutMapping("/modifier")
public ResponseEntity<Vocabulaire>modifierVocabulaire(@RequestBody Vocabulaire Vocabulaire) {
	Vocabulaire  modifierVocabulaire=VocabulaireService.modifier(Vocabulaire);
return new ResponseEntity<>(modifierVocabulaire,HttpStatus.OK);

}
}
