package pe.edu.cibertec.demo_rest_bdcloud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idalumno;
    private String nomalumno;
    private String apealumno;
    private String proce;
    @ManyToOne
    @JoinColumn(name = "idesp")
    private Especialidad especialidad;

    public Integer getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Integer idalumno) {
        this.idalumno = idalumno;
    }

    public String getNomalumno() {
        return nomalumno;
    }

    public void setNomalumno(String nomalumno) {
        this.nomalumno = nomalumno;
    }

    public String getApealumno() {
        return apealumno;
    }

    public void setApealumno(String apealumno) {
        this.apealumno = apealumno;
    }

    public String getProce() {
        return proce;
    }

    public void setProce(String proce) {
        this.proce = proce;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
