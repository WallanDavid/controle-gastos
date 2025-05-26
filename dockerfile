# Etapa de build
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# Etapa final com imagem mais enxuta
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY --from=build /app/target/controle-gastos-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]