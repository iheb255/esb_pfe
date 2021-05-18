package com.Project.ESB.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.ESB.IService.TypeVocabulaireIService;
import com.Project.ESB.Model.TypeVocabulaire;
import com.Project.ESB.Service.TypeVocabulaireService;

@RestController
@RequestMapping("/TypeVocabulaire")
public class TypeVocabulaireController {
	private final TypeVocabulaireIService TypeVocabulaireService;
	
public TypeVocabulaireController(TypeVocabulaireService typeVocabulaireService)	{
	this.TypeVocabulaireService = typeVocabulaireService;
}
@PostMapping("/ajouter")
public ResponseEntity<TypeVocabulaire>ajouterTypeVocabulaire(@RequestBody TypeVocabulaire typeVocabulaire) {
	TypeVocabulaire  newTypeVocabulaire=TypeVocabulaireService.ajouter(typeVocabulaire);
return new ResponseEntity<>(newTypeVocabulaire,HttpStatus.CREATED);

}
@PutMapping("/modifier")
public ResponseEntity<TypeVocabulaire>modifierTypeVocabulaire(@RequestBody TypeVocabulaire typeVocabulaire) {
	TypeVocabulaire  modifierTypeVocabulaire=TypeVocabulaireService.modifier(typeVocabulaire);
return new ResponseEntity<>(modifierTypeVocabulaire,HttpStatus.OK);

}
}
