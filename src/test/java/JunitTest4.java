import static org.junit.Assert.*;

import org.junit.Test;


public class JunitTest4 {
//The ¡°Time Test¡± means if an unit test takes longer than the specified number of milliseconds to run, the test will terminated and mark as failed
	@Test(timeout = 1000)  
	public void infinity() {  
		while (true);  
	}  

}
