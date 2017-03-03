package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * Created by johnmilito on 3/2/17.
 */
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven:");
        float miles = in.nextFloat();
        System.out.println("How many gallons have you consumed:");
        float gallons = in.nextFloat();


        System.out.println("Your miles per gallon is: " + miles / gallons);
    }

}
