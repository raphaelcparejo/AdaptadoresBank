package br.com.adaptadores.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.adaptadores.controller.dto.RequiscaoDto;
import br.com.adaptadores.service.ServicoServiceImpl;
import br.com.adaptadores.service.exceptions.ServicoServiceException;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BankControllerTest {

	@Autowired
	private MockMvc mvc;

	@Mock
	private ServicoServiceImpl service;

	@InjectMocks
	private BankController controller;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	@Test
	public void BankControllerRetorna200Ok() throws Exception {

		// Arrange
		RequiscaoDto requiscaoTestada = new RequiscaoDto("NomeTeste", 1, new Date(), "35566679992");
		Mockito.doNothing().when(service).cadastrarNovoCliente("teste", 0, new Date(), "teste");

		// Act
		mvc.perform(MockMvcRequestBuilders.post("/").content(asJsonString(requiscaoTestada))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))

				// Assert
				.andExpect(status().isOk());
		Mockito.verify(service, Mockito.times(1)).cadastrarNovoCliente(null, 0, null, null);
		Mockito.verifyNoMoreInteractions(service);
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	public void BankControllerRetornaBadRequest() throws Exception {

		// Arrange
		Object requiscaoTestada = new Object();

		// Act
		mvc.perform(MockMvcRequestBuilders.post("/").content(asJsonString(requiscaoTestada))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))

				// Assert
				.andExpect(status().isBadRequest());
	}

	@Test
	public void BankControllerRetorna500() throws Exception {

		// Arrange
		RequiscaoDto requiscaoTestada = new RequiscaoDto("NomeTeste", 1, new Date(), "35566679992");
		Mockito.doThrow(new ServicoServiceException("olá", new Exception())).when(service).cadastrarNovoCliente(null, 0,
				null, null);

		// Act
		mvc.perform(MockMvcRequestBuilders.post("/").content(asJsonString(requiscaoTestada))
				.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))

				// Assert
				.andExpect(status().isBadGateway());
		Mockito.verify(service, Mockito.times(1)).cadastrarNovoCliente("teste", 0, new Date(), "teste");
		Mockito.verifyNoMoreInteractions(service);
	}

}
