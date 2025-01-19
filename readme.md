

# Produtos API

## Descrição Breve do Projeto

O projeto **Produtos API** é uma aplicação desenvolvida para gerenciar informações de produtos, permitindo operações como criação, leitura, atualização e exclusão (CRUD). A API foi construída utilizando o framework Spring Boot e segue os princípios RESTful para facilitar a integração com outros sistemas.

## Problema Resolvido

A API resolve a necessidade de um sistema eficiente para gerenciar o catálogo de produtos de uma empresa. Com ela, é possível centralizar e organizar informações como nome, descrição e preço dos produtos, garantindo acessibilidade e consistência nos dados.

## Instruções de Instalação e Execução

### Pré-requisitos

- Java 17 ou superior
- Maven 3.8 ou superior
- Banco de dados configurado (MySQL ou outro compatível com JPA)

### Passos para Instalação

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-repositorio/produtos-api.git
    cd produtos-api
    ```

2. Configure o arquivo `application.properties` localizado em `src/main/resources` com as credenciais do banco de dados:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/produtosdb
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    ```

3. Compile o projeto usando Maven:

    ```bash
    mvn clean install
    ```

### Executando a Aplicação

1. Inicie a aplicação:

    ```bash
    mvn spring-boot:run
    ```

2. Acesse a API na URL padrão:

    ```
    http://localhost:8080/produtos
    ```

## Como Contribuir

1. Faça um fork do repositório.
2. Crie uma branch para sua feature:

    ```bash
    git checkout -b minha-feature
    ```

3. Realize as alterações necessárias e faça commits claros.
4. Envie um pull request descrevendo suas alterações.

## Documentação dos Endpoints

| Método HTTP | Endpoint             | Descrição                                 | Parâmetros |
|-------------|----------------------|-------------------------------------------|------------|
| POST        | /produtos            | Adiciona um novo produto                 | Corpo da requisição: JSON com `nomeProduto`, `descricaoProduto`, `precoProduto` |
| GET         | /produtos/{id}       | Retorna um produto pelo ID               | Parâmetro na URL: `{id}` (String) |
| PUT         | /produtos/{id}       | Atualiza um produto pelo ID              | Parâmetro na URL: `{id}` (String), corpo da requisição: JSON atualizado |
| DELETE      | /produtos/{id}       | Remove um produto pelo ID                | Parâmetro na URL: `{id}` (String) |
| GET         | /produtos            | Busca produtos pelo nome                 | Query param: `nomeProduto` (String) |

## Exemplos de Consumo da API

### Criar Produto

**Requisição:**

```http
POST /produtos HTTP/1.1
Content-Type: application/json

{
  "nomeProduto": "Notebook",
  "descricaoProduto": "Notebook Dell Inspiron",
  "precoProduto": 3500.00
}
```

**Resposta:**

```json
{
  "id": "123e4567-e89b-12d3-a456-426614174000",
  "nomeProduto": "Notebook",
  "descricaoProduto": "Notebook Dell Inspiron",
  "precoProduto": 3500.00
}
```

### Buscar Produto por ID

**Requisição:**

```http
GET /produtos/123e4567-e89b-12d3-a456-426614174000 HTTP/1.1
```

**Resposta:**

```json
{
  "id": "123e4567-e89b-12d3-a456-426614174000",
  "nomeProduto": "Notebook",
  "descricaoProduto": "Notebook Dell Inspiron",
  "precoProduto": 3500.00
}
```

### Atualizar Produto

**Requisição:**

```http
PUT /produtos/123e4567-e89b-12d3-a456-426614174000 HTTP/1.1
Content-Type: application/json

{
  "nomeProduto": "Notebook Gamer",
  "descricaoProduto": "Notebook Dell Inspiron Gamer",
  "precoProduto": 4500.00
}
```

**Resposta:**

```json
{
  "id": "123e4567-e89b-12d3-a456-426614174000",
  "nomeProduto": "Notebook Gamer",
  "descricaoProduto": "Notebook Dell Inspiron Gamer",
  "precoProduto": 4500.00
}
```

### Excluir Produto

**Requisição:**

```http
DELETE /produtos/123e4567-e89b-12d3-a456-426614174000 HTTP/1.1
```

**Resposta:**

```json
{
  "message": "Produto removido com sucesso."
}
```

### Buscar Produtos por Nome

**Requisição:**

```http
GET /produtos?nomeProduto=Notebook HTTP/1.1
```

**Resposta:**

```json
[
  {
    "id": "123e4567-e89b-12d3-a456-426614174000",
    "nomeProduto": "Notebook Gamer",
    "descricaoProduto": "Notebook Dell Inspiron Gamer",
    "precoProduto": 4500.00
  }
]
```

## Principais Features

- Operações CRUD completas para gerenciamento de produtos.
- Busca de produtos por nome com filtro case-insensitive.
- Integração com banco de dados relacional via JPA.

## Padrões Adotados

- **RESTful Design**: Para garantir que a API seja intuitiva e fácil de consumir.
- **Repository Pattern**: Para separar a lógica de acesso ao banco de dados.
- **DTOs (Data Transfer Objects)**: Utilizados para transferir dados entre camadas, garantindo encapsulamento.

## Style Guide Seguido

O projeto segue as diretrizes de código limpo (Clean Code), com foco em legibilidade e manutenção:

- Uso de nomenclatura clara para classes, métodos e variáveis.
- Comentários explicativos apenas onde necessário.
- Organização modular do código, facilitando a escalabilidade.

## Aprendizados no Projeto

Durante o desenvolvimento desta API, foram aprofundados conhecimentos sobre:

- Implementação de APIs RESTful utilizando Spring Boot.
- Uso do padrão Repository para abstração do acesso a dados.
- Boas práticas em documentação técnica, como uso de Swagger/OpenAPI para descrever endpoints.

Essa documentação visa oferecer uma visão clara do projeto e facilitar sua utilização e contribuição futura!
