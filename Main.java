package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt=scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("your name is " + name + ", and you are " + age + " years old");

            } else {
                System.out.println("invalid year of birth");
            }

        }
        else{
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
