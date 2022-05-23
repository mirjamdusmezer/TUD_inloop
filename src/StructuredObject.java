import java.util.*;

public class StructuredObject extends RenovationObject{

    private Set<RenovationObject>parts;

    public void add(RenovationObject renovationObject){
        if(renovationObject==null){
			throw new NullPointerException();
        }
        parts.add(renovationObject);
    }

    public double getPrice(){
        double price = 0.0;
        return price;
    }

    public StructuredObject(){
        this.parts = new TreeSet<>();
    }

    // Methode um den Preis einer Oberfläche hinzuzufügen
    @Override
	public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {

        if (materials==null){
			throw new NullPointerException();
        }

		if(materials.containsValue(null)){
			throw new NullPointerException();
        }
		
	//	Map<String, Integer> newMaterial = new TreeMap<String, Integer>();
		
		// newMaterial=materials;
		for(RenovationObject renovationObject : parts)
		{
            
		materials = renovationObject.addMaterialReq(materials);
		// 	System.out.println(newMaterial);	
		}

		return materials;
	}
}
