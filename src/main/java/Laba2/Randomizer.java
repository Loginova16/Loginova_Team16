package Laba2;


import java.util.Arrays;
import java.util.Random;

public class Randomizer {
public int[] array = new int[10];
public Randomizer () {}
public void generate() {

for (int i = 0; i < array.length; i++) {
array[i] = getIntFromRange(100, 7000);

}

System.out.println(Arrays.toString(array));
}
static int getIntFromRange (int min, int max) {
Random random = new Random();
return random.nextInt(max - min + 1) + min;
}
}
