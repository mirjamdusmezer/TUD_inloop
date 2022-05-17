import java.util.*;

public class StructuredObject extends RenovationObject{

    private HashSet<RenovationObject>parts;

    public void add(RenovationObject renovationObject){
        this.parts = new HashSet<>();
        parts.add();
    }

    public double getPrice(){
        return price.get();
    }

    public StructuredObject(){
    }

    // Methode um den Preis einer Oberfläche anzuzeigen --> die wird überschrieben, weil diese Klasse ja von Renovierungsobjekt erbt, in der so eine Funktion schon definiert wurde
    @Override
    public Map<String, Integer>addMaterialRequirements(Map<String, Integer>map){
        
        // vielleicht hier eine Iteration von dem Renovierungsobjekt über parts und das dann in ein Set schreiben und dann hier ausgeben?
        try{
            Map<String, Integer>newMaterial = new TreeMap<String, Integer>();

            for(RegovationObject r : parts){
                // neues Material hier anlegen?
                newMaterial.addMaterialRequirements(newMaterial);
            }
        }catch(Exception e){
            throw new NullPointerException();
        }
    }
}
