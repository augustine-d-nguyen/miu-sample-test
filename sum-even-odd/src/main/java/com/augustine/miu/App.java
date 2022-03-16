package com.augustine.miu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int result = sum(new int[]{1});
        assert 1 == result;

        result = sum(new int[]{1,2});
        assert -1 == result;

        result = sum(new int[]{1,2,3});
        assert 2 == result;

        result = sum(new int[]{1,2,3,4});
        assert -2 == result;

        result = sum(new int[]{3,3,4,4});
        assert -2 == result;

        result = sum(new int[]{3,2,3,4});
        assert 0 == result;

        result = sum(new int[]{4,1,2,3});
        assert 2 == result;

        result = sum(new int[]{1,1});
        assert 2 == result;

        result = sum(new int[]{});
        assert 0 == result;
    }

    private static int sum(int[] a) {
        if (null == a || 0 == a.length) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (0 == a[i] % 2) {
                result -= a[i];
            } else {
                result += a[i];
            }
        }
        return result;
    }
}
