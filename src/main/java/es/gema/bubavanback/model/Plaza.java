package es.gema.bubavanback.model;
 
import jakarta.persistence.*;
 
@Entity
public class Plaza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private Boolean disponible;
    private Boolean conLuz;
 
    // Getters y Setters
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getTipo() {
        return tipo;
    }
 
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
    public Boolean getDisponible() {
        return disponible;
    }
 
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
 
    public Boolean getConLuz() {
        return conLuz;
    }
 
    public void setConLuz(Boolean conLuz) {
        this.conLuz = conLuz;
    }
}