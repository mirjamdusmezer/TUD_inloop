public class DesktopSearch {
    private Map<String, ResourceType> types;

    public DesktopSearch(){
        types = new HasMap<>();
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
        
    }

    public List<Resource> processRequest(String request){
        
    }
}
