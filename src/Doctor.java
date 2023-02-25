import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;

    Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
