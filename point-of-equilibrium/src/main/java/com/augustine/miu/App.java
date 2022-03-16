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
        int result = getPoint(new int[] {1,8,3,7,10,2});
        assert 3 == result;

        result = getPoint(new int[] {1, 5, 3, 1, 1, 1, 1, 1, 1});
        assert 2 == result;

        result = getPoint(new int[] {2, 1, 1, 1, 2, 1, 7});
        assert 5 == result;

        result = getPoint(new int[] {1,2,3});
        assert -1 == result;

        result = getPoint(new int[] {3,4,5,10});
        assert -1 == result;

        result = getPoint(new int[] {1,2,10,3,4});
        assert -1 == result;
        
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
