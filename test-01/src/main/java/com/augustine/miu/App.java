package com.augustine.miu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Test 01");
        assert 1 == isMartian(new int[] {1,3});
        assert 1 == isMartian(new int[] {1,2,1,2,1,2,1,2,1});
        assert 0 == isMartian(new int[] {1,3,2});
        assert 0 == isMartian(new int[] {1,3,3,2,1});
        assert 0 == isMartian(new int[] {1,2,-18,-18,1,2});
        assert 0 == isMartian(new int[] {});
        assert 1 == isMartian(new int[] {1});
        assert 0 == isMartian(new int[] {2});
        assert 0 == isMartian(null);

        System.out.println(isMartian(new int[] {1,3}));
        System.out.println(isMartian(new int[] {1,2,1,2,1,2,1,2,1}));
        System.out.println(isMartian(new int[] {1,3,2}));
        System.out.println(isMartian(new int[] {1,3,3,2,1}));
        System.out.println(isMartian(new int[] {1,2,-18,-18,1,2}));
        System.out.println(isMartian(new int[] {}));
        System.out.println(isMartian(new int[] {1}));
        System.out.println(isMartian(new int[] {2}));
        System.out.println(isMartian(null));
    }

    private static int isMartian(int[] a) {
        // - Invalid input?
        if (null == a || a.length == 0) {
            return 0;
        }

        int oneCount = 0;
        int twoCount = 0;
        for (int i = 0; i < a.length; i++) {
            // - Adjacency?
            if ((i < a.length - 1) && (a[i] == a[i+1])) {
                return 0;
            }

            // - Count 1s
            if (1 == a[i]) {
                oneCount += 1;
            } else if (2 == a[i]) { // - Count 2s
                twoCount += 1;
            }
        }

        if (oneCount > twoCount) {
            return 1;
        }

        return 0;
    }
}
