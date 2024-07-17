<h1>Challenge Foro Hub</h1>

# Objetivo: :dart:

implementar una API REST con las siguientes funcionalidades:

    * API con rutas implementadas siguiendo las mejores prácticas del modelo REST;
    * Validaciones realizadas según las reglas de negocio;
    * Implementación de una base de datos relacional para la persistencia de la información;
    * Servicio de autenticación/autorización para restringir el acceso a la información

<h2>Requisitos técnicos:</h2>

    ✨ Java JDK: versión 17 en adelante 
    ✨ Maven: versión 4 en adelante
    ✨ Spring Boot: versión 3 en adelante - https://start.spring.io/
    ✨ MySQL: versión 8 en adelante 
    ✨ IDE (Entorno de desarrollo integrado) IntelliJ IDEA 

<h2>Para probar su funcionaminto puedes utilizar Postman o Insomnia realizando lo siguiente: </h2>

    ✨ GET /api/topics: Obtener todos los tópicos.
    ✨ POST /api/topics: Crear un nuevo tópico.
    ✨ GET /api/topics/{id}: Obtener un tópico específico por su ID.
    ✨ PUT /api/topics/{id}: Actualizar un tópico existente.
    ✨ DELETE /api/topics/{id}: Eliminar un tópico por su ID.

  <h2>Importante: No olvides configurar tu proyecto en Spring Initializr</h2>
  
    Java (versión 17 en adelante)
    Maven (Initializr utiliza la versión 4)
    Spring Boot
    Proyecto en formato JAR

<h2>Adiciona las dependencias para agregar al crear el proyecto con Spring Initializr:</h2>

    ✨ Lombok
    ✨ Spring Web
    ✨ Spring Boot DevTools
    ✨ Spring Data JPA
    ✨ Flyway Migration
    ✨ MySQL Driver
    ✨ Validation
    ✨ Spring Security
