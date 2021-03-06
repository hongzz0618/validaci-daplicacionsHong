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
    @Test
    public void testPuntDefinit() {
        // comprova que el constructor Punt(int,int) deixi els valors correctes
        Punt p = new Punt(77, 234);
        assertEquals(77, p.getX());
        assertEquals(234, p.getY());
    }

    @Test
    public void testSuma() {
        // comprova que el constructor Punt(int,int) deixi els valors correctes
        Punt p = new Punt();
        assertEquals(7, p.suma(2, 5));
    }
    
    
    @Test
    public void testnegative() {
    	 Punt p = new Punt();
         p.versinegativo(1);
    }

   

	public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
        
        
    }
}