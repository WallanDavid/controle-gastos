![Coverage](https://img.shields.io/badge/Coverage-4%25-red)

## 🔎 Relatório de Cobertura de Testes

<img src="./docs/jacoco-coverage.png" alt="Cobertura Jacoco" width="100%">


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


![Build Status](https://github.com/WallanDavid/controle-gastos/actions/workflows/docker.yml/badge.svg)
![Docker Pulls](https://img.shields.io/docker/pulls/bobwallan/controle-gastos)
![License](https://img.shields.io/badge/license-MIT-blue.svg)

### 📊 Cobertura de Testes

![Cobertura Jacoco](docs/jacoco-coverage.png)

### 🖼️ Print da aplicação rodando

![App Running](docs/app-running.png)


### 🚀 Deploy com Docker

```bash
docker pull bobwallan/controle-gastos:latest


---

### ✅ 2. **Subir o frontend no Netlify**

**A) Acesse:** [https://app.netlify.com](https://app.netlify.com)

**B) Passos:**
1. Clique em **"Add new site" > "Import an existing project"**.
2. Selecione o GitHub como origem e conecte sua conta.
3. Escolha o repositório `controle-gastos-frontend`.
4. Configure:
   - **Branch:** `main`
   - **Build command:** `npm run build`
   - **Publish directory:** `dist` (ou `build`, depende do framework — React normalmente usa `build`).
5. Clique em “Deploy site”.

**C) Depois de publicado:**
- Vá em **"Site settings" > Domain management** e personalize o nome do subdomínio.

---

Quando terminar essas etapas, você vai ter:

✅ Backend Spring Boot com Docker e CI/CD  
✅ Frontend React no ar via Netlify  
✅ README com prints e badges  
✅ Projeto fullstack **pronto pra impressionar qualquer recrutador**  

Se quiser, posso te ajudar a formatar o README inteiro agora. Só pedir!


💼 Autor
Desenvolvido por Wallan Peixoto @bobwallan como parte do portfólio profissional. Projeto 100% open-source e didático
