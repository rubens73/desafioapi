package br.com.desafio.desafioapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CNESAtivo {

	@Id
	@Column(name = "co_cnes", length = 7)
	private int idCnes;
	@Column(name = "co_ibge")
	private int idIbge;
	@Column(name = "no_fantasia")
	private String nomeFantasia;
	@Column(name = "ds_tipo_unidade")
	private String tipoUnidade;
	@Column(name = "tp_gestao", length = 1)
	private char gestao;
	@Column(name = "no_logradouro")
	private String logradouro;
	@Column(name = "nu_endereco")
	private String endereco;
	@Column(name = "no_bairro")
	private String bairro;
	@Column(name = "co_cep")
	private int cep;
	@Column(name = "uf")
	private String uf;
	@Column(name = "municipio")
	private String municipio;
	@Column(name = "nu_telefone")
	private String telefone;

	public CNESAtivo(int idCnes, int idIbge, String nomeFantasia, String tipoUnidade, char gestao, String logradouro,
			String endereco, String bairro, int cep, String uf, String municipio, String telefone) {
		this.idCnes = idCnes;
		this.idIbge = idIbge;
		this.nomeFantasia = nomeFantasia;
		this.tipoUnidade = tipoUnidade;
		this.gestao = gestao;
		this.logradouro = logradouro;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cep = cep;
		this.uf = uf;
		this.municipio = municipio;
		this.telefone = telefone;
	}

	public CNESAtivo() {
	}

	public int getIdCnes() {
		return idCnes;
	}

	public void setIdCnes(int idCnes) {
		this.idCnes = idCnes;
	}

	public int getIdIbge() {
		return idIbge;
	}

	public void setIdIbge(int idIbge) {
		this.idIbge = idIbge;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public char getGestao() {
		return gestao;
	}

	public void setGestao(char gestao) {
		this.gestao = gestao;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "CNESAtivos [idCnes=" + idCnes + ",\n idIbge=" + idIbge + ",\n nomeFantasia=" + nomeFantasia
				+ ",\n tipoUnidade=" + tipoUnidade + ",\n gestao=" + gestao + ",\n logradouro=" + logradouro
				+ ",\n endereco=" + endereco + ",\n no_bairro=" + bairro + ",\n cep=" + cep + ",\n uf=" + uf
				+ ",\n municipio=" + municipio + ",\n telefone=" + telefone + "]";
	}
}
