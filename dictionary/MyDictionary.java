package dictionary;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary <K,V>{

    private final List<Input<K,V>> list;

    public MyDictionary() {
        this.list = new ArrayList<>();
    }

    public void add (K k, V v) {
        Input<K,V> input = new Input<>(k,v);
        list.add(input);
    }

    public List<Input<K,V>> showAll (){
        return list;
    }

    public Input<K,V> getObjectById (int a) {
        if (this.list.get(a) != null) return list.get(a);
        else throw new IndexOutOfBoundsException();
    }

    static class Input <K,V> {
        private K k;
        private V v;

        public Input(K k, V v) {
            this.k = k;
            this.v = v;
        }

        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public V getV() {
            return v;
        }

        public void setV(V v) {
            this.v = v;
        }

        @Override
        public String toString() {
            return "Input{" +
                    "k=" + k +
                    ", v=" + v +
                    '}';
        }
    }
}
