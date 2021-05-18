package project.esb.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.esb.demo.model.ParametreAppModel;
import project.esb.demo.service.ParametreAppService;



@RestController
@RequestMapping("/ParametreAppModel")
public class ParametreAppController {
	private final ParametreAppService parametreAppService;
	
public ParametreAppController(ParametreAppService parametreAppService)	{
	this. parametreAppService =  parametreAppService;
}


@PostMapping("/ajouter")
public ResponseEntity< ParametreAppModel>ajouter(@RequestBody  ParametreAppModel  parametreAppModel) {
	ParametreAppModel  newParametreAppModel= parametreAppService.ajouter( parametreAppModel);
	 return new ResponseEntity<>(newParametreAppModel,HttpStatus.CREATED);

}
@PutMapping("/modifier")
public ResponseEntity<ParametreAppModel>updateParametreAppModel(@RequestBody ParametreAppModel parametreAppModel) {
	ParametreAppModel  updateParametreAppModel=parametreAppService.modifier(parametreAppModel);
return new ResponseEntity<>(updateParametreAppModel,HttpStatus.OK);

}



}
