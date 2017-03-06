package org.launchcode.java.demos.java4python;

import java.util.Arrays;
import java.util.List;

/**
 * Created by johnmilito on 3/6/17.
 */
public class ArrayStringLister {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("pig", "dog", "monkey",
                "hippopotamus", "panda");

        System.out.println(animals.get(2).length());

    }

}
