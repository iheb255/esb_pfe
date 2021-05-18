package project.esb.demo.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.esb.demo.model.VocabulaireModel;
import project.esb.demo.service.VocabulaireService;

@RestController
@RequestMapping("/VocabulaireModel")
public class VocabulaireController {
	private final VocabulaireService vocabulaireService;

	public VocabulaireController(VocabulaireService vocabulaireService) {
		this.vocabulaireService = vocabulaireService;
	}

	@PostMapping("/ajouter")
	public ResponseEntity<VocabulaireModel> ajouter(@RequestBody VocabulaireModel vocabulaireModel) {
		VocabulaireModel newVocabulaireModel = vocabulaireService.ajouter(vocabulaireModel);
		return new ResponseEntity<>(newVocabulaireModel, HttpStatus.CREATED);

	}

	@PutMapping("/modifier")
	public ResponseEntity<VocabulaireModel> updateVocabulaireModel(@RequestBody VocabulaireModel vocabulaireModel) {
		VocabulaireModel updateVocabulaireModel = vocabulaireService.modifier(vocabulaireModel);
		return new ResponseEntity<>(updateVocabulaireModel, HttpStatus.OK);

	}

}
