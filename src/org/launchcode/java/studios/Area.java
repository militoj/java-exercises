package org.launchcode.java.studios;

import java.util.Scanner;


/**
 * Created by johnmilito on 3/2/17.
 */
public class Area {
    public static void main(String[] args){
        Scanner in;

        in = new Scanner(System.in);
        System.out.print("Enter a radius:");
        float radius = in.nextFloat();

        if (radius < 0){
            System.out.println("Please enter a positive number");
            System.exit(0);

        }

        System.out.println("The area of a circle of radius " + radius + " is: " + Math.PI*radius*radius);
    }
}
