package Laba2;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MasTest {
static Mas mas;
@BeforeClass
public static void setUpBeforeClass() throws Exception {
mas= new Mas();
mas.zapolnenie();
}

@Test
public void masArray() {
assertEquals(7,mas.array.length); //проверка длины массива
for(int i=0; i<mas.array.length; i++)
{
assertNotNull(mas.array[i]);//проверка элементов на Null
}
}
}