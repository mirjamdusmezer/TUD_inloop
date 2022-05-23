public class Paint extends Material{

    static private double limit = 0.02;
    private int numberOfCoats;
    private double squareMetersPerLimit;

    public Paint(String name, double price, int numberOfCoats, double squareMetersPerLimit){
        super(name, price);

        if(numberOfCoats <= 0 || squareMetersPerLimit <= 0){
            throw new IllegalArgumentException();
        }

        this.numberOfCoats = numberOfCoats;
        this.squareMetersPerLimit = squareMetersPerLimit;
    }

    public int getNumberOfCoats(){
        return numberOfCoats;
    }

    public double getSquaredMetersPerLimit(){
        return squareMetersPerLimit;
    }

    @Override
    public int getMaterialRequrirements(Surface surface){
        if(surface == null){
            throw new IllegalArgumentException();
        }
       double liter =  (surface.getArea()*numberOfCoats)/squareMetersPerLimit;
       return (int)(liter/limit);
    }
}
