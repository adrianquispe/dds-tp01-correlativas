package entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class InscripcionTest {

    Materia materiaA1;
    Materia materiaA2;
    Materia materiaA3;
    Materia materiaB1;
    Materia materiaB2;
    Alumno alumno1;
    Integer[] corr0 = {};
    Integer[] corr2 = {13};
    Integer[] materias0 = {};
    Integer[] corr1 = {11,12};
    Inscripcion inscripcion;

    @Before
    public void inicialize(){

        materiaA1 = new Materia("algoritmos y estr de datos", "descr ayed", 11, corr0);
        materiaA2 = new Materia("arquitectura de computadoras","descr arq",12, corr0);
        materiaB1 = new Materia("paradigmas de computadores","descr pdep",21,corr1);
        materiaA3 = new Materia("sistemas y org", "desc syo", 13, corr0);
        materiaB2 = new Materia("analisis de sistemas", "descr ads",22, corr2);
        alumno1 = new Alumno("pepe","argento",1234,1001,materias0,materias0);

        ArrayList<Materia> listaMaterias = new ArrayList<Materia>();
        listaMaterias.add(materiaA1);
        listaMaterias.add(materiaA2);
        listaMaterias.add(materiaA3);
        listaMaterias.add(materiaB1);
        listaMaterias.add(materiaB2);

        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        listaAlumnos.add(alumno1);

        inscripcion = new Inscripcion(listaMaterias, listaAlumnos);
    }

    @Test
    public void test1(){
        Integer[] materiasNuevas = {11,12};
        Alumno alumnoEsperado = new Alumno("pepe","argento",1234,1001,materiasNuevas,materias0);
        alumno1.inscribirAMaterias(materiasNuevas);
        Assert.assertEquals(alumnoEsperado,alumno1);
    }
}

