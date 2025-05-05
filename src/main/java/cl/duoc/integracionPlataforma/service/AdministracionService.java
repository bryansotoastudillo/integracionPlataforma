package cl.duoc.integracionPlataforma.service;

import cl.duoc.integracionPlataforma.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministracionService {

    @Autowired
    private AlumnoRepository alumnoRepository;
}
