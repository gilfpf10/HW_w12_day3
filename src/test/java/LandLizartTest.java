import Kaiju.LandLizart;
import Vehicles.Tank;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LandLizartTest {

    LandLizart landLizart;
    Tank tank;

    @Before

    public void before(){
        landLizart = new LandLizart("Godzila", 20, 4);
        tank = new Tank("war",20,4);

    }

    @Test
    public void getName(){
        assertEquals("Godzila", landLizart.getName());

    }

    @Test
    public void getHealth(){
        assertEquals(20, landLizart.getHealth());

    }

    @Test
    public void getAttack(){
        assertEquals(4, landLizart.getAttack());

    }

    @Test
    public void takeDamage() {
        landLizart.takeDamage(2);
        assertEquals(18, landLizart.getHealth());

    }
    @Test
    public void canRoar(){
        assertEquals("Miau", landLizart.roar());
    }

    @Test
    public void canAttackEnemy(){
        LandLizart.attack(Tank);
        assertEquals(8, tank );

    }

}
