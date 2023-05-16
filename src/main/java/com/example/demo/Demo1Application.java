package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        //First task:
        byte simpleByte = 12;
        short simpleShort = 12;
        int simpleInt = 1234;
        long simpleLong = 123456789L;
        float simpleFloat = 1.23f;
        double simpleDouble = 1.9;
        char simpleChar = '9';
        boolean simpleBoolean = true;

        //Second task:
        String firstString = "qwerty";
        String secondString = new String("qwerty0" + "\n");

        //Third task:
        System.out.println("Arithmetic operations: ");
        System.out.println(simpleByte + simpleShort);
        System.out.println(simpleByte - simpleShort);
        System.out.println(simpleChar * simpleInt);
        System.out.println(simpleChar - simpleInt);
        System.out.println(simpleLong * 2);
        System.out.println(simpleLong + simpleFloat);
        System.out.println(simpleFloat + simpleDouble + "\n");

        //Fourth task:
        System.out.println("Relational and logical operations: ");
        boolean newSimpleBoolean = !simpleBoolean;
        System.out.println(newSimpleBoolean);
        System.out.println(simpleByte == simpleShort);
        simpleLong = simpleInt;
        System.out.println(simpleLong);
        System.out.println(simpleLong > simpleFloat);
        System.out.println(simpleLong < simpleDouble);
        System.out.println(simpleByte >= simpleShort);
        System.out.println(simpleInt <= simpleLong);
        System.out.println(simpleByte == simpleShort && simpleShort == simpleInt);
        System.out.println(simpleDouble != simpleInt || simpleByte == simpleShort);
        simpleShort = simpleByte < simpleInt ? simpleByte : simpleShort;
        System.out.println("New simpleShort value is: " + simpleShort + "\n");

        //Fifth task:
        System.out.println("Increment and decrement operations: ");
        int i = 1;
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        i--;
        System.out.println(i);
        i+=2;
        System.out.println(i);
        i--;
        System.out.println(i);
        System.out.println(i + "\n");

        //Sixth task
        System.out.println("Work with array: ");
        int[] arrayOfNumbers = {1, 3, 5, 7, 11, 13, 22, 24, 365, 888};
        System.out.print("Even numbers: ");
        for (int j = 0; j < arrayOfNumbers.length; j++) {
            if (arrayOfNumbers[j] % 2 == 0){
                System.out.print(arrayOfNumbers[j] + " ");
            }
        }
        SpringApplication.run(Demo1Application.class, args);
    }

}
