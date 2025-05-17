package co.edu.uceva.gestionempleadosbackend.excepciones;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Esta clase es de excepciones personalizadas
@ResponseStatus(value = HttpStatus.NOT_FOUND)//No se ha podido encontrar un empleado
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String mensaje) {
        super(mensaje);
    }
}
