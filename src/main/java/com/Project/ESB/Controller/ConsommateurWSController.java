package com.Project.ESB.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.ESB.Model.ConsommateurWS;
import com.Project.ESB.Service.ConsommateurWSService;

@RestController
@RequestMapping("/ConsommateurWS")
public class ConsommateurWSController {
	private final ConsommateurWSService ConsommateurWSService;
	
public ConsommateurWSController(ConsommateurWSService consommateurWSService)	{
	this.ConsommateurWSService = consommateurWSService;
}
@PostMapping("/ajouter")
public ResponseEntity<ConsommateurWS>ajouterConsommateurWS(@RequestBody ConsommateurWS consommateurWS) {
	ConsommateurWS  newConsommateurWS=ConsommateurWSService.ajouter(consommateurWS);
return new ResponseEntity<>(newConsommateurWS,HttpStatus.CREATED);

}
@PutMapping("/modifier")
public ResponseEntity<ConsommateurWS>modifierConsommateurWS(@RequestBody ConsommateurWS consommateurWS) {
	ConsommateurWS  modifierConsommateurWS=ConsommateurWSService.modifier(consommateurWS);
return new ResponseEntity<>(modifierConsommateurWS,HttpStatus.OK);

}
}
