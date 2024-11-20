package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.exemple.json.TextToJSON;

@RestController
@RequestMapping("/")
public class ParamController {
	@GetMapping("/welcome/{nom}/{cognom}")
	public TextToJSON welcome(@PathVariable String nom, @PathVariable String cognom) {
		return new TextToJSON(nom, cognom);
	}
	@GetMapping("/welcome")
	public TextToJSON getMethodName() {
		return new TextToJSON("deconegut", "desconegut");
	}
	
}