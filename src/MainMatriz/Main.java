package MainMatriz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /**
         * Student A - 2 : [  9, 10,  x,  x,  x]
         * Student B - 4 : [ 10, 10, 10, 10,  x]
         * Student C - 5 : [  9,  9, 10, 10, 10]
         * Student D - 3 : [ 10, 10, 10,  x,  x]
         * Student E - 1 : [  8,  x,  x,  x,  x]
         */

        int[][] grades = new int[5][];

        grades[0] = new int[]{ 9, 10};
        grades[1] = new int[]{10, 10, 10, 10};
        grades[2] = new int[]{ 9,  9, 10, 10, 10};
        grades[3] = new int[]{10, 10, 10};
        grades[4] = new int[]{ 8};

        for (int[] grade : grades) {

            List<Integer> collect = Arrays.stream(grade)
                    .boxed()
                    .collect(Collectors.toList());

            System.out.println(collect);

        }

    }

}
