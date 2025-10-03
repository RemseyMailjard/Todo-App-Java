package com.pluralsight;

import java.io.Reader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Student st1 = new Student();
      st1.firstname = "Hoang";


      Student st2 = new Student();
      st2.firstname = "Anthony";

      Student st3 = new Student();
      st3.firstname = "Bilal";


      String Firstname1 = "Hoang";
      String studentNr2Firstname = "Anthony";
      String studentNr3FIrstname = "Bilal";
      int age = 23;





        Dog django = new Dog();
        django.firstname = "Django";

        Dog scooby = new Dog();
        scooby.age = 6;
        scooby.firstname = "Scooby";


        scooby.Hi();


        Hi("Bilal"); // Call the function -> It runs that piece of code. Benefits of reuse
        Hi("Nazik");
        Hi("Zak");


        // I grab the SenzuBean ->
            IncreasePowerLevel(400);
        }

    public  void Hi(String name) {
        System.out.println("I wish you a warm welcome " + name);
    }

    public static int IncreasePowerLevel(int powerlevel) {
        System.out.println("The power level has been increased with " + powerlevel);

    }
}

