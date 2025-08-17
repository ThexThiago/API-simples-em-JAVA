# [API em java para estudos ]

Um projeto de API simples em Java para estudo e demonstração do uso do framework Spring Boot. Este projeto retorna uma mensagem de "Olá, Thiago!" quando acessado.

## Tecnologias Utilizadas

* **Java 22.0.1**
* **Spring Boot 3.3.0**
* **Maven**
* **IntelliJ IDEA** (ou seu IDE de preferência)

## Como Rodar o Projeto

Para executar a aplicação, você precisa ter o Java 22 ou superior instalado e configurado.

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/ThexThiago/API-simples-em-JAVA]
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd [SimpleApiApplication]
    ```

3.  **Execute a aplicação:**
    Use a sua IDE (IntelliJ IDEA) e clique no botão de `Run` na classe principal `SimpleApiApplication.java`.

    Como alternativa, você pode rodar a aplicação via linha de comando, usando Maven:
    ```bash
    ./mvnw spring-boot:run
    ```

## Endpoints da API

A aplicação estará rodando em `http://localhost:8080`.

### `GET /hello`

Este endpoint retorna uma saudação.

* **URL:** `http://localhost:8080/hello`
* **Método:** `GET`
* **Resposta de Sucesso:**
    ```
    Olá, Thiago!
    ```

## Estrutura do Projeto

A estrutura do projeto segue as convenções do Spring Boot:
