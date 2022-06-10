package com.augustine.miu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Test 02");
        assert 1 == isPairedN(new int[] {1,4,1,4,5,6}, 5);
        assert 1 == isPairedN(new int[] {1,4,1,4,5,6}, 6);
        assert 1 == isPairedN(new int[] {0,1,2,3,4,5,6,7,8}, 6);
        assert 0 == isPairedN(new int[] {1,4,1}, 5);
        assert 0 == isPairedN(new int[] {8,8,8,8,7,7,7}, 15);
        assert 0 == isPairedN(new int[] {8,-8,8,8,7,7,-7}, -15);
        assert 0 == isPairedN(new int[] {3}, 3);
        assert 0 == isPairedN(new int[] {}, 0);
        assert 0 == isPairedN(null, 5);

        System.out.println(isPairedN(new int[] {1,4,1,4,5,6}, 5));
        System.out.println(isPairedN(new int[] {1,4,1,4,5,6}, 6));
        System.out.println(isPairedN(new int[] {0,1,2,3,4,5,6,7,8}, 6));
        System.out.println(isPairedN(new int[] {1,4,1}, 5));
        System.out.println(isPairedN(new int[] {8,8,8,8,7,7,7}, 15));
        System.out.println(isPairedN(new int[] {8,-8,8,8,7,7,-7}, -15));
        System.out.println(isPairedN(new int[] {3}, 3));
        System.out.println(isPairedN(new int[] {}, 0));
        System.out.println(isPairedN(null, 5));
    }

    private static int isPairedN(int[ ] a, int n) {
        // - Invalid array.
        if (null == a || 2 > a.length) {
            return 0;
        }

        // - Sum of indexes can not be less than 1;
        if (1 > n) {
            return 0;
        }

        // - Sum of two largest indexes.
        int sumOfTwoLargestIndexes = 2 * a.length - 3;
        if (n > sumOfTwoLargestIndexes) {
            return 0;
        }

        for (int i = 0; i < a.length - 1; i++) {
            // - Because sum of the indexes must be n.
            // - Then we know the second index value.
            int secondIdx = n - i;
            // - Check the boundaries.
            if (0 > secondIdx || secondIdx > a.length - 1) {
                continue;
            }
            // - The same index?
            if (i == secondIdx) {
                continue;
            }

            // - Found!
            if (n == (a[i] + a[secondIdx])) {
                return 1;
            }
        }

        return 0;
    }
}
