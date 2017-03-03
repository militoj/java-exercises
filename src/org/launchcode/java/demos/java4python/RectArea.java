package org.launchcode.java.demos.java4python;
import java.util.Scanner;


/**
 * Created by johnmilito on 3/2/17.
 */
public class RectArea {
    public static void main(String[] args) {
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the height of your rectangle:");
        float height = in.nextFloat();
        System.out.println("What is the width of your rectangle:");
        float width = in.nextFloat();


        System.out.println("The area of your triangle is: " + height * width);
    }

}
