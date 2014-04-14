package by.minsler.lr;

/**
 * @author Dzmitry Misiuk
 */
public class Car implements Drivable {

    @Override
    public void drive() {
        System.out.println("Drive by car");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
