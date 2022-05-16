public abstract class Material {
    private String name;
    private double price;

    // Methode um Material festzulegen
    public Material(String name, double price){
        this.name = name;
        this.price = price;
    }

    // getter
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    // Methode um Materialvoraussetzungen anzuzeigen
    public int getMaterialRequrirements(Surface surface){
        
    }

    // Methode um den Preis einer Oberfläche anzuzeigen
    public double getPriceOfASurface(Surface surface){

    }


}
