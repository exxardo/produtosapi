
# Produtos API

Esta é uma API REST simples para gerenciar produtos. Ela permite criar, ler, atualizar e deletar (CRUD) produtos em um sistema. A API é construída com **Spring Boot** e utiliza o **Spring Data JPA** para persistência de dados.

## **Funcionalidades**

A API possui os seguintes endpoints:

### **1. Criar Produto**
- **Método HTTP**: `POST`
- **Endpoint**: `/produtos`
- **Descrição**: Cria um novo produto e o salva no banco de dados.
- **Corpo da Requisição (JSON)**:
```json
{
  "nomeProduto": "Nome do Produto",
  "descricaoProduto": "Descrição do Produto",
  "precoProduto": 100.00
}
```
- **Resposta (JSON)**:
```json
{
  "id": "id-gerado-unico",
  "nomeProduto": "Nome do Produto",
  "descricaoProduto": "Descrição do Produto",
  "precoProduto": 100.00
}
```

### **2. Obter Produto por ID**
- **Método HTTP**: `GET`
- **Endpoint**: `/produtos/{id}`
- **Descrição**: Retorna os detalhes de um produto específico com base no seu ID.
- **Resposta (JSON)**:
```json
{
  "id": "id-do-produto",
  "nomeProduto": "Nome do Produto",
  "descricaoProduto": "Descrição do Produto",
  "precoProduto": 100.00
}
```

### **3. Atualizar Produto**
- **Método HTTP**: `PUT`
- **Endpoint**: `/produtos/{id}`
- **Descrição**: Atualiza as informações de um produto existente.
- **Corpo da Requisição (JSON)**:
```json
{
  "nomeProduto": "Novo Nome do Produto",
  "descricaoProduto": "Nova Descrição do Produto",
  "precoProduto": 150.00
}
```
- **Resposta**: Sem conteúdo (status `200 OK`).

### **4. Deletar Produto**
- **Método HTTP**: `DELETE`
- **Endpoint**: `/produtos/{id}`
- **Descrição**: Remove um produto do banco de dados com base no seu ID.
- **Resposta**: Sem conteúdo (status `204 No Content`).

### **5. Buscar Produto por Nome**
- **Método HTTP**: `GET`
- **Endpoint**: `/produtos?nomeProduto={nome}`
- **Descrição**: Retorna uma lista de produtos cujo nome corresponde ao parâmetro fornecido.
- **Resposta (JSON)**:
```json
[
  {
    "id": "id-do-produto1",
    "nomeProduto": "Nome do Produto",
    "descricaoProduto": "Descrição do Produto",
    "precoProduto": 100.00
  },
  {
    "id": "id-do-produto2",
    "nomeProduto": "Nome do Produto",
    "descricaoProduto": "Outra Descrição",
    "precoProduto": 200.00
  }
]
```

## **Configuração e Execução**

### Pré-requisitos
Certifique-se de ter instalado:
- Java JDK (versão 11 ou superior)
- Maven
- Banco de dados relacional (ex.: MySQL, PostgreSQL, H2)

### Passos para executar o projeto
1. Clone este repositório:
```bash
git clone <url-do-repositorio>
cd produtos-api
```
2. Configure o arquivo `application.properties` com as credenciais do banco de dados.
3. Compile e execute a aplicação:
```bash
mvn spring-boot:run
```
4. Acesse a API em `http://localhost:8080/produtos`.

## Estrutura do Projeto

A estrutura principal dos arquivos é a seguinte:

```plaintext
src/
├── main/
│ ├── java/com/eduardoramiro/produtosapi/
│ │ ├── controller/ # Controladores REST (ex.: ProdutoController.java)
│ │ ├── model/ # Classes de modelo/entidade (ex.: Produto.java)
│ │ ├── repository/ # Interfaces de repositório JPA (ex.: ProdutoRepository.java)
│ └── resources/
│ ├── application.properties # Configurações da aplicação
```

## Tecnologias Utilizadas

- Java (Spring Boot)
- Spring Data JPA
- Banco de Dados Relacional (compatível com MySQL, PostgreSQL ou H2)
- Maven