package project.esb.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.esb.demo.model.ConsommateurWSModel;
import project.esb.demo.service.ConsommateurWSService;



@RestController
@RequestMapping("/ParametreAppModel")
public class ConsommateurWSController {
	private final ConsommateurWSService consommateurWSService;
	
public ConsommateurWSController(ConsommateurWSService consommateurWSService)	{
	this. consommateurWSService =  consommateurWSService;
}


@PostMapping("/ajouter")
public ResponseEntity< ConsommateurWSModel>ajouter(@RequestBody  ConsommateurWSModel  consommateurWSModel) {
	ConsommateurWSModel  newConsommateurWSModel= consommateurWSService.ajouter(consommateurWSModel);
	 return new ResponseEntity<>(newConsommateurWSModel,HttpStatus.CREATED);

}
@PutMapping("/modifier")
public ResponseEntity<ConsommateurWSModel>updateConsommateurWSModel(@RequestBody ConsommateurWSModel consommateurWSModel) {
	ConsommateurWSModel  updateConsommateurWSModel=consommateurWSService.modifier(consommateurWSModel);
return new ResponseEntity<>(updateConsommateurWSModel,HttpStatus.OK);

}

}
