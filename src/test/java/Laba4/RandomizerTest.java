package Laba4;
import static org.junit.Assert.*;
import org.junit.Test;
import Laba2.Randomizer;
public class RandomizerTest {

	@Test
	public void testAssertEquals() {
		Randomizer randomjunior = new Randomizer ();
		randomjunior.generate();
		 for (int i = 0; i < randomjunior.array.length; i++) {
			 assertTrue ((randomjunior.array[i]) <7000 & (randomjunior.array[i] > 100));
	     }
	}

	

}
