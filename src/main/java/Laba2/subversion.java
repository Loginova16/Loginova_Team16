package Laba2; //пакет Java классов

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class subversion {
	private static final String tmpFile = null;
	static JComboBox combobox; // добавление JComboBox
	static JTextField a1;
	static JTextField b1;
	static JTextField c1;
	static JTextField d1;
	static JTextField radiusInput;
	String file_data = new String();
	public subversion() {
		final JFrame main_GUI = new JFrame("subversion"); // создание графического окна
		main_GUI.setTitle ("Using subversion for developers");
		main_GUI.setBounds(500,400,400,500);
		main_GUI.setResizable(false); // фиксированный размер окна


final JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
main_panel.setLayout(null);
main_GUI.add(main_panel);

JLabel laba_info = new JLabel("Лабораторная работа №4"); // Отображение текста или изображения
laba_info.setBounds(120,0,150,30);
main_panel.add(laba_info);

JButton button_exit = new JButton("Выход"); // добавляем кнопку.
button_exit.setBounds(270,200,100,40);
ActionListener actionListener = new ListenerButton(); //создаем слушатель
button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
main_panel.add(button_exit);

JButton button_info = new JButton("Информация"); // добавляем кнопку информация - Начало работы Разработчика 1
button_info.setBounds(30,200,130,40);
main_panel.add(button_info);
button_info.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg1) {
Buba bubble = new Buba(10);
String arrayStr = bubble.getStringArray();
bubble.bubbleSorter();
String arraySorted = arrayStr + " \nSorted: "+bubble.getStringArray();
JOptionPane.showMessageDialog(main_panel, "Здесь размещаются ФИО и номера зачетных книжек \n Список участников команды: \n 1) Логинова Анастасия Валентиновна (19170029). 23.09.2021 \n 2) Хайруллина Элина Маратовна (19170002). 23.09.2021 \n" +arraySorted+" \n" + file_data);
}


});
JButton button_load = new JButton("Загрузить"); //добавил кнопку загрузки - Начало работы Разработчика 1 Лаба 4
button_load.setBounds(145,250,120,40);
main_panel.add(button_load);
button_load.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg1) {
loadFile(main_GUI);
}
});

// Конец работы разработчика 1 лаба 4

// Конец работы разработчика 1
JMenuBar bar = new JMenuBar(); // Создаем выпадающее меню -мНачало работы разработчика 2
main_GUI.setJMenuBar(bar);
JMenu menu = new JMenu("Меню");
main_panel.add(menu); // Добавляем меню на главную панель
bar.add(menu);
final JMenuItem logo = new JMenuItem("Отобразить логотип УГАТУ");
main_panel.add(logo);
menu.add(logo); // Добавляем логотип на главную панель

JMenuItem file_button = new JMenuItem("Загрузить файл в проект3"); // Добавляем в список элементов меню новую кнопку "Загрузить файл в проект3"
main_panel.add(file_button);
menu.add(file_button);

class ListenerLoad implements ActionListener {
public void actionPerformed(ActionEvent arg0) {
loadFile(main_GUI);
}
}

ActionListener loadfile = new ListenerLoad(); // создаем слушатель для кнопки "Отобразить логотип УГАТУ"
file_button.addActionListener(loadfile);

JMenuItem exit = new JMenuItem("Выход"); // Добавляем в список элементов меню кнопку "Выход"
main_panel.add(exit);
menu.add(exit);
exit.addActionListener(actionListener);

