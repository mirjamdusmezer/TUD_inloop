public class Flooring extends Material{

    private static double limit = 0.02;
    private double widthOfFlooring;

    public Flooring(String name, double price, double width){
        super(name, price);
        this.widthOfFlooring = width;
    }

    public double getWidth(){
        return this.widthOfFlooring;
    }

    @Override
    public int getMaterialRequrirements(Surface surface){

    }
}
