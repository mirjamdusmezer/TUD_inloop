import java.util.*;

public class TextFileIterator implements Iterator<String> {

    private List<String> text;
    private String nextWord;
    // private List<String> removedWords;

    public TextFileIterator(Resource res) {
        // ExceptionHandling
        if(res.isEmpty()){
            throw new NullPointerException();
        }

        String t = getAsString(res);
        t = t.replaceAll("-\n(?=[a-z])", "");
        this.res = res;

        text = new ArrayList<>(Arrays.asList(t.split(" ")));
        nextWord = text.get(0);
        text.remove(0);
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
        return "We wish you good luck in this exam!\nWe hope you are well pre-\npared.";
    }
}
