package ui;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: "+ UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println("::Book an appoinment");
            System.out.println(":: Select date: ");
            //Key value (se almacena la numeración de la lista de fechas )
            //Indice de la fecha que seleccione nuestro paciente
            //[doctors]
            //primer Map<Integer ( lleva los doctores)
            //segundo Map<Integer,Doctor> ( lleva las fechas)
            // 1. doctor1 (Cada uno tiene su ArrayList)
            // 1. fecha1         -   2. fecha2
            // 2. doctor2 (Cada uno tiene su ArrayList)
            // 1. fecha1         -   2. fecha2
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k= 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                // Capturamos unicamente las citas
                ArrayList<Doctor.AvaibleAppointment> avaibleAppointments
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvaibleAppointments();
                
                Map<Integer,Doctor> doctorAppoinments = new TreeMap<>();
                for (int j = 0; j < avaibleAppointments.size(); j++) {
                    //Ahora capturamos los numeros  y pasarlos al anterior Map<Integer
                    k++;
                    System.out.println(k + ". " +avaibleAppointments.get(j).getDate());
                    doctorAppoinments.put(Integer.valueOf(j),UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    //Es como si estuvieramos creando una nueva estructura de datos, que nos va ayudar a manipular mejor la salida que queremos darle a nuestros usuarios
                    doctors.put(Integer.valueOf(k), doctorAppoinments);

                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());




        }while (response != 0);
    }
}
