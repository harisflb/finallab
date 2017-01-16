package pk.ciit.sc.final1.calculator;
import org.junit.*;
import static org.junit.Assert.*;

public class TestCalculator {
private static Calculator calculator  = new Calculator();
	
	
	@Test
	public void square(){
	
		assertEquals(4,calculator.square(2));
	}
	
	
	
	@Test
	public void square1(){
		
		assertEquals(9, calculator.square(-3));
	}
	
	
	@Test
	public void cube(){
		assertEquals(8, calculator.cube(2));
	}
	
	
	@Test
	public void cube1(){
		assertEquals(-8,calculator.cube(-2));
	}

	
	
	
	@Test
	public void testfindMax(){
		assertEquals(4,calculator.findMax(3,4,3));
	}
	
	
	@Test
	public void testfindMax1(){
		assertEquals(4,calculator.findMax(1, 4,0));
	}
	
	
	
	@Test
	public void testfindMax2(){
	     	
		
		
		assertEquals(0, calculator.findMax(-4, -3,0));
	}
	
	
	@Test
    public void testfindMax3(){
	     	assertEquals(4, calculator.findMax(4,3,0));
	}
	
	
	
	
	
}