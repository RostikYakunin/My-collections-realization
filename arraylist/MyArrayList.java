package arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    private static int i = 0;
    private static int size;
    Object[] array = new Object[10];

    public Object get(int index) {
        if (array[index] != null) return array[index];
        else throw new ArrayIndexOutOfBoundsException("Index not found");
    }

    public void add(E element) {
        if (size() == array.length - 3) {
            this.array = Arrays.copyOf(array, (int) (array.length * 1.5));
        }
        this.array[i++] = element;
        size++;
    }

    public void add(int index, E element) {
        if (size() == array.length - 3) {
            this.array = Arrays.copyOf(array, (int) (array.length * 1.5));
        }

        Object[] arrayCopy = Arrays.copyOf(array, array.length + 1);
        System.arraycopy(array, index, arrayCopy, index + 1, arrayCopy.length - (index + 1));
        arrayCopy[index] = element;
        array = arrayCopy;
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (Object o : array) {
            o = null;
        }
        size = 0;
    }

    public boolean remove(int index) {
        if (get(index) == null)
            return false;
        else {
            array[index] = null;
            System.arraycopy(array, index + 1, array, index, array.length - size);
            size--;
        }
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }
}
