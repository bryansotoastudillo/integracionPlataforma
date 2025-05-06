package cl.duoc.integracionPlataforma.controller;


import cl.duoc.integracionPlataforma.models.Alumno;
import cl.duoc.integracionPlataforma.models.Curso;
import cl.duoc.integracionPlataforma.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Curso> createCurso(@RequestBody Curso curso) {
        Curso cursoCadastrado = cursoRepository.save(curso);
        return new ResponseEntity<>(cursoCadastrado, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> getCursoPorId(@PathVariable int id) {
        Optional<Curso> cursoOpt = cursoRepository.findById(id);
        if (cursoOpt.isPresent()) {
            return ResponseEntity.ok(cursoOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
