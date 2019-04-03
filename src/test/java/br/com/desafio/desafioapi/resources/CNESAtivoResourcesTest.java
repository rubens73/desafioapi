package br.com.desafio.desafioapi.resources;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.desafio.desafioapi.models.CNESAtivo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CNESAtivoResourcesTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void getIds() throws Exception {
		ResponseEntity<CNESAtivo> response = restTemplate.getForEntity("/listarId/159", CNESAtivo.class);
		CNESAtivo cnesAtivo = response.getBody();

		assertEquals(response.getStatusCode(), HttpStatus.OK);
		assertNotNull(cnesAtivo);
	}

	@Test
	public void getUfs() throws Exception {
		
		ResponseEntity<Void> response = restTemplate.exchange("/listarUf/AP", HttpMethod.GET, null, Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
	
	@Test
	public void getTipoUnidade() throws Exception {
		
		ResponseEntity<Void> response = restTemplate.exchange("/listarTipoUnidade/POLICLINICA", HttpMethod.GET, null, Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
}
