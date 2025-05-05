package cl.duoc.integracionPlataforma.controller;

import cl.duoc.integracionPlataforma.models.Alumno;
import cl.duoc.integracionPlataforma.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping
    public List<Alumno> getAlumnos() {
        return alumnoRepository.findAll();
    }

}
