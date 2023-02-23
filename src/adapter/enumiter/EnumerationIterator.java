package adapter.enumiter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
    Enumeration num;

    public EnumerationIterator(Enumeration num){
        this.num = num;
    }


    public boolean hasNext() {
        return num.hasMoreElements();
    }


    public Object next() {
        return num.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
