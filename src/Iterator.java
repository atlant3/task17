public interface Iterator {
    public boolean hasNext();
    public Object next();
}
class Collection {
    private static Object[] arr;

    public Collection(Object [] arr)  {
        this.arr = arr;
    }

    public class One implements Iterator, java.util.Iterator {
        private int count = 0;
        @Override
        public boolean hasNext() {
           return count<arr.length;
        }

        @Override
        public Object next() {
            return arr[count++];
        }
    }
    public One createOne() {
        return new One();
    }

    public class Two implements Iterator, java.util.Iterator{
        private int count = arr.length -1;
        @Override
        public boolean hasNext() {
            return count>=0;
        }
        @Override
        public Object next() {
            return arr[count--];
        }

    }
    public Two createTwo() {
        return new Two();
    }
}

