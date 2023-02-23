import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Andres moreno", "Cirugia");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejo", "Alejo@gmail.com");



    }


}