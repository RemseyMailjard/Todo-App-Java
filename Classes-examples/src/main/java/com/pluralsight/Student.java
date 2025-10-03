package com.pluralsight;

public class Student {

    public String firstname;
    public int age;
    public String lastname;
    private String pincode;

    public Student() {
        this.pincode = "1234";
    }


    public void introduction() {
        System.out.println("Hi my Name = " + this.firstname);
    }

    public static void GenericIntroduction()
    {
        System.out.println("Hi - I`m introducing my self. But is generic not linked to anyone");
    }
}
