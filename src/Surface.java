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
    public Map<String, Integer>addMaterialRequirements(Map<String, Integer> materials){
        try{
            
            Map<String, Integer> newMaterial = new TreeMap<String, Integer>();
            for(String s : materials.keySet()){
                newMaterial.put(s, materials.get(s));
            }

        }catch(Exception e){
            System.out.println("ungültige Eingabe");
            throw new NullPointerException();
        }
        return newMaterial;
    }
}
