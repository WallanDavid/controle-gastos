# 💸 Controle de Gastos - API REST com Spring Boot

Projeto pessoal para gerenciar gastos, com CRUD completo, banco PostgreSQL e arquitetura modular.

## 🚀 Tecnologias
- Java 17
- Spring Boot 3.5.0
- Spring Data JPA
- PostgreSQL
- Maven

## 📦 Endpoints REST

| Método | Rota              | Ação                |
|--------|-------------------|---------------------|
| GET    | `/gastos`         | Listar todos        |
| GET    | `/gastos/{id}`    | Buscar por ID       |
| POST   | `/gastos`         | Criar gasto         |
| PUT    | `/gastos/{id}`    | Atualizar gasto     |
| DELETE | `/gastos/{id}`    | Deletar gasto       |

### 🔧 Exemplo de requisição POST
```json
{
  "descricao": "Netflix",
  "valor": 39.90,
  "data": "2025-05-25"
}
