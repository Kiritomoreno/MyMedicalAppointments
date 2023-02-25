import model.*;

import javax.jws.soap.SOAPBinding;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creando una interfaz

        Doctor myDoctor = new Doctor("Andres moreno", "Cirugia");
        myDoctor.addAvaibleAppointment(new Date(), "4pm");
        myDoctor.addAvaibleAppointment(new Date(),"10am");
        myDoctor.addAvaibleAppointment(new Date(),"1 pm");

        System.out.println(myDoctor);

        User user = new Doctor("Leo", "leo@gmail.com");
        user.showDataUser();
        User userPa = new Patient("Robert","Robert@gmail.com");
        userPa.showDataUser();

        // clases Anónimas son temporales
        //Le estamos dando un comportamiento que solo está vigente cuando se usa
        User user1 = new User("Juliet", "Juliet@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctora\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };
        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
        // Si lo mando a llamar y le paso los parametros se estara ejecutando lo que sea que este definido en esta clase AppointmentDoctor()
       // ISchedulable iSchedulable1 = new AppointmentDoctor();
        //iSchedulable1.schedule();

        /*
        Patient patient = new Patient("Alejo", "Alejo@gmail.com");
        System.out.println(patient);
        */


    }

}