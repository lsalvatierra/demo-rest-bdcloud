package pe.edu.cibertec.demo_rest_bdcloud.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.demo_rest_bdcloud.model.Alumno;
import pe.edu.cibertec.demo_rest_bdcloud.repository.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    public List<Alumno> listarAlumnos(){
        return alumnoRepository.findAll();
    }
}
