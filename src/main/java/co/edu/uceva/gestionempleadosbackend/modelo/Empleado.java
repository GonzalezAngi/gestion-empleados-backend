package co.edu.uceva.gestionempleadosbackend.modelo;

import jakarta.persistence.*;

@Entity //para indicar que esta es la entidad
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // indica que el id sera generado automaticámente por la base de datos y es autoincrementable
    private long id;

    @Column(name = "nombre", length = 60, nullable = false) // nullable indica que no acepta valores null
    private String nombre;

    @Column(name = "apellido", length = 60, nullable = false)
    private String apellido;

    @Column(name = "email", length = 60, nullable = false, unique = true) //unique indica que el email es unico
    private String email;

    public Empleado() {
    }

    public Empleado(long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
