package com.planet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanetController {
	@GetMapping("/")
	public String planetInfo(@RequestParam(name = "planetName", defaultValue ="jupiter") String planetName) {
		return "Hello " + planetName;
	}

}
