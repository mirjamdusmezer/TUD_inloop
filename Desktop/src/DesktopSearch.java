public class DesktopSearch {
    private Map<String, ResourceType> types;
    private Index index;

    public DesktopSearch(){
        types = new HashMap<String, ResourceType>();
        this.index = new Index();
    }

    public void registerType(String extension, ResourceType type){
        types.put(extension, type);

    }

    public ResourceType getType(String extension){
      return types.get(extension);

    }

    public void unregisterType(String extension){
        types.remove(extension);

    }

    public void registerResource(Resource res){
        index.add(res);
    }

    public List<Resource> processRequest(String request){
        return index.getResources(request);
    }
}
