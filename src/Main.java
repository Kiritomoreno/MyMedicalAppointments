import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        // Llevamos el control del autoincremento con elementos estáticos
        Doctor myDoctor = new Doctor("Andres Torres");
        myDoctor.name = "Alejo Moreno";
        myDoctor.showName();
        myDoctor.showId();


        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();

        showMenu();
        // una forma de hacerlo modular para usar nuestra parte estatica
        //sabemos que conceptual mente  no esta bien crear nuestro menu porque podemos llamarlo solamente ui.UIMenu.
        /*
        Para ahorrarme el nombre de la clase tengo  que crear una carpeta con la opción package y creamos la carpeta ui.
         */

    }


}