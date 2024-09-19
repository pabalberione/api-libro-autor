# Proyecto de Tienda de Libros con Spring Boot, JPA e Hibernate

Este proyecto es una aplicación simple de gestión de libros y autores desarrollada con Spring Boot, Spring Data JPA e Hibernate. La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) tanto para autores como para libros, y gestiona la relación "Uno a Muchos" entre autores y sus libros.

## Tabla de Contenidos
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Requisitos Previos](#requisitos-previos)
- [Configuración del Proyecto](#configuración-del-proyecto)
- [Ejecutar la Aplicación](#ejecutar-la-aplicación)

## Tecnologías Utilizadas
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- Hibernate
- H2 Database (Base de datos en memoria)
- Maven
- Lombok (para reducir el código boilerplate)

## Requisitos Previos
- JDK 17 o superior
- Maven 3.x
- Un IDE compatible con Spring Boot, como IntelliJ IDEA o Eclipse

## Configuración del Proyecto
1. Clona este repositorio:
    ```bash
    git clone https://github.com/pabalberione/api-libro-autor.git
    ```

2. Accede al directorio del proyecto:
    ```bash
    cd api-libro-autor
    ```

3. Asegúrate de tener instaladas las dependencias necesarias. Puedes hacerlo con Maven:
    ```bash
    mvn clean install
    ```

## Ejecutar la Aplicación
Puedes ejecutar la aplicación desde tu IDE o utilizando Maven en la línea de comandos:
```bash
mvn spring-boot:run
