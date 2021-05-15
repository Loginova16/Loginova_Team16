package Laba6;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.Buba;

public class BubaTest {
static Buba Ris;
@BeforeClass
public static void setUpBeforeClass() throws Exception {
Ris = new Buba(5);
Ris.bubbleSorter();
}

@AfterClass
public static void tearDownAfterClass() throws Exception {
Ris=null;
}
@Test
public void test() {
for(int i=0; i<Ris.a.length - 1; i++)
{
assertTrue(Ris.a[i]<=Ris.a[i+1]);
}
}

}
