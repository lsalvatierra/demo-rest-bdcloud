package pe.edu.cibertec.demo_rest_bdcloud.model;

import jakarta.persistence.*;

@Table(name = "especialidad")
@Entity
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idesp;
    private String nomesp;
    private Double costo;

    public Integer getIdesp() {
        return idesp;
    }

    public void setIdesp(Integer idesp) {
        this.idesp = idesp;
    }

    public String getNomesp() {
        return nomesp;
    }

    public void setNomesp(String nomesp) {
        this.nomesp = nomesp;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
