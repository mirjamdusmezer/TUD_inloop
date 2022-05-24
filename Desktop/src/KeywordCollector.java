import java.util.*;

public interface KeywordCollector {
    // Bestimmt den Satz von Schlüsselwörtern für eine Resource
    Set<String> getKeywords(Resource res);
}
