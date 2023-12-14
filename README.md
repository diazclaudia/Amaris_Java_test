# Prueba técnica para Amaris consulting

## Backend

El Backend está desarrollado en Spring Boot con Java 11.

### Arquitectura:

La arquitectura que se usó para backend está basada en la arquitectura DDD (Domain Driven Desing) en donde se hizo la separación de las capas en el proyecto:

![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/0e7ede22-2f36-4621-af24-000c0c862e7a)

Organización de las capas del proyecto:

![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/f6c3b93b-6146-4905-b784-603e623ccd4d)


### Pruebas unitarias:

Esta es la captura de las pruebas unitarias funcionando:

![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/dbb899e2-d863-403d-8630-8c04e2e5ce6f)

### Curls de los endpoints:

Endpoint Ping:

```curl --location 'http://localhost:8080/ping```

Endpoint Get Employees:

```curl --location 'http://localhost:8080/employees'```

Endpoint Get Employee by ID:

``` curl --location 'http://localhost:8080/employee/1' ```

## Frontend

El Frontend fue desarrollado en React, en donde se consumieron los endpoints expuestos en docker.

* Pagina principal:

![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/834f2800-3b98-4cf4-98a9-093aa3fa45fd)


* Lista de empleados:

![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/396581e6-c076-4060-9928-2991c85b2292)

* Empleado por ID:

![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/9bf3ef2b-b390-4ee5-bc83-0e0cf5b12e87)


# Cómo desplegar la aplicación en Docker

1. Tener instalado previamente en local Docker
2. Clonar el proyecto en local ``` git clone https://github.com/diazclaudia/Amaris_Java_test.git ```
3. Ubicarse dentro de la carpeta en la raíz del proyecto fuera de las carpetas de backend y frontend ``` cd Amaris_Java_test ```
4. Ejecutar el comando para construir el contenedor ``` docker-compose up --build -d ```
   
![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/5baaff1b-301c-452c-a5e5-3f12d20e6197)

6. Deberán aparecer los contenedores en el docker como la siguiente imagen:
   
![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/92ff55ef-77b9-45a4-b075-6a96ca9aaeab)

7. También deben aparecer dos imagenes, una para el back y otra para el front:
   
![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/2ef5408a-3890-463c-ac9f-eda3cab488e6)

8. Luego de eso ir al siguiente link para ver el front http://localhost:3000/
9. También desde postman se pueden ejecutar los curls mencionados en la sección de Back antes
   
![image](https://github.com/diazclaudia/Amaris_Java_test/assets/16843197/fcb401b0-dbbf-41ee-8795-9e0e912d799e)





