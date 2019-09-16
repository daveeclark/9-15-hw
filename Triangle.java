package friday13.bullshit;

public class Triangle {

    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    public void calculatePerimeter(){
        System.out.println(sideA+sideB+sideC);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
