package pe.edu.cibertec.demo_rest_bdcloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.demo_rest_bdcloud.model.Alumno;
import pe.edu.cibertec.demo_rest_bdcloud.service.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alumno")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    //localhost:8080/api/v1/alumno
    @GetMapping
    public ResponseEntity<List<Alumno>> listarAlumnos(){
        return ResponseEntity.ok(alumnoService.listarAlumnos());
    }




}
