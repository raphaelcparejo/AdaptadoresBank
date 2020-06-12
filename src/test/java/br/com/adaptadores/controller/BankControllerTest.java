package br.com.adaptadores.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.adaptadores.controller.dto.RequiscaoDto;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BankControllerTest {
	
	@Autowired
	private MockMvc mvc;
	
	
	@Test
	public void BankControllerRetorna200Ok() throws Exception {
		
		//Arrange
		RequiscaoDto requiscaoTestada =new RequiscaoDto("NomeTeste", 1,new Date(),"35566679992");
		
		//Act
		  mvc.perform( MockMvcRequestBuilders
			      .post("/")
			      .content(asJsonString(requiscaoTestada))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
		
		//Assert
			      .andExpect(status().isOk());	
	}
	
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}
	
	public void BankControllerRetornaBadRequest() throws Exception {
		
		//Arrange
		Object requiscaoTestada = new Object();
		
		//Act
		  mvc.perform( MockMvcRequestBuilders
			      .post("/")
			      .content(asJsonString(requiscaoTestada))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
		
		//Assert
			      .andExpect(status().isBadRequest());	
	}
}
