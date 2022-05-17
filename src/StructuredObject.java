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

    // Methode um den Preis einer Oberfläche hinzuzufügen
    @Override
	public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {
		
		Map<String, Integer> newMaterial = new TreeMap<String, Integer>();
		
		newMaterial=materials;
		for(RenovationObject renovationObject : parts)
		{
			newMaterial = renovationObject.addMaterialReq(newMaterial);
			System.out.println(newMaterial);	
		}

		return newMaterial;
	}
}
