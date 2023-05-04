package ru.netology;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected List<Integer> array;
    public Randoms(int min, int max) {

        array = random.ints(100, min, max+1)
                .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator<Integer>();
    }
    private class RandomIterator<Integer> implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Object next() {
            return array.get(index++);
        }
    }
}
