💰 Controle de Gastos
API RESTful para gerenciamento de transações financeiras pessoais.

Construída com Java 17 + Spring Boot 3.5, documentada via Swagger e preparada para rodar com Docker.

📦 Tecnologias Utilizadas
Java 17

Spring Boot 3.5 (Web, Data JPA, H2)

OpenAPI / Swagger 3.0

Docker

Maven

🛠️ Funcionalidades
✅ Criar transação: POST /api/transacoes
✅ Listar todas as transações: GET /api/transacoes
✅ Buscar transação por ID: GET /api/transacoes/{id}
✅ Atualizar transação: PUT /api/transacoes/{id}
✅ Deletar transação: DELETE /api/transacoes/{id}

🔎 Documentação Swagger
Acesse a documentação interativa em:
👉 http://localhost:8080/swagger-ui/index.html

🧪 Rodando Localmente
Com Maven
./mvnw spring-boot:run
Com Docker

docker build -t controle-gastos .
docker run -p 8080:8080 controle-gastos
🗃️ Banco de Dados
Tipo: H2 (em memória)

Console Web: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:<algumIDaleatório>

📁 Estrutura do Projeto
src/
├── controller     # Camada REST
├── dto            # Data Transfer Objects
├── mapper         # Conversões entre entidades e DTOs
├── model          # Entidades JPA
├── repository     # Interfaces JPA
├── service        # Regras de negócio
