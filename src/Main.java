import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        /*Polimorfismo: Sobreescribiendo el método
        Vamos a implementar y vamos a sobre escribir el método en la clase Doctor
         */

        Doctor myDoctor = new Doctor("Andres moreno", "Cirugia");
        myDoctor.addAvaibleAppointment(new Date(), "4pm");
        myDoctor.addAvaibleAppointment(new Date(),"10am");
        myDoctor.addAvaibleAppointment(new Date(),"1 pm");

        System.out.println(myDoctor);

        Patient patient = new Patient("Alejo", "Alejo@gmail.com");
        System.out.println(patient);



    }


}