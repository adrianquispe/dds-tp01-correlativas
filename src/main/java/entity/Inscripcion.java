package entity;

import java.util.List;

public class Inscripcion {

    private List<Materia> listaMaterias;
    private List<Alumno> listaAlumnos;

    public Inscripcion(List<Materia> listaMaterias, List<Alumno> listaAlumnos) {
        this.listaMaterias = listaMaterias;
        this.listaAlumnos = listaAlumnos;
    }

    private Materia getMateriaPorID (Integer idMateria){
        return listaMaterias.get(idMateria);
    }

    private Alumno getAlumnoPorID (Integer idAlumno){
        return listaAlumnos.get(idAlumno);
    }
    public Boolean cumpleCorrelativas(Integer idAlumno, Integer idMateria){
        Alumno alumno = getAlumnoPorID(idAlumno);
        Materia materia = getMateriaPorID(idMateria);
        return materia.puedeCursar(alumno);
    }
    public boolean aprobada(Integer idAlumno, Integer[] listaMaterias){
        Alumno alumno = getAlumnoPorID(idAlumno);
        boolean estadoInscripcion = true;
        for(Integer materia : listaMaterias){
            if(!cumpleCorrelativas(idAlumno, materia)){
                estadoInscripcion = false;
                break;
            }
        }
        if(estadoInscripcion)
            alumno.inscribirAMaterias(listaMaterias);
        return estadoInscripcion;
    }
}
