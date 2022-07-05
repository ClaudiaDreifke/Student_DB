import model.ComputerScienceStudent;
import model.PhysicsStudent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.beans.Transient;

public class TestPhysicsStudent {

    @Test

    public void testPhysicsStudent_Address() {
        // given
        PhysicsStudent student2 = new PhysicsStudent("Lars", "464", "e=mc2");
        // when
        String actual = student2.getAdress();
        // then
        Assertions.assertEquals("Hauptstr. 3", actual);
    }
    @Test
    public void testComputerScienceStudent_Address() {
        // given
        ComputerScienceStudent student1 = new ComputerScienceStudent("Timo", "234", "Java", "Phyton");

        // when
        String actual = student1.getAdress();
        // then
        Assertions.assertEquals("Kurze Str. 12", actual);
    }
}