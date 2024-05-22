package es.gema.bubavanback.model;
 
import jakarta.persistence.*;
import java.time.LocalDate;
 
@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private String matricula;
    private LocalDate fechaReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private String dni;
 
    @ManyToOne
    @JoinColumn(name = "id_plaza")
    private Plaza plaza;
 
    // Getters y Setters
 
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
 
    public String getApellido1() {
        return apellido1;
    }
 
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
 
    public String getApellido2() {
        return apellido2;
    }
 
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
 
    public String getTelefono() {
        return telefono;
    }
 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getMatricula() {
        return matricula;
    }
 
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
 
    public LocalDate getFechaReserva() {
        return fechaReserva;
    }
 
    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
 
    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }
 
    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
 
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }
 
    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
 
    public String getDni() {
        return dni;
    }
 
    public void setDni(String dni) {
        this.dni = dni;
    }
 
    public Plaza getPlaza() {
        return plaza;
    }
 
    public void setPlaza(Plaza plaza) {
        this.plaza = plaza;
    }
}