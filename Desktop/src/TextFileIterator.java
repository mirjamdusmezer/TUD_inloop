import java.util.*;

public class TextFileIterator implements Iterator {

    public TextFileIterator(Resource res) {

        this.res = res;
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public Object next() {
        return iterator.next();
    }

    public void remove(){
        iterator.remove();
    }

    public String getAsString(Resource res){
        
    }
}
