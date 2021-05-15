package Laba2;

import java.util.Random;

public class Buba{
public int[] a; //ссылка на массив

public Buba(int max){ //конструктор класса
Randomizer rndmsr = new Randomizer();
rndmsr.array = new int[max];
rndmsr.generate();
a = rndmsr.array;
}

private void toSwap(int first, int second){ //метод меняет местами пару чисел массива
int dummy = a[first]; //во временную переменную помещаем первый элемент
a[first] = a[second]; //на место первого ставим второй элемент
a[second] = dummy; //вместо второго элемента пишем первый из временной памяти
}

public void bubbleSorter(){ //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
for (int out = a.length - 1; out >= 1; out--){ //Внешний цикл
for (int in = 0; in < out; in++){ //Внутренний цикл
if(a[in] > a[in + 1]) //Если порядок элементов нарушен
toSwap(in, in + 1); //вызвать метод, меняющий местами
}
}
}
public String getStringArray()
{
String result = "";
for (int i=0; i<a.length; i++){
result += "i"+i+":"+a[i]+ " ";
}
return result;
}
}