package com.Project.ESB.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.ESB.Model.ParametreApp;
import com.Project.ESB.Service.ParametreAppService;

@RestController
@RequestMapping("/ParametreApp")
public class ParametreAppController {
	private final ParametreAppService ParametreAppService;
	
public ParametreAppController(ParametreAppService parametreAppService)	{
	this.ParametreAppService = parametreAppService;
}

@PostMapping("/ajouter")
public ResponseEntity<ParametreApp>ajouterParametreApp(@RequestBody ParametreApp parametreApp) {
	ParametreApp  newParametreApp=ParametreAppService.ajouter(parametreApp);
return new ResponseEntity<>(newParametreApp,HttpStatus.CREATED);

}
@PutMapping("/modifier")
public ResponseEntity<ParametreApp>modifierParametreApp(@RequestBody ParametreApp parametreApp) {
	ParametreApp  modifierParametreApp=ParametreAppService.modifier(parametreApp);
return new ResponseEntity<>(modifierParametreApp,HttpStatus.OK);

}
}
