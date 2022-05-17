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
		// TODO Auto-generated method stub

		if (materials==null)
			throw new NullPointerException();
		
		Map<String, Integer> newMaterials = new TreeMap<String, Integer>();
		
		if(!materials.isEmpty())
		{
			for(String s : materials.keySet())
			{
				if(materials.get(s)==null)
					throw new NullPointerException();
				newMaterials.put(s, materials.get(s));
			}
		}
		
		if(materials.containsKey(this.selectedMaterial.getName()))
		{
			int numOfMaterials = newMaterials.get(this.selectedMaterial.getName());
			newMaterials.put(this.selectedMaterial.getName(), this.selectedMaterial.getMaterialRequrirements(this)+numOfMaterials);
		}
		else
		{
			newMaterials.put(this.selectedMaterial.getName(), this.selectedMaterial.getMaterialRequrirements(this));
		}

		
		return newMaterials;
	}
}
