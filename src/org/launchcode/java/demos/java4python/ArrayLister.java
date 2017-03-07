package org.launchcode.java.demos.java4python;
import java.util.Arrays;
import java.util.List;



/**
 * Created by johnmilito on 3/6/17.
 */
public class ArrayLister {
    public static void main(String[] args) {
       List<Integer> integers = Arrays.asList(2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 20);


        System.out.println(calcSum(integers));

    }

    public static Integer calcSum(List<Integer> alist) {
        int sum = 0;

        for (int i = 0; i < alist.size(); i++) {

            if (alist.get(i) % 2 == 0) {
                sum += alist.get(i);
            }
        }

        return sum;
    }
}
