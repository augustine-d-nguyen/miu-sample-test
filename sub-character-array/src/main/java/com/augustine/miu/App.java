package com.augustine.miu;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        char[] result = getChars(new char[]{'a', 'b', 'c'}, 0, 4);
        assert Arrays.equals(null, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 0, 3);
        assert Arrays.equals(new char[]{'a', 'b', 'c'}, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 0, 2);
        assert Arrays.equals(new char[]{'a', 'b'}, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 0, 1);
        assert Arrays.equals(new char[]{'a'}, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 1, 3);
        assert Arrays.equals(null, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 1, 2);
        assert Arrays.equals(new char[]{'b', 'c'}, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 1, 1);
        assert Arrays.equals(new char[]{'b'}, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 2, 2);
        assert Arrays.equals(null, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 2, 1);
        assert Arrays.equals(new char[]{'c'}, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 3, 1);
        assert Arrays.equals(null, result);

        result = getChars(new char[]{'a', 'b', 'c'}, 1, 0);
        assert Arrays.equals(new char[]{}, result);

        result = getChars(new char[]{'a', 'b', 'c'}, -1, 2);
        assert Arrays.equals(null, result);

        result = getChars(new char[]{'a', 'b', 'c'}, -1, -2);
        assert Arrays.equals(null, result);

        result = getChars(new char[]{}, 0, 1);
        assert Arrays.equals(null, result);
    }

    private static char[] getChars(char[] a, int start, int len) {
        if (null == a) {
            return null;
        }
        if (0 > start || a.length <= start) {
            return null;
        }
        if (0 > len || a.length < len) {
            return null;
        }
        if (a.length - start < len) {
            return null;
        }
        int idx = 0;
        char[] result = new char[len];
        for (int i = start; i < len; i++) {
            result[idx++] = a[i];
        }
        return result;
    }
}
