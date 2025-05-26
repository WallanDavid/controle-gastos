![Coverage](https://img.shields.io/badge/Coverage-4%25-red)

Controle de Gastos - API REST
API REST em Java com Spring Boot para controle financeiro pessoal. O projeto permite registrar, atualizar, listar, excluir e consultar transações financeiras, categorizadas por tipo, data, valor e descrição.

📊 Visão Geral
Backend: Java 17 + Spring Boot 3.5
Banco: H2 em memória (ideal para testes)
Documentação: Swagger/OpenAPI 3
Empacotamento: Maven
Deploy: Dockerizado

📚 Funcionalidades
GET /api/transacoes - Listar todas as transações
POST /api/transacoes - Criar nova transação
GET /api/transacoes/{id} - Buscar transação por ID
PUT /api/transacoes/{id} - Atualizar uma transação
DELETE /api/transacoes/{id} - Deletar uma transação

🔧 Tecnologias Usadas

Spring Web
Spring Data JPA
H2 Database
Bean Validation
Swagger UI com Springdoc OpenAPI
Maven Wrapper
Docker (imagem publicada)

📦 Como Executar Localmente

# Clonar repositório
git clone https://github.com/WallanDavid/controle-gastos.git
cd controle-gastos

# Rodar com Maven
./mvnw spring-boot:run

# Acessar Swagger: http://localhost:8080/swagger-ui/index.html

📦 Docker

Build da imagem:
docker build -t controle-gastos .
Rodar localmente:
docker run -p 8080:8080 controle-gastos
Imagem publicada:
👉 Docker Hub - bobwallan/controle-gastos
📄 Swagger (Documentação interativa)

http://localhost:8080/swagger-ui/index.html

💼 Autor
Desenvolvido por Wallan Peixoto @bobwallan como parte do portfólio profissional. Projeto 100% open-source e didático
