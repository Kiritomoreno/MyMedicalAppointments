package ui;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import model.Doctor;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Avaible Appointment");
            System.out.println("2. My Scheduled Appointment");
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

        }while(response != 0);
    }

    private static void showAddAvaibleAppointmentsMenu(){

        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Add Avaible Appointment");
            System.out.println("Select a Month");

            for (int i = 0; i < 3; i++) {
                int j= i +1;
                System.out.println(j +". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response < 4){
                // 1,2,3
                int monthSelect = response;
                System.out.println(monthSelect+". "+ UIMenu.MONTHS[monthSelect]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: "+ date + "\n1. Correcto \n2. Change date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2){
                    continue;
                }
                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: "+ date+ "[16:00]");
                    time =sc.nextLine();
                    System.out.println("Your time is: "+ time+ "\n1. Correcto \2. Change Time");
                    responseTime = Integer.valueOf(sc.nextLine());

                }while (responseTime == 2);

                UIMenu.doctorLogged.addAvaibleAppointment(date, time);

                checkDoctorAvailableAppointmets(UIMenu.doctorLogged);

            }else if (response == 0){
                showDoctorMenu();
            }

        }while (response != 0);
    }

    // método privado porque segun su logica solo le corresponde esta aqui
    private static void checkDoctorAvailableAppointmets(Doctor doctor){
        if(doctor.getAvaibleAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
