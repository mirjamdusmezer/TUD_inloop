import java.util.*;

public class TextFileIterator implements Iterator<String> {

    private String text;
    private String nextWord;

    public TextFileIterator(Resource res) {
        String t = getAsString(res);
        this.text = t.replaceAll("-\n(?=[a-z])", "");
        this.res = res;
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }

    public String next() {
        return iterator.next();
    }

    public void remove(){
        iterator.remove();
    }

    public String getAsString(Resource res){

    }
}
