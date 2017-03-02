package org.launchcode.java.demos.java4python;
import java.util.Scanner;


/**
 * Created by johnmilito on 3/2/17.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is your name?");


        System.out.println("Hello, " + in.next());
    }
}

