import java.util.*;

public class StructuredObject extends RenovationObject{

    private HashSet<RenovationObject>parts;

    public void add(RenovationObject renovationObject){
        parts.add(renovationObject);
    }

    public double getPrice(){
        double price = 0.0;
        return price;
    }

    public StructuredObject(){
        this.parts = new HashSet<>();
    }

    // Methode um den Preis einer Oberfläche anzuzeigen --> die wird überschrieben, weil diese Klasse ja von Renovierungsobjekt erbt, in der so eine Funktion schon definiert wurde
    @Override
	public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {
		
		Map<String, Integer> newMaterials = new TreeMap<String, Integer>();
		
		newMaterials=materials;
		for(RenovationObject r : parts)
		{
			newMaterials = r.addMaterialReq(newMaterials);
			System.out.println(newMaterials);	
		}

		return newMaterials;
	}
}
