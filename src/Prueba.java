import alumno.Alumno;
import university.people.Employee;
import university.people.Person;

/*
private -> Solo dentro de la clase;

default (sin palabra reservada) -> package private

protected -> haya visibilidad en clases hijas y en las del paquete



 */

class Prueba {
    public static void main (String[] args){
        Alumno alumno = new Alumno();

        alumno.cumpleAños();

        //alumno.code = ""; // code es package private
    }


}


