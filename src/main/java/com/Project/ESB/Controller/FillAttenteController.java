package com.Project.ESB.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.ESB.Model.FillAttente;
import com.Project.ESB.Service.FillAttenteService;

@RestController
@RequestMapping("/FillAttente")
public class FillAttenteController {
	private final FillAttenteService fillAttenteService;
	
public FillAttenteController(FillAttenteService fillAttenteService)	{
	this.fillAttenteService = fillAttenteService;
}


@PostMapping("/créer")
public ResponseEntity<FillAttente>créerFillAttente(@RequestBody FillAttente fillAttente) {
	FillAttente  newFillAttente=fillAttenteService.créer(fillAttente);
return new ResponseEntity<>(newFillAttente,HttpStatus.CREATED);



}
}
