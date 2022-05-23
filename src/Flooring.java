public class Flooring extends Material{

    private static double limit = 0.02;
    private double widthOfFlooring;

    public Flooring(String name, double price, double width){
        super(name, price);
        if(width <=0){
			throw new IllegalArgumentException();
        }
        widthOfFlooring = width;
    }

    public double getWidth(){
        return widthOfFlooring;
    }

    @Override
    public int getMaterialRequrirements(Surface surface){

        if(surface == null){
            throw new NullPointerException();
        }
        double fläche =  (surface.getArea()/widthOfFlooring);
        return (int)(fläche/limit);
    }
}
