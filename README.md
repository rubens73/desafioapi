# Desafio API REST

Utilizando boas práticas de desenvolvimento no software, crie uma aplicação para ler e apresentar dados do Cadastro Nacional de Estabelecimentos de Saúde (CNES) no Brasil.

Para mais detalhes: https://desafioapi.herokuapp.com/swagger-ui.html

# Requisitos Mínimos:
O Sistema deve conter três visões:

- Lista de CNES;
- CNES por tipos;
- CNES por Estado;

# Sobre a aplicação

A [aplicação] foi desenvolvida com as seguintes ferramentas:

Ferramenta | Descrição
 ------ | ------
 Java 1.8 | Desenvolvimento
 Spring | Framework API REST 
 PostgreSQL | Banco de dados 
 PostMan | Testar as requisições 
 JUnit | Testes 
 Github | Versionamento 
 Swagger | Documentação de API 
 Heroku | Plataforma de aplicação 

### O que melhorar:
* A depender da necessidade usar um banco de dados NoSql para uma grande quantidade de registros
* Desenvolver com técinas de TDD e SOLID.
* Definir um padrão de nomenclatura.
* Usar o padrão de versionamento [git flow]
* Ferramentas de integração continua (Travis)
* [Trello] para divisão de tarefas e acompanhamento das tarefas.
* Ferramenta de monitoramento de código [SonarQube]

### Observações:

Como as ferramentas onlines são free pode apresentar algumas limitações, mas ainda sim se você quiser testar as minhas recomendações são:

- Baixar a aplicação do github;
- exportar para uma IDE java;
- Alterar application.properties para um banco de dados;
- Alterar se necessário o arquivo pom.xml;
- Executar o arquivo pom.xml
- Executar o servidor;
- Preencher a base com dados do arquivo.
- Executar teste via navegador ou PostMan

[aplicação]: <https://desafioapi.herokuapp.com/swagger-ui.html>
[git flow]: <https://danielkummer.github.io/git-flow-cheatsheet/index.pt_BR.html>
[SonarQube]: <https://www.sonarqube.org/>
[Trello]: <https://trello.com/>
