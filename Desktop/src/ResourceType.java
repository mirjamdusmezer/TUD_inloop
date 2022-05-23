import java.util.*;

public class ResourceType {
    private String description;
    private KeywordCollector collector;

    public ResourceType(String desc, KeywordCollector collector){
        desc = description;
        this.collector = collector;
    }

    public String getDescription() {
        return this.description;
    }

    public KeywordCollector getCollector() {
        return this.collector;
    }
}
