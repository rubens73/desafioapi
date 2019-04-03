package br.com.desafio.desafioapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafio.desafioapi.models.CNESAtivo;

public interface CNESAtivoRepository extends JpaRepository<CNESAtivo, Integer>{
	
	CNESAtivo findById(int id);
	List<CNESAtivo> findByUf(String uf);
	List<CNESAtivo> findByMunicipio(String uf);
	List<CNESAtivo> findByBairro(String bairro);
	List<CNESAtivo> findByTipoUnidade(String tipoUnidade);

}
