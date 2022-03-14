package com.augustine.miu;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int result = getPoint(new int[] {3, 1, 1, 2});
        System.out.println( result);
    }

    private static int getPoint(int[] a) {
        if (Objects.isNull(a) || a.length < 3) {
            return -1;
        }
        int sumOfArray = 0;
        for (int i = 0; i < a.length; i++) {
            sumOfArray += a[i];
        }

        int sumOfLeft = 0;
        for (int i = 1; i < a.length; i++) {
            sumOfLeft += a[i - 1];
            if (2 * sumOfLeft == sumOfArray - a[i]) {
                return i;
            }
        }
        return -1;

    }
}
