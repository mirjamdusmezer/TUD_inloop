import java.util.*;

public class Resource {
    private String name;
    private String path;
    private ResourceType type;

    public Resource(String name, String path, ResourceType rt){
        if (name.isEmpty() || path.isEmpty())
            throw new IllegalArgumentException();
        rt = type;
        this.name = name;
        this.path = path; 
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public ResourceType getType() {
        return type;
    }
}
