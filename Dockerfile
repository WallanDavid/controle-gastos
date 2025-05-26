# 🔧 Etapa de build
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app

# Copia apenas os arquivos necessários primeiro (melhora cache)
COPY mvnw mvnw
COPY .mvn .mvn
COPY pom.xml pom.xml

# Baixa dependências no cache Docker
RUN ./mvnw dependency:go-offline -B

# Agora sim copia o restante
COPY src src

# Compila o projeto
RUN ./mvnw clean package -DskipTests

# 🚀 Etapa final (runtime enxuto)
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copia apenas o jar gerado da etapa de build
COPY --from=build /app/target/gastos-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta padrão da aplicação
EXPOSE 8080

# Inicia o app
ENTRYPOINT ["java", "-jar", "app.jar"]
