package project.esb.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import project.esb.demo.model.WebServiceModel;
import project.esb.demo.service.WebServiceService;

public class WebServiceController {
	private final WebServiceService webServiceService;
	
	public WebServiceController(WebServiceService webServiceService)	{
		this.webServiceService = webServiceService;
	}

	@GetMapping("/demander/{id}")
	public ResponseEntity<WebServiceModel>demanderById(@PathVariable("id") Long id){
		WebServiceModel webServiceModel = (WebServiceModel) webServiceService.demander(id);
		return new ResponseEntity<>(webServiceModel,HttpStatus.OK);
	}

}
