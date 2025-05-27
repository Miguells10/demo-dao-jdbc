# Projeto JDBC - Demo DAO com Java

Este projeto é uma implementação prática de acesso a banco de dados utilizando JDBC com Java, seguindo os princípios do padrão de projeto DAO (Data Access Object).

Desenvolvido durante o curso **"Programação Orientada a Objetos com Java"** do Prof. Dr. Nélio Alves.

## 📚 Objetivos

- Entender o funcionamento da API JDBC.
- Aprender a conectar aplicações Java a bancos de dados relacionais.
- Implementar operações CRUD (Create, Read, Update, Delete) usando JDBC.
- Aplicar o padrão de projeto DAO manualmente.

## 🛠️ Tecnologias e Ferramentas

- **Java SE 8 ou superior**
- **JDBC (Java Database Connectivity)**
- **MySQL Server e MySQL Workbench**
- **Driver MySQL Connector/J**
- **Eclipse IDE (ou qualquer IDE de sua preferência)**

## 🔗 Links úteis

- Documentação JDBC:
  - https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/
  - https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html
- Curso do Prof. Nélio Alves:
  - http://educandoweb.com.br
- Projeto base do curso:
  - https://github.com/acenelio/demo-dao-jdbc

## 💾 Banco de Dados

### 📑 Script SQL

O script para criar e popular a base de dados está disponível no repositório do curso:

- [database.sql](https://github.com/acenelio/demo-dao-jdbc/blob/master/database.sql)

### 📂 Configuração do arquivo `db.properties`

Na raiz do projeto, crie o arquivo `db.properties` com os dados de conexão:

user=developer
password=1234567
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false

## 🏗️ Estrutura do Projeto

- **Entidades:**
  - `Seller`
  - `Department`

- **Camada DAO:**
  - Interfaces:
    - `SellerDao`
    - `DepartmentDao`
  - Implementações:
    - `SellerDaoJDBC`
    - `DepartmentDaoJDBC`
  - `DaoFactory` (Fábrica para instanciar os DAOs)

- **Utilitários:**
  - Classe `DB` para conexão com o banco e gerenciamento de recursos
  - Exceções personalizadas:
    - `DbException`
    - `DbIntegrityException`

- **Programas de teste:**
  - `Program.java` (Testes da entidade Seller)
  - `Program2.java` (Testes da entidade Department)

## 🔧 Funcionalidades Implementadas

- 🔍 Buscar por ID
- 🔍 Buscar por departamento
- 🔍 Buscar todos
- ➕ Inserir registros
- 🔄 Atualizar registros
- ❌ Deletar registros

## 🚀 Como executar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/Miguells10/demo-dao-jdbc

