import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected RandomsIterator randomsIterator;

    public Randoms(int min, int max) {
        randomsIterator = new RandomsIterator(new Random(), min, max);
    }


    @Override
    public Iterator<Integer> iterator() {
        return randomsIterator;
    }

}


