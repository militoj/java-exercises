package org.launchcode.java.demos.java4python;
import java.util.Arrays;
import java.util.List;



/**
 * Created by johnmilito on 3/6/17.
 */
public class ArrayLister {
    public static void main(String[] args) {
       List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20);

        int sum = 0;

        for (int i = 0; i < integers.size(); i++) {

           if (integers.get(i) % 2 == 0) {
               sum += integers.get(i);
           }
       }
        System.out.println(sum);

    }
}
