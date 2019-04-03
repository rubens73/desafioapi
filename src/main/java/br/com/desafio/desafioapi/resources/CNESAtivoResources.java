package br.com.desafio.desafioapi.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.desafioapi.models.CNESAtivo;
import br.com.desafio.desafioapi.repository.CNESAtivoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController
@RequestMapping(value = "/")
@Api(value = "sslkfhs faslfhjs dsddfsdf")
public class CNESAtivoResources {

	static final Logger logger = LogManager.getLogger(CNESAtivoResources.class.getName());

	@Autowired
	CNESAtivoRepository cnesAtivoRepository;

	@ApiOperation(value = "Retorna todos CNES ativo")
	@GetMapping("listar")
	public List<CNESAtivo> listarCNESAtivos() {

		List<CNESAtivo> aux = new ArrayList<CNESAtivo>();
		int i = 0;
		for (CNESAtivo cnesAtivo : cnesAtivoRepository.findAll()) {
			aux.add(cnesAtivo);
			i++;
			if (i == 10) {
				break;
			}
		}

		return aux;
	}

	@ApiOperation(value = "Retorna um CNES ativo")
	@GetMapping("listarId/{id}")
	public ResponseEntity<CNESAtivo> listarCNESAtivosUnico(@PathVariable(value = "id") int id) {
		CNESAtivo cnes = new CNESAtivo();
		cnes = cnesAtivoRepository.findById(id);
		if (cnes == null) {
			logger.info("CNES com id " + id + " não encontrado");
			return new ResponseEntity<CNESAtivo>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<CNESAtivo>(cnes, HttpStatus.OK);
	}

	@ApiOperation(value = "Retorna uma lista de CNES ativa por unidade federativa")
	@GetMapping("listarUf/{uf}")
	public ResponseEntity<List<CNESAtivo>> listarUnidadeFederativa(@PathVariable(value = "uf") String uf) {
		List<CNESAtivo> listaUf = new ArrayList<CNESAtivo>();
		listaUf = cnesAtivoRepository.findByUf(uf);
		if (listaUf.isEmpty()) {
			logger.info("Lista de CNES com uf " + uf + " não encontrado");
			return new ResponseEntity<List<CNESAtivo>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<CNESAtivo>>(listaUf, HttpStatus.OK);
	}

	@ApiOperation(value = "Retorna uma lista de CNES ativa por municipio")
	@GetMapping("listarMunicipio/{municipio}")
	public ResponseEntity<List<CNESAtivo>> listarMunicipio(@PathVariable(value = "municipio") String municipio) {
		List<CNESAtivo> listaMunicipio = new ArrayList<CNESAtivo>();
		listaMunicipio = cnesAtivoRepository.findByMunicipio(municipio);
		if (listaMunicipio.isEmpty()) {
			logger.info("Lista de CNES com municipio " + municipio + " não encontrado");
			return new ResponseEntity<List<CNESAtivo>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<CNESAtivo>>(listaMunicipio, HttpStatus.OK);
	}

	@ApiOperation(value = "Retorna uma lista de CNES ativa por bairro")
	@GetMapping("listarBairro/{bairro}")
	public ResponseEntity<List<CNESAtivo>> listarBairro(@PathVariable(value = "bairro") String bairro) {
		List<CNESAtivo> listaBairro = new ArrayList<CNESAtivo>();
		listaBairro = cnesAtivoRepository.findByBairro(bairro);
		if (listaBairro.isEmpty()) {
			logger.info("Lista de CNES com bairros " + bairro + " não encontrado");
			return new ResponseEntity<List<CNESAtivo>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<CNESAtivo>>(listaBairro, HttpStatus.OK);
	}

	@ApiOperation(value = "Retorna uma lista de CNES ativa por tipo de unidade")
	@GetMapping("listarTipoUnidade/{tipoUnidade}")
	public ResponseEntity<List<CNESAtivo>> listarTipoUnidade(@PathVariable(value = "tipoUnidade") String tipoUnidade) {
		List<CNESAtivo> listaTipoUnidade = new ArrayList<CNESAtivo>();
		listaTipoUnidade = cnesAtivoRepository.findByTipoUnidade(tipoUnidade);
		if (listaTipoUnidade.isEmpty()) {
			logger.info("Lista de CNES com tipo unidade " + tipoUnidade + " não encontrado");
			return new ResponseEntity<List<CNESAtivo>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<CNESAtivo>>(listaTipoUnidade, HttpStatus.OK);
	}
}
