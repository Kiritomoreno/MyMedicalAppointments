import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creando una interfaz

        Doctor myDoctor = new Doctor("Andres moreno", "Cirugia");
        myDoctor.addAvaibleAppointment(new Date(), "4pm");
        myDoctor.addAvaibleAppointment(new Date(),"10am");
        myDoctor.addAvaibleAppointment(new Date(),"1 pm");

        System.out.println(myDoctor);

        Patient patient = new Patient("Alejo", "Alejo@gmail.com");
        System.out.println(patient);



    }

}