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
		// TODO Auto-generated method stub
		if (materials==null)
			throw new NullPointerException();
		if(materials.containsValue(null))
			throw new NullPointerException();
		
		
		Map<String, Integer> newMaterials = new TreeMap<String, Integer>();
		
		for (String s : materials.keySet())
		{
			if(s==null)
				throw new NullPointerException();
		}
		newMaterials=materials;
		for(RenovationObject r : parts)
		{
			newMaterials = r.addMaterialReq(newMaterials);
			System.out.println(newMaterials);	
		}
		
		

		System.out.println("Return"+newMaterials);
		return newMaterials;
	}
}
