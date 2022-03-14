package com.augustine.miu;

import java.util.Arrays;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] result = getIntersection(new int[]{1, 2, 3}, new int[]{4, 3, 1, 9});
        System.out.println(Arrays.toString(result));
    }

    private static int[] getIntersection(int[] first, int[] second) {
        if (Objects.isNull(first) || Objects.isNull(second)) {
            return new int[0];
        }
        if (0 == first.length || 0 == second.length) {
            return new int[0];
        }
        
        int maxIntersectionCount = first.length > second.length ? second.length : first.length;
        int[] container = new int[maxIntersectionCount];

        int counter = 0;
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (second[i] == first[j]) {
                    container[counter++] = second[i];
                }
            }
        }
        int[] result = new int[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = container[i];
        }

        return result;
    }
}
