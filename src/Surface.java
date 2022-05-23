import java.util.*;

public class Surface extends RenovationObject{

    private double length;
    private double width;
    private Material selectedMaterial;

    public Surface(double length, double width){

        if(length<=0 || width<=0){
            throw new IllegalArgumentException();
        }

        this.length= length;
        this.width = width;
    }

    public void setMaterial(Material material){
        selectedMaterial = material;
    }

    public double getArea(){
        return getLength()*getWidth();
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public double getPrice(){
        return selectedMaterial.getPriceOfASurface(this);
    }

    @Override
	public Map<String, Integer> addMaterialReq(Map<String, Integer> materials) {
		
		// Map<String, Integer> newMaterial = new TreeMap<String, Integer>();
        if(materials == null){
            throw new NullPointerException();
        }
        if(!materials.isEmpty()){
           materials.put(selectedMaterial.getName(), selectedMaterial.getMaterialRequrirements(this));
        }

		/*	for(String s : materials.keySet()) // for each Schleife um durch die Materialbezeichnungen zu iterieren
			{
				newMaterial.put(s, materials.get(s));
			}*/
		
		return materials;
	}
}

// Hashmap Prinzip: HashMap<Key, Value> --> mit KeySet greift man dann quasi auf den Schlüsselwert, in unserem Fall den String Wert, zu