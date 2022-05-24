import java.util.*;
public class Index {
    private Map<String, List<Resource>> index;

    //Konstruktor
    public Index(){
        this.index = new HashMap<String, List<Resource>>();
    }

    public void add(Resource res){
        if(!index.containsKey(res.getType().getType().getCollector().getKeywords(res).getAsString())){
            index.put(resource.getType().getType().getCollector().getKeywords(res).getAsString(), new LinkedList<Resource>());
        }
        List<Resource> list = index.get(res.getType().getCollector().getKeywords(res).getAsString());
        list.add(res);
    }

    List<Resource> getResources(String keyword){
        if(index.containsKey(keyword)){
            List<Resource> list = new LinkedList<>();
            return list;
        }
        else{
            return index.get(keyword);
        }
    }
}
