package friday13.bullshit;

public class Circle {

    public double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public void calculateArea(){
        System.out.println(Math.PI*(radius*radius));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
