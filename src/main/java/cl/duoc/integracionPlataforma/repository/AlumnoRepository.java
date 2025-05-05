package cl.duoc.integracionPlataforma.repository;

import cl.duoc.integracionPlataforma.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository <Alumno,Integer> {
}
