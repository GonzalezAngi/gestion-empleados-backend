package co.edu.uceva.gestionempleadosbackend.repositorio;

import co.edu.uceva.gestionempleadosbackend.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {

}
