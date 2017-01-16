package pk.ciit.sc.finallab.calculator1;
import org.junit.*;
import static org.junit.Assert.*;

public class TestCalculator {
     Calculator calculator  = new Calculator();
	
	
			@Test
			public void square(){
			  assertEquals(4,calculator.square(2));
			}
			
			
			
			@Test
			public void square1(){
			assertEquals(36, calculator.square(-6));
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
			public void cube2(){
				assertEquals(27,calculator.cube(3));
			}
		
			
			
			
			@Test
			public void findMax(){
				assertEquals(4,calculator.findMax(3,4,3));
			}
			
			
			@Test
			public void findMax1(){
				assertEquals(4,calculator.findMax(1, 4,0));
			}
			
			
			
			@Test
			public void findMax2(){
			     	
				
				
				assertEquals(0, calculator.findMax(-4, -3,0));
			}
			
			
			@Test
		    public void testfindMax3(){
			     	assertEquals(4, calculator.findMax(4,3,0));
			}
			
			
	
	
	
}