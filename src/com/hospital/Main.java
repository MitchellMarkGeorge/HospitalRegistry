package com.hospital;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    // read into static
    // static means no need to create a new instance of a class in order to acess methods and fields (good for the entry class)

    public static void main (String[] args){

        // patient portal class
        // doctor portal class
        // doctor should have acess to patient but patient should not have acess to doctor
        // weighting system to determine who should be attended to most urgently
        // DATABASE??

        // create a file tp signfy that a doctor is using this sytem????'



        System.out.println("Welcome to the Royal Hospital Please choose an option to begin with:");
        System.out.println("A) Doctor Portal");
        System.out.println("B) Patient Portal");
        System.out.println("C) Exit Program");

        String program_option = input.nextLine();

        if (program_option.equalsIgnoreCase("A")){
            DoctorPortal docPortal = new DoctorPortal();
        } else if (program_option.equalsIgnoreCase("B")) {
            PatientPortal patientPortal = new PatientPortal();
        } else if (program_option.equalsIgnoreCase("C")){
            System.out.println("Thank you for using our service. Bye!");
            System.exit(1);
        }

    }
}
