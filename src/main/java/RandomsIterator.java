import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public RandomsIterator(Random random, int min, int max) {
        this.random = random;
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.ints(min, (max + 1)).findFirst().getAsInt();
    }
}
