import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        /*Polimorfismo: Sobreescritura de métodos
        Sobreescritura: Cuando una clase hereda de otra y en eseta clase
        hija se redefine un método con una implementación distinta a la clase padre
        Sobreescritura de Constructores: Un constructor en una subclase
         usando los miembros heredados de la superclase con argumentos diferentes
        Por ejemplo nosotros trajimos el método constructor de la super clase gracias a la palabra reservada User
        lo vemos en la clase Patient linea 11 y 12, clase Doctor linea 8 y 9.

         */

        Doctor myDoctor = new Doctor("Andres moreno", "Cirugia");

        Patient patient = new Patient("Alejo", "Alejo@gmail.com");
        System.out.println(patient);



    }


}