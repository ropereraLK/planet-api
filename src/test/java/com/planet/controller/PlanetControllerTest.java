package com.planet.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.sym.Name;

class PlanetControllerTest {
	
	

	@RepeatedTest(30)
	void test() {

		PlanetController pc = new PlanetController();
		String response = pc.planetInfo("Mars");
	
		 
		assertEquals("Hello Mars", response);

	}

}
