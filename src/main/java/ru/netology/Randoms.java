package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int min;
    protected int max;
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator<Integer>();
    }
    private class RandomIterator<Integer> implements Iterator{
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Object next() {
            return random.ints(100, min, max+1)
                    .findAny()
                    .getAsInt();
        }
    }
}
