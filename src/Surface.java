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

    public double getPrice(){
        return this.selectedMaterial.getPriceOfASurface(this);
    }

    public Map<String, Integer>addMaterialRequirements(Map<String, Integer> materials){

    }
}
