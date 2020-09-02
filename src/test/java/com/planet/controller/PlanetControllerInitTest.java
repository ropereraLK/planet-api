package com.planet.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@WebMvcTest(PlanetController.class)
class PlanetControllerInitTest {
	
	@Autowired
	private MockMvc mvc;

	@Test
	void test() throws Exception {
		
		
		RequestBuilder request = MockMvcRequestBuilders.get("/");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("Hello jupiter", result.getResponse().getContentAsString() );
	}
	
	@Test
	public void testWthParameter() throws Exception {
		mvc.perform(get("/?planetName=Pluto"))
		.andExpect(content().string("Hello Pluto"));
		
	}
	
	@Test
	public void testWthParameter2() throws Exception {
		mvc.perform(get("/?planetName=pluto"))
		.andExpect(content().string("Hello pluto"));
		
	}
	
 
 


}
