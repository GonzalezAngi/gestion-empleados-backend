package co.edu.uceva.gestionempleadosbackend.modelo;

import jakarta.persistence.*;

@Entity // Indica que esta es la entidad
@Table(name = "empleados")//Indica el nombre de la tabla
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Indica que el id va ser generico en la base de datos y autoincrementable
    private Long id;

    @Column(name = "nombre", length = 60, nullable = false)//nullable, no va a aceptar valores nulos
    private String nombre;

    @Column(name = "apellido", length = 60, nullable = false)
    private String apellido;

    @Column(name = "apellido", length = 60, nullable = false, unique = true)
//unique, solo va a tener un valor, es decir es único
    private String email;

    public Empleado() {
    }

    public Empleado(Long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
