package Laba2;

public class Mas {
	public int [] array;
	public Mas () {
		 array= new int[9];
	}
 public void zapolnenie () {
	 Randomizer rnd = new Randomizer ();
     for(int i=0; i<array.length; i++)
     {
         array[i] = rnd.getIntFromRange (1,10);
     }
	 
 }
 public int arraydlina () {
	 return array.length;
 }

}
