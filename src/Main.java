import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {

        // Llevamos el control del autoincremento con elementos estáticos
        Doctor myDoctor = new Doctor("Andres Torres");
        myDoctor.name = "Alejo Moreno";
        myDoctor.showName();
        myDoctor.showId();


        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();

        UIMenu.showMenu();

    }


}