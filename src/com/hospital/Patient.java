package com.hospital;

import java.util.*;

public class Patient {

    private String name;
    private int age;
    private String illness;
    private int patientID;
    // waiting time // helps determine who should be served



    public String getName(){
        return name;
    }

    public void setName(String new_name){
        name = new_name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int new_age){
        age = new_age;
    }

    public String getIllness(){
        return illness;
    }

    public void setIllness(String new_illness){
        illness = new_illness;

    }

    public void generateID(){
        //
    }

    public int getPatientID() {
        return patientID;
    }
}