class ListenerLogo implements ActionListener {

public void actionPerformed(ActionEvent arg0) {

main_panel.add(logo); // вставляем Label на панель
//File filepath = new File("src/main/java/Логотип УГАТУ.jpg");
try {
BufferedImage imgBuff = ImageIO.read(new URL
("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));

logo.setIcon(new ImageIcon(imgBuff.getScaledInstance(150, 80, imgBuff.SCALE_DEFAULT)));
} catch (MalformedURLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
//String picture = filepath.getAbsolutePath();// вставляем логотип УГАТУ

logo.setBounds(220,30,150,120); // задаем расположение окна и размер логотипа УГАТУ

}

}

ActionListener logotype = new ListenerLogo(); // создаем слушатель для кнопки "Отобразить логотип УГАТУ"
logo.addActionListener(logotype); // добавляем слушатель к кнопке "Отобразить логотип УГАТУ" - Конец работы разрабочика 2


String [] item = { // Создаем массив - Начало работы разработчика 3
"Переместить логотип УГАТУ в верхний правый угол" , "Переместить логотип УГАТУ в середину" ,
"Переместить логотип УГАТУ в верхний левый угол", "Отсортировать данные проект3"
};

class logobox implements ActionListener {

public void actionPerformed(ActionEvent push) {

if (combobox.getSelectedItem() == "Переместить логотип УГАТУ в верхний правый угол") {
logo.setBounds(200,30,150,120); // вставка Label в панель
}

if (combobox.getSelectedItem() == "Переместить логотип УГАТУ в середину") {
logo.setBounds(110,30,150,120);

}
if (combobox.getSelectedItem() == "Переместить логотип УГАТУ в верхний левый угол") {

logo.setBounds(20,30,150,120);

}
}
}


combobox = new JComboBox(item); // Присваиваем значения JComboBox
combobox.setBounds(50,170,310,20);
ActionListener listener = new logobox();
combobox.addActionListener(listener);
main_panel.add(combobox); // Добавляем JComboBox на главную панель - Конец работы разработчика 3

a1 = new JTextField ();
a1.setToolTipText("Длина стороны a");
a1.setBounds(30,280,70,25);
main_panel.add(a1);
JLabel text = new JLabel("а");
text.setBounds(10,275,120,30);
main_panel.add(text);
b1 = new JTextField ();
b1.setToolTipText("Длина стороны b");
b1.setBounds(30,300,70,25);
main_panel.add(b1);
JLabel t = new JLabel("b");
t.setBounds(10,300,120,30);
main_panel.add(t);
c1 = new JTextField ();
c1.setToolTipText("Длина стороны c");
c1.setBounds(30,320,70,25);
main_panel.add(c1);
JLabel tx = new JLabel("c");
tx.setBounds(10,320,120,30);
main_panel.add(tx);
d1 = new JTextField ();
d1.setToolTipText("Длина стороны d");
d1.setBounds(30,340,70,25);
main_panel.add(d1);
JLabel txt = new JLabel("d");
txt.setBounds(10,340,120,30);
main_panel.add(txt);
JLabel txx = new JLabel("Длина сторон");
txx.setBounds(30,250,120,30);
main_panel.add(txx); 

JButton perimetr = new JButton("Расчет"); // добавляем кнопку Начало работы разработчика 3 лаба 4
perimetr.setBounds(152,320,120,40);
main_panel.add(perimetr);
perimetr.addActionListener(new ActionListener() 
{
public void actionPerformed(ActionEvent arg1) {
JOptionPane.showMessageDialog(main_panel, calculate());
}


});



main_GUI.setVisible(true);

main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
}

public static String calculate () {
	if(a1.getText().length()==0) return "Не введен параметр а"; //расчет
	if(b1.getText().length()==0) return "Не введен параметр b";
	if(c1.getText().length()==0) return "Не введен параметр c";
	if(d1.getText().length()==0) return "Не введен параметр d";
	if(!isDouble(a1.getText())) return "Введено неверное значение";
	if(!isDouble(b1.getText())) return "Введено неверное значение";
	if(!isDouble(c1.getText())) return "Введено неверное значение";
	if(!isDouble(d1.getText())) return "Введено неверное значение";
	Double a = Double.parseDouble(a1.getText());
	Double b = Double.parseDouble(b1.getText());
	Double c = Double.parseDouble(c1.getText());
	Double d = Double.parseDouble(d1.getText());
	if(a<=0) return "Введено неверное значения а";
	if(b<=0) return "Введено неверное значения b";
	if(c<=0) return "Введено неверное значения c";
	if(d<=0) return "Введено неверное значения d";
	Double p = a + b + c + d;
	return ("p=" + p); 
}

public static boolean isDouble(String x) throws NumberFormatException
{
try {
Double.parseDouble(x);
return true;
} catch(Exception e) {
return false;
}
} // Конец работы разработчика 3 лаба 4


public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
subversion student= new subversion();

}
public void loadFile(JFrame main_GUI)
{
FileDialog fd = new FileDialog(main_GUI);
fd.setFile("*.txt");
fd.setVisible(true);
final String file = fd.getFile();
final String dir = fd.getDirectory();
if (dir == null || file == null || file.trim().length() == 0)
return;
File dir1 = new File(dir, file);
try {
FileReader bestfile = new FileReader(dir1.getAbsolutePath());

BufferedReader bufferfromReader = new BufferedReader(new InputStreamReader(new FileInputStream(dir1.getAbsolutePath()), "UTF8"));
String line;
while ((line = bufferfromReader.readLine()) != null) {
System.out.println(line);
file_data+=line+'\n';
}

bufferfromReader.close();
} catch (Exception exception) {
System.out.println("Error while reading file line by line:" + exception.getMessage());
}
}

}