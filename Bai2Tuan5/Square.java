public class Square extends Rectangle{
    private double size = 1.0;
    public Square(){
        
    }
    public Square(double Size){
        this.size = size;
    }
    public Square(double Size, String color, boolean filled){
        setColor(color);
        setFilled(filled);
        this.size = size;
    }
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
}
