package Laba2;

import java.util.Random;

public class Buba{
public int[] a; //������ �� ������

public Buba(int max){ //����������� ������
Randomizer rndmsr = new Randomizer();
rndmsr.array = new int[max];
rndmsr.generate();
a = rndmsr.array;
}

private void toSwap(int first, int second){ //����� ������ ������� ���� ����� �������
int dummy = a[first]; //�� ��������� ���������� �������� ������ �������
a[first] = a[second]; //�� ����� ������� ������ ������ �������
a[second] = dummy; //������ ������� �������� ����� ������ �� ��������� ������
}

public void bubbleSorter(){ //����� ����������� ����������
for (int out = a.length - 1; out >= 1; out--){ //������� ����
for (int in = 0; in < out; in++){ //���������� ����
if(a[in] > a[in + 1]) //���� ������� ��������� �������
toSwap(in, in + 1); //������� �����, �������� �������
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