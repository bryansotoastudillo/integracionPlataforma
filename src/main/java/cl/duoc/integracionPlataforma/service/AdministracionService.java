package cl.duoc.integracionPlataforma.service;

import cl.duoc.integracionPlataforma.repository.AlumnoRepository;
import cl.duoc.integracionPlataforma.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministracionService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private CursoRepository cursoRepository;
}
