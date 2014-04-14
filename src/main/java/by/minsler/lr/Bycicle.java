package by.minsler.lr;

/**
 * @author Dzmitry Misiuk
 */
public class Bycicle implements Drivable {
    @Override
    public void drive() {
        System.out.println("drive by bycicle");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
