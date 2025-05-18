package co.edu.uceva.gestionempleadosbackend.controlador;


import co.edu.uceva.gestionempleadosbackend.modelo.Empleado;
import co.edu.uceva.gestionempleadosbackend.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController// Esta va ser una api rest
@RequestMapping("/api/v1/")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio repositorio;

    @GetMapping("/empleados")
    public List<Empleado> listarTodosLosEmpleados() {
        return repositorio.findAll();

    }
}
