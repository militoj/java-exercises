package org.launchcode.java.demos.java4python;

import java.util.Arrays;
import java.util.List;

/**
 * Created by johnmilito on 3/6/17.
 */
public class ArrayStringLister {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("horse", "pig", "dog", "monkey",
                "hippopotamus", "panda");

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).length() == 5) {
                System.out.println(animals.get(i));
            }
        }

    }

}
