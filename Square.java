package friday13.bullshit;

public class Square {

    public double length;

    public Square(double length){
        this.length=length;
    }

    public void calculateArea(){
        System.out.println(length*length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
