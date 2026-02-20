package pe.edu.cibertec.demo_rest_bdcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.demo_rest_bdcloud.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
