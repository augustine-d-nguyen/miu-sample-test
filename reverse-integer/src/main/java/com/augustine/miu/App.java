package com.augustine.miu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int result = reverse(1234);
        assert 4321 == result;

        result = reverse(12005);
        assert 50021 == result;

        result = reverse(1);
        assert 1 == result;

        result = reverse(1000);
        assert 1 == result;

        result = reverse(0);
        assert 0 == result;

        result = reverse(-12345);
        assert -54321 == result;
    }

    private static int reverse(int n) {
        if (10 > n) return n;
        float result = 0;
        float mul = 0.1f;
        int remain = n;

        while (remain > 0) {
            result += (remain % 10) *mul;
            remain = remain / 10;
            mul *= mul;
        }
        return (int)(result/mul);
    }
}
