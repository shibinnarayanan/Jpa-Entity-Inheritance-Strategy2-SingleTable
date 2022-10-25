package com.svv.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.svv.jpa.entity.Painting;
import com.svv.jpa.entity.Sculpture;
import com.svv.jpa.repo.PaintingRepository;
import com.svv.jpa.repo.SculptureRepository;

@RestController
public class Controller {

	@Autowired
	PaintingRepository PaintingRepo;
	@Autowired
	SculptureRepository SculptureRepo;
	
// sample json for testing
//	{
//	    "id": 1,
//	    "author": "Davinci",
//	    "paintingtechnique": "ACRYLIC",
//	    "width": 100.0,
//	    "height": 75.0
//	}
	
	@PostMapping("/save/painting")
	ResponseEntity savePaintings(@RequestBody Painting painting) {
		Painting paintingRes = PaintingRepo.save(painting);
		return new ResponseEntity<>(paintingRes, HttpStatus.CREATED);
	}
// sample json for testing 
//	{
//
//	    "author": "Perumthachan",
//	    "material": "ROCK",
//	    "weight": 700.0
//	}
	@PostMapping("/save/sculpture")
	ResponseEntity saveSculpture(@RequestBody Sculpture sculpture) {
		Sculpture sculptureRes = PaintingRepo.save(sculpture);
		return new ResponseEntity<>(sculptureRes, HttpStatus.CREATED);
	}

}
