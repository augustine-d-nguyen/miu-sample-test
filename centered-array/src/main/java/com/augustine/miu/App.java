package com.augustine.miu;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Integer[] input = new Integer[] {1,2,3,4,5};
        int result = getCenteredArray(input);
        assert 0 == result;
        
        input = new Integer[] {3,2,1,4,5};
        result = getCenteredArray(input);
        assert 1 == result;

        input = new Integer[] {3,2,1,4,1};
        result = getCenteredArray(input);
        assert 0 == result;

        input = new Integer[] {1,2,3,4};
        result = getCenteredArray(input);
        assert 0 == result;

        input = new Integer[] {};
        result = getCenteredArray(input);
        assert 0 == result;

        input = new Integer[] {10};
        result = getCenteredArray(input);
        assert 1 == result;
    }

    private static int getCenteredArray(Integer[] input) {
        if (Objects.isNull(input)) {
            return 0;
        }

        if (input.length % 2 == 0) {
            return 0;
        }

        int midIndex = input.length / 2;
        int midValue = input[midIndex];
        for (int i : input) {
            if (i <= midValue) {
                return 0;
            }
        }
        return 1;
    }
}
