package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;
// método constructor -->
    public Doctor(String name, String email){
        super(name,email);
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
    public void addAvaibleAppointment(String date, String time){

        //recive como parametros los datos de la clase AvaibleAppointments
        avaibleAppointments.add(new AvaibleAppointment(date, time));
    }
    //Si quiero devolver las citas completas -->
    public ArrayList<AvaibleAppointment> getAvaibleAppointments(){
        return avaibleAppointments;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Speciality: " + speciality+"\nAvailable: "+avaibleAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Pediatría");
    }

    public static class AvaibleAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        // Constructor -->
        public AvaibleAppointment(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
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

        public String getDate(String DATE) {
            return format.format(date);
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

        @Override
        public String toString() {
            return "Avaible Appointments \nDate: "+date+"\n Time: "+ time;
        }
    }

}
