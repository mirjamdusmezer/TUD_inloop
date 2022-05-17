public class Paint extends Material{

    static private double limit = 0.02;
    private int numberOfCoats;
    private double squareMetersPerLimit;

    public Paint(String name, double price, int numberOfCoats, double squareMetersPerLimit){
        super(name, price);
        this.numberOfCoats = numberOfCoats;
        this.squareMetersPerLimit = squareMetersPerLimit;
    }

    public int getNumberOfCoats(){
        return this.numberOfCoats;
    }

    public double getSquaredMetersPerLimit(){
        return this.squareMetersPerLimit;
    }

    @Override
    public int getMaterialRequrirements(Surface surface){
        return 1;
    }
}
