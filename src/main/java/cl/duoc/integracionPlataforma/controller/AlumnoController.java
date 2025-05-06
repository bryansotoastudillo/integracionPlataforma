package cl.duoc.integracionPlataforma.controller;

import cl.duoc.integracionPlataforma.models.Alumno;
import cl.duoc.integracionPlataforma.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping
    public List<Alumno> getAlumnos() {
        return alumnoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumno) {
        Alumno nuevoAlumno;

            nuevoAlumno = alumnoRepository.save(alumno);
            return new ResponseEntity<>(nuevoAlumno, HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> getAlumnoPorId(@PathVariable int id) {
        Optional<Alumno> alumnoOpt = alumnoRepository.findById(id);
        if (alumnoOpt.isPresent()) {
            return ResponseEntity.ok(alumnoOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
