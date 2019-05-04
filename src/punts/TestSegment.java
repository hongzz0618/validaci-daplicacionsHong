package punts;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSegment {
	 @Test
	    public void TestSegment() {
	        Segment p = new Segment();
	        assertEquals(136, p.longitud());
	    }

	    public static void main(String args[]) {
	        org.junit.runner.JUnitCore.main("TestPunt");
	        
	        
	    }

}