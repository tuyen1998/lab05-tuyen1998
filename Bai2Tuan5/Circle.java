public class Circle extends Shape{
    private double radius = 1.0;
    private final double Pi = 3.14;
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Pi*radius*radius;
    }
    public double getPerimeter(){
        return 2*Pi*radius;
    }
}
