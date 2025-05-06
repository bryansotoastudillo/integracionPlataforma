package cl.duoc.integracionPlataforma.models;


import jakarta.persistence.*;

@Entity
@Table(name="curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "curso_seq_gen")
    @SequenceGenerator(name = "curso_seq_gen", sequenceName = "curso_seq", allocationSize = 1)
    private int id_curso;

    private String nombre_curso;

    private int duracion_meses;

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public int getDuracion_meses() {
        return duracion_meses;
    }

    public void setDuracion_meses(int duracion_meses) {
        this.duracion_meses = duracion_meses;
    }
}
