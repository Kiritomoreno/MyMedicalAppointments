import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Andres moreno", "Cirugia");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejo", "Alejo@gmail.com");
        // Asignación de nombres
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");


    }


}