package friday13.bullshit;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle bikeShit = new Bicycle(2, 4, 27);
        bikeShit.applyBrake(7);
        bikeShit.speedUp(3);

        System.out.println(bikeShit);
    }
}
