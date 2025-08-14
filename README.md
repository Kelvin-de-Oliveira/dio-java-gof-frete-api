# 🚚 Frete API

API REST desenvolvida em **Java** com **Spring Boot**, com objetivo **didático** de aplicar e demonstrar na prática alguns dos principais **padrões de projeto** da programação orientada a objetos:

- **Singleton**
- **Strategy**
- **Facade**

Este projeto faz parte da minha participação no programa **Santander 2025 - Back-End com Java**.

---

## 🎯 Objetivo do Projeto
O **Frete API** foi criado para exemplificar como aplicar padrões de projeto no desenvolvimento de APIs utilizando **Spring Boot**, aproveitando as abstrações e recursos que a própria framework oferece, como injeção de dependências, escopos de beans e arquitetura em camadas.

---

## 🛠 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot 3+**
- **Maven** (com Wrapper)
---

## 🗂 Estrutura de Padrões de Projeto no Código
- **Singleton**  
  Implementado para manter um **cache em memória** dos cálculos de frete (`CacheFreteService`), evitando recomputações desnecessárias.

- **Strategy**  
  Cada transportadora implementa sua **estratégia de cálculo** de frete (`CalculoFrete` + implementações concretas).

- **Facade**  
  Classe `FreteFacade` centraliza e simplifica a lógica, coordenando o uso do cache e das estratégias, expondo um único ponto de entrada para o controller.

---

## 📦 Como Executar

### 1. Clonar o repositório
```bash
git clone https://github.com/seu-usuario/frete-api.git
cd frete-api
```

### 2. Executar com Maven Wrapper
```bash
./mvnw spring-boot:run
```
*(No Windows, usar `mvnw.cmd spring-boot:run`)*

### 3. Acessar a API
A aplicação estará disponível em:
```
http://localhost:8080
```

---

## 📌 Exemplos de Uso

### Calcular frete usando SEDEX
```
GET http://localhost:8080/frete?transportadora=sedex&peso=5&distancia=100
```

### Calcular frete usando Transportadora X
```
GET http://localhost:8080/frete?transportadora=transportadoraX&peso=3&distancia=50
```

---

## 📂 Estrutura do Projeto
```
src/
 ├── main/
 │    ├── java/com/exemplo/freteapi/
 │    │    ├── controller/      # Controllers REST
 │    │    ├── facade/          # Facade
 │    │    ├── service/         # Estratégias + Singleton
 │    │    └── FreteApiApplication.java
 │    └── resources/            # Configurações e propriedades
 └── test/                      # Testes unitários e de integração
```

---

