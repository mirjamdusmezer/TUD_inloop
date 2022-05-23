public abstract class Material {
    private String name;
    private double price;

    // Methode um Material festzulegen
    public Material(String name, double price){
        if(name == null){
            throw new NullPointerException();
        }
        if(name.isEmpty()){
            throw new IllegalArgumentException();
        }
        if(price <=0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.price = price;
    }

    // getter
    public String getName(){
        return this.name;
    }

    // Methode um Materialvoraussetzungen anzuzeigen
    
    public abstract int getMaterialRequrirements(Surface surface);

    // Methode um Einzelpreis auszugeben
    public double getPricePerUnit(){
        return price;
    }

    public double getPriceOfASurface(Surface surface){
        if(surface == null){
            throw new NullPointerException();
        }
        return surface.getArea() * this.price;
       // return 1;
    }


}
