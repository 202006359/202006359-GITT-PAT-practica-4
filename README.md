# 202006359-GITT-PAT-practica-4


La estructura del proyecto es:

 - **/controller:** Paquete donde se almacenarán las clases que representan la API-REST del microservicio
 - **/service:** Declaración de la capa de Servicio que será invocada desde la capa API (Controller)
 - **/service/impl:**  Implementación de la capa de servicios. En estas clases se deberá implementar la capa de negocio de nuestros microservicios
 - **/resources/static:** Contenido del HTML, JS y CSS de nuestro portal Web

## Instrucciones de uso

Limpiar dependencias
> mvn clean

Empaquetar microservicio (Jar file)

> mvn package

Ejecutar microservicio en una terminal

> mvn spring-boot-run

## Operaciones disponibles

El servicio actualmente implementa un servicio que admite como parámetro en la URL (Query-param) el size *"160x160"* y el data *"https://github.com"*. Ambos campos son obligatorios, aunque el de size no lo puede tocar el usuario

Mostrar pagina *"index.html"*

> http://localhost:8888/ REVISAR



 

## Funcionalidades extra

Invocar operación *"healthCheck"*

> http://localhost:8888/api/health?name=demo REVISAR
