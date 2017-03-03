package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * Created by johnmilito on 3/2/17.
 */
public class SearchAlice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What term would you like to search for:");
        String input = in.next();




        System.out.println(alice.toLowerCase().contains(input.toLowerCase()));
    }

}
