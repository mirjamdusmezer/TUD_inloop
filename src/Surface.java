import java.util.*;

public class Surface extends RenovationObject{
    private double length;
    private double width;
    private Material selectedMaterial;

    public Surface(double length, double width){
        this.length= length;
        this.width = width;
    }

    public void setMaterial(Material material){
        this.selectedMaterial = material;
    }

    public double getArea(){
        return this.getLength()*this.getWidth();
    }

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    @Override
    public double getPrice(){
        return this.selectedMaterial.getPriceOfASurface(this);
    }

    @Override
	public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {
		
		Map<String, Integer> newMaterial = new TreeMap<String, Integer>();
		
			for(String s : materials.keySet()) // for each Schleife um durch die Materialbezeichnungen zu iterieren
			{
				newMaterial.put(s, materials.get(s));
			}
		
		return newMaterial;
	}
}

// Hashmap Prinzip: HashMap<Key, Value> --> mit KeySet greift man dann quasi auf den Schlüsselwert, in unserem Fall den String Wert, zu