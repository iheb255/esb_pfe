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
import project.esb.demo.model.AppelServiceModel;
import project.esb.demo.service.AppelServiceService;


	@RestController
	@RequestMapping("/AppelServiceModel")
	public class AppelServiceContoller{
		private final AppelServiceService appelServiceService;
		
		public AppelServiceContoller(AppelServiceService appelServiceService)	{
		this.appelServiceService = appelServiceService;
	}



	@PostMapping("/ acheminer")
	public ResponseEntity<AppelServiceModel> acheminer(@RequestBody AppelServiceModel appelServiceModel) {
	AppelServiceModel  newAppelServiceModel=appelServiceService.acheminer(appelServiceModel);
	return new ResponseEntity<>(newAppelServiceModel,HttpStatus.CREATED);

	}
	

}
