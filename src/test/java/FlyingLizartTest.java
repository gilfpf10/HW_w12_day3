import Kaiju.FlyingLizard;
import Vehicles.Jet;
import interfaces.IDamage;
import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;


public class FlyingLizartTest {

    FlyingLizard flyingLizard;
    Jet jet;


    @Before

    public void before() {
        flyingLizard = new FlyingLizard("Liz1", 10, 2);
        jet = new Jet("Plain", 10, 2);

    }

    @Test
    public void getName() {
        assertEquals("Liz1", flyingLizard.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(10, flyingLizard.getHealth());

    }

    @Test
    public void getAttack() {
        assertEquals(2, flyingLizard.getAttack());
    }

    @Test
    public void takeDamage() {
        flyingLizard.takeDamage(2);
        assertEquals(8, flyingLizard.getHealth());

    }

    @Test
    public void canRoar() {
        assertEquals("Miau", flyingLizard.roar());
    }

}

