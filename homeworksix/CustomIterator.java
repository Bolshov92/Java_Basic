package com.telran.org.homeworksix;

import java.util.Iterator;

public class CustomIterator implements Iterator<Integer> {

    private int[] integers;
    private int index = 0;

    public CustomIterator(int[] integers) {
        this.integers = integers;

    }

    @Override
    public boolean hasNext() {
        return index < integers.length;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            return integers[index++];
        }

        return null;
    }


}
