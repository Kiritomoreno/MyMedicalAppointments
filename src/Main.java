import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Andres moreno", "Cirugia");
        myDoctor.addAvaibleAppointment(new date(), "4pm");
        myDoctor.addAvaibleAppointment(new date(), "10am");
        myDoctor.addAvaibleAppointment(new date(), "1pm");
        // Muestra las citas -->
        for (Doctor.AvaibleAppointment aA: myDoctor.getAvaibleAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Alejo", "Alejo@gmail.com");
        // Asignación de nombres
        patient.setWeight(54.6);



    }


}