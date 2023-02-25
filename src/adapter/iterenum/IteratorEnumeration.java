package adapter.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration<Object> implements Enumeration<Object> {
    private Iterator<Object> it;

    public IteratorEnumeration(Iterator<Object> it){
        this.it = it;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public Object nextElement() {
        return it.next();
    }
}
