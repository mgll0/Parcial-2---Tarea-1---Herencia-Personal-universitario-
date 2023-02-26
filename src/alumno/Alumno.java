package alumno;
import persona.Persona;

public class Alumno extends Persona {
    String code; //package private


    public void doSomething() {
        //edad--; // Toma atributos de persona pero no puede verlos ya que edad es Private
    }
}
