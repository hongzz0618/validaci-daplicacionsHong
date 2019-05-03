package punts;
import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static

public class TestPunt {
    @Test
    public void testPuntConstructor() {
        // comprova que el constructor Punt() pugui ser cridat
        Punt p = new Punt();
    }

    @Test
    public void testPuntBuit() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt();
        assertEquals(0, p.getX()); // Afirma que la coordenada x val 0
        assertEquals(0, p.getY());
        //doneem un valor al x del p 
        p.setX(2);
        assertEquals(2, p.getX());
        p.setY(3);
        assertEquals(3, p.getY());
        
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
        
        
    }
}