package friday13.bullshit;

public class Shape {

    public double length;
    public double width;

    public Shape(double length, double width){
        this.length=length;
        this.width=width;
    }

    public void calculateAreaMethod(){
        System.out.println(length*width);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
