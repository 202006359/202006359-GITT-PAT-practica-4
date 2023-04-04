# 202006359-GITT-PAT-practica-4


La estructura del proyecto es:

 - **/controller:** Paquete donde se almacenán las clases que representan la API-REST del microservicio
 - **/service:** Declaración de la capa de Servicio que es invocada desde la capa API (Controller)
 - **/service/impl:**  Implementación de la capa de servicios. En estas clases se implementa la capa de negocio de los microservicios
 - **/resources/static:** Contenido del HTML, JS y CSS del portal Web

## Instrucciones de uso
> Levantar el servicio: Darle a run en la clase QRApplication, está se encargará de arrancar en Spring Boot
## Operaciones disponibles

El servicio actualmente implementa un servicio de llamada a una API, esta API lo que hace es devolver una imagen con el QR solicitado. Admite como parámetro en la URL (Query-param) el size *"160x160"* y el data *"https://github.com"*. Ambos campos son obligatorios, aunque el de size no lo puede tocar el usuario.

CrearQR *"CreateQR.html"*

> http://localhost:8888/icai/CreateQR?size=160x160&data=https://github.com

Ver estado del servicio
> http://localhost:8888/icai/CreateQR/health



## Funcionalidades extra
 - **import org.springframework.web.client.RestClientException** Al importar esta clase, se pueden manejar los errores que pueden ocurrir al ejecutar las solicitudes HTTP y asegurar que la aplicación pueda manejar cualquier error de manera adecuada.
- **import org.springframework.web.bind.annotation.CrossOrigin** La anotación "CrossOrigin" (@CrossOrigin(origins = {"http://127.0.0.1:5500/","https://202006359.github.io"})) permite a los controladores de Spring configurar y manejar las solicitudes CORS, lo que puede ser útil para permitir que las aplicaciones web realicen solicitudes de origen cruzado y para evitar que las solicitudes sean bloqueadas por los navegadores, i.e. Chrome.
- **import lombok.extern.slf4j.Slf4j** Para tener un control en tiempo real de lo que va ocurriendo en la ejecución del programa. A través de las funciones log.info y log.error.
- **Automator icai/CreateQR/health** Me dice si el servicio de generar QR se ha levantado correctamente
> http://localhost:8888/icai/CreateQR/health
