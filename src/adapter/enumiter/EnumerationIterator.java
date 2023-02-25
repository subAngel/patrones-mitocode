package adapter.enumiter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<Object> implements Iterator<Object> {
    private Enumeration<Object> num;


    @Override
    public boolean hasNext() {
        return num.hasMoreElements();
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
