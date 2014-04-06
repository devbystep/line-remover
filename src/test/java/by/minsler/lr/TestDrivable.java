package by.minsler.lr;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dzmitry Misiuk
 */
public class TestDrivable {

    @Test
    public void testGenericAndPolimorphsim() {
        List<Object> drivableThings = new ArrayList<Object>();
        drivableThings.add(new Car());
        drivableThings.add(new Bycicle());
        drivableThings.add("dsadsa");
        try {
            for (Object dr : drivableThings) {
                Drivable a = (Drivable) dr;
                a.drive();
            }
        } catch (ClassCastException e) {
            System.out.println("you are tried bad class cast");
        }
    }
}
