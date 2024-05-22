# Etapa 1: Construir a aplicação com Maven
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app

# Copiar os arquivos de configuração do Maven e o pom.xml
COPY pom.xml ./
COPY src ./src

# Compilar a aplicação e empacotar em um arquivo JAR
RUN mvn clean package -DskipTests

# Etapa 2: Criar a imagem final
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copiar o arquivo JAR da etapa de build
COPY --from=build /app/target/curso-api-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta que a aplicação usará
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
