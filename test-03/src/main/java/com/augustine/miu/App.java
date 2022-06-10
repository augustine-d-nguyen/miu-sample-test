package com.augustine.miu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Test 03");
        assert 39 == computeWeightedSum(new int[] {1,2,3,4,5});
        System.out.println(computeWeightedSum(new int[] {1,2,3,4,5}));
        assert 27 == computeWeightedSum(new int[] {1,3,5});
        System.out.println(computeWeightedSum(new int[] {1,3,5}));
        assert 24 == computeWeightedSum(new int[] {2,4,6});
        System.out.println(computeWeightedSum(new int[] {2,4,6}));
        assert 3 == computeWeightedSum(new int[] {1});
        System.out.println(computeWeightedSum(new int[] {1}));
        assert 4 == computeWeightedSum(new int[] {2});
        System.out.println(computeWeightedSum(new int[] {2}));
        assert 0 == computeWeightedSum(new int[] {0,0,0,0,0});
        System.out.println(computeWeightedSum(new int[] {0,0,0,0,0}));
        
    }

    private static int computeWeightedSum(int[ ] a) {
        if (null == a || 0 == a.length) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            // - Even?
            if (0 == a[i]%2) {
                sum += a[i] * 2;
                continue;
            }

            // - Odd!
            sum += a[i] * 3;
        }

        return sum;
    }
}
