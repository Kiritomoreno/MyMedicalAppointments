import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id= 0; // Autoincrement
    private String name;
    private String speciality;

    // Avaiable appointment está vinculado con el Doctor
    // la mejor solución crear una clase independiente

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

    // Primer encuentro con colecciones
    ArrayList<AvaibleAppointment> avaibleAppointments = new ArrayList<>();
    // crear un método al nivel de la clase. Que va a estar añadiendo una nueva cita, que se acumula en este array
    public void addAvaibleAppointment(Date date, String time){
        //recive como parametros los datos de la clase AvaibleAppointments
        avaibleAppointments.add(new AvaibleAppointment(date, time));
    }
    //Si quiero devolver las citas completas -->
    public ArrayList<AvaibleAppointment> getAvaibleAppointments(){
        return avaibleAppointments;
    }

    public static class AvaibleAppointment{
        private int id;
        private Date date;
        private String time;
        // Constructor -->
        public AvaibleAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }
        // Getter y Setter -->

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
