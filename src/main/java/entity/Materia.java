package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Materia {

    private String nombre;
    private String descripcion;
    private Integer idMateria;
    private List<Integer> correlativas;

    public Materia(String nombre, String descripcion, Integer idMateria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idMateria = idMateria;
        this.correlativas = new ArrayList<Integer>();
    }

    public Materia(String nombre, String descripcion, Integer idMateria, Integer[] correlativas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idMateria = idMateria;
        this.correlativas = new ArrayList(Arrays.asList(correlativas));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    public List<Integer> getCorrelativas() {
        return correlativas;
    }
    public Integer[] getCorrelativasAsArray(){
        return correlativas.toArray(Integer[]::new);
    }

    public void setCorrelativas(List<Integer> correlativas) {
        this.correlativas = correlativas;
    }

    public Boolean puedeCursar(Alumno alumno){
        return alumno.getMateriasAprobadas().containsAll(correlativas);
    }
}
