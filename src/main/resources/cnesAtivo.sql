CREATE TABLE cnesativo (
  co_cnes int(11) NOT NULL,
  no_bairro varchar(255) DEFAULT NULL,
  co_cep int(11) DEFAULT NULL,
  nu_endereco varchar(255) DEFAULT NULL,
  tp_gestao char(1) DEFAULT NULL,
  co_ibge int(11) DEFAULT NULL,
  no_logradouro varchar(255) DEFAULT NULL,
  municipio varchar(255) DEFAULT NULL,
  no_fantasia varchar(255) DEFAULT NULL,
  nu_telefone varchar(255) DEFAULT NULL,
  ds_tipo_unidade varchar(255) DEFAULT NULL,
  uf varchar(255) DEFAULT NULL,
  PRIMARY KEY (co_cnes)
);