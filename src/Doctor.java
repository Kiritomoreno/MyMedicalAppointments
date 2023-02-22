import javax.print.Doc;

public class Doctor {
    static int id= 0; // Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");

    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        // Pasamos el dato a la variable global
        // Estamos asignando con this
        this.name = name;
        this.speciality = speciality;

    }

    //Comportamientos
    // Nuestro primer metodo
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
