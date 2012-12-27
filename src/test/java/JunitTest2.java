import static org.junit.Assert.*;

import org.junit.Test;


public class JunitTest2 {

	@Test(expected = ArithmeticException.class)  
	public void divisionWithException() {  
	  int i = 1/0;
	} 

}
