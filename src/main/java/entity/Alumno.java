package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alumno {

    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer legajo;
    private List<Integer> materiasEnCurso;
    private List<Integer> materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer dni, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
        this.materiasEnCurso = new ArrayList<Integer>();
        this.materiasAprobadas = new ArrayList<Integer>();
    }

    public Alumno(String nombre, String apellido, Integer dni, Integer legajo, Integer[] listMateriasEnCurso, Integer[] listMateriasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
        this.materiasEnCurso = new ArrayList(Arrays.asList(listMateriasEnCurso));
        this.materiasAprobadas = new ArrayList(Arrays.asList(listMateriasAprobadas));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public List<Integer> getMateriasEnCurso() {
        return materiasEnCurso;
    }

    public void setMateriasEnCurso(List<Integer> materiasEnCurso) {
        this.materiasEnCurso = materiasEnCurso;
    }

    public List<Integer> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Integer> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void agregarMateriaAprovada(Integer idMateria){
        materiasAprobadas.add(idMateria);
    }
    public void agregarMateriaEnCurso(Integer idMateria){
        materiasEnCurso.add(idMateria);
    }
    public Boolean tieneAprobada(Integer idMateria){
        return materiasAprobadas.contains(idMateria);
    }
    public void inscribirAMaterias(Integer[] listaMaterias){
        for(Integer materia :listaMaterias){
            agregarMateriaEnCurso(materia);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Alumno)) {
            return false;
        }

        final Alumno objAlum = (Alumno) obj;

        return nombre.equals(objAlum.getNombre()) &&
                apellido.equals(objAlum.getApellido()) &&
                legajo.equals(objAlum.legajo) &&
                dni.equals(objAlum.getDni()) &&
                materiasEnCurso.equals(objAlum.getMateriasEnCurso()) &&
                materiasAprobadas.equals(objAlum.getMateriasAprobadas());
    }
}
