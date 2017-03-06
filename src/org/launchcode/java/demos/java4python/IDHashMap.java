package org.launchcode.java.demos.java4python;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by johnmilito on 3/6/17.
 */
public class IDHashMap {


    /**
     * Created by LaunchCode
     */


        public static void main(String[] args) {

            HashMap<Integer, String> students = new HashMap<>();
            Scanner in = new Scanner(System.in);
            Integer NewID;

            System.out.println("Enter your students (or ENTER to finish):");

            // Get student names and grades
            do {

                System.out.print("Student ID: ");
                NewID = in.nextInt();

                if (!NewID.equals("")) {
                    System.out.print("Student Name: ");
                    String newStudent = in.next();
                    students.put(NewID, newStudent);

                    // Read in the newline before looping back
                    in.nextLine();
                }

            } while(!NewID.equals(""));

            // Print class roster
            System.out.println("\nClass roster:");

            for (Map.Entry<Integer, String> student : students.entrySet()) {
                System.out.println(student.getKey() + " (" + student.getValue() + ")");
            }


        }
}
