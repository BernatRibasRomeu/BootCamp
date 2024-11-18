package com.example.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exemple.json.TextToJSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
public class HomeController {
//	@ResponseBody
//	@RequestMapping(path = "/")
//	public TextToJSON test () {
//		return new TextToJSON("home.html");
//	}

//	@ResponseBody
//	@RequestMapping(path = "/", produces = "application/json")
//	public String test () {
//		return "{\"page\": \"index.html\"}";
//	}

//	@ResponseBody
//	@RequestMapping(path = "/")
//	public ObjectNode test() {
//		ObjectMapper mapper = new ObjectMapper();
//		ObjectNode node = mapper.createObjectNode();
//		node.put("key", "value");
//		node.put("foo", "bar");
//		node.put("number", 42);
//		
//		return node;
//	}
	
	@ResponseBody
	@RequestMapping(path = "/")
	public ResponseEntity<String> getGreetingResponseEntity(){
		final HttpHeaders head = new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"test: \"Hello with ResponseEntity\"}", head, HttpStatus.OK);
	}
}