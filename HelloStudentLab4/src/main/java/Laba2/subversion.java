package Laba2; //����� Java �������

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //���������� ��� ������� ���������
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)
import javax.swing.text.JTextComponent;

public class subversion {
	static JComboBox combobox; // ���������� JComboBox
	static JTextField a1;
	static JTextField b1;
	static JTextField c1;
	static JTextField d1;
	String file_data = new String();
	private JTextField perimetr;
	JFrame main_GUI;
	JPanel main_panel;
	JMenuItem logo;
	
	public subversion() {
	main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,400,400,500);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	
	main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ 2"); // ����������� ������ ��� �����������
	laba_info.setBounds(120,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_inf = new JButton("����������");//���������� ������ (����������� 1)
	button_inf.setBounds(30,200,130,40);
	main_panel.add(button_inf); // ����� ������ ������������ 1
	button_inf.addActionListener(new ActionListener() { // ��������� ��������� ������ ������
        public void actionPerformed(ActionEvent e) {
        	JOptionPane.showMessageDialog(main_GUI, "����� ����������� ��� � ������ �������� ������ \n ������ ���������� �������: \n 1) �������� ��������� ������������ (19170029). \n 2) ���������� ����� ��������� (19170002). \n" + file_data);
        }
    });
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(270,200,100,40);
	ActionListener actionListener = new ListenerButton(); //������� ���������
	button_exit.addActionListener(actionListener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	
	JMenuBar menuBar = new JMenuBar(); // ���������� ����. (����������� 2)
	main_GUI.setJMenuBar(menuBar);
	JMenu editMenu = new JMenu ("����");
	menuBar.add(editMenu);

	logo = new JMenuItem("���������� ������� �����"); // ���������� ������� � ����
	editMenu.add(logo);
	editMenu.addSeparator();
	JMenuItem pr = new JMenuItem ("��������� ���� � ������16");
	editMenu.add(pr);
	editMenu.addSeparator();
	JMenuItem exit = new JMenuItem("�����");
	editMenu.add(exit);
	exit.addActionListener(actionListener);
	class ListenerLogo implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			main_panel.add(logo); // ��������� Label �� ������
			try {
				BufferedImage imgBuff = ImageIO.read(new URL ("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));

				logo.setIcon(new ImageIcon(imgBuff.getScaledInstance(150, 80, imgBuff.SCALE_DEFAULT)));
				} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			logo.setBounds(200, 0, 180, 100);
				//String picture = filepath.getAbsolutePath();// ��������� ������� �����
		}
	}

	ActionListener logotype = new ListenerLogo();
	logo.addActionListener(logotype); // ����� ������ ����������� 2
	
	
	String [] item = { // ������� ������ - ������ ������ ������������ 3
			"����������� ������� ����� � ������� ������ ����" , "����������� ������� ����� � ��������" ,
			"����������� ������� ����� � ������� ����� ����", "������������� ������ � �������16"
			};
	class logobox implements ActionListener {
		public void actionPerformed(ActionEvent push) {
			if (push.getSource() == combobox) { // �������� ��������� JComboBox
				main_panel.remove(logo);
				
				if (combobox.getSelectedItem() == "����������� ������� ����� � ������� ������ ����") {
					main_panel.add(logo); // ������� Label � ������
				}
				
				try {
					BufferedImage imgBuff = ImageIO.read(new URL ("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));

					logo.setIcon(new ImageIcon(imgBuff.getScaledInstance(150, 80, imgBuff.SCALE_DEFAULT)));
					} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
					//String picture = filepath.getAbsolutePath();// ��������� ������� �����
				logo.setBounds(225, 0, 180, 100);
				
				{
					if (combobox.getSelectedItem() == "����������� ������� ����� � ��������") {
						main_panel.add(logo);
						logo.setBounds(120, 30, 160, 100);
						try {
							BufferedImage imgBuff = ImageIO.read(new URL ("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));

							logo.setIcon(new ImageIcon(imgBuff.getScaledInstance(150, 80, imgBuff.SCALE_DEFAULT)));
							} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
							//String picture = filepath.getAbsolutePath();// ��������� ������� �����
					}
					if (combobox.getSelectedItem() == "����������� ������� ����� � ������� ����� ����") {
						main_panel.add(logo);
						logo.setBounds(0, 0, 160, 100);
						try {
							BufferedImage imgBuff = ImageIO.read(new URL ("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg"));

							logo.setIcon(new ImageIcon(imgBuff.getScaledInstance(150, 80, imgBuff.SCALE_DEFAULT)));
							} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
							//String picture = filepath.getAbsolutePath();// ��������� ������� �����
					}
				}
			}
		}
	} 
	
	combobox = new JComboBox(item); // ����������� �������� JComboBox
	
	combobox.setBounds(50,170,310,20);
				
	ActionListener listener = new logobox();
				
	combobox.addActionListener(listener);
				
	main_panel.add(combobox); // ��������� JComboBox �� ������� ������ - ����� ������ ������������ 3

	
	JButton button_load = new JButton("���������"); //�������� ������ �������� - ������ ������ ������������ 1      ���� 4
    button_load.setBounds(150,200,130,40);
    main_panel.add(button_load);
    button_load.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            FileDialog fd = new FileDialog(main_GUI);
            fd.setFile("*.txt");
            fd.setVisible(true);
        final String file = fd.getFile();
        final String dir = fd.getDirectory();
        if (dir == null || file == null || file.trim().length() == 0)
        return;
        File dir1 = new File(dir, file);
        try {
 
                BufferedReader bufferfromReader = new BufferedReader(new InputStreamReader(new FileInputStream(dir1.getAbsolutePath()), "UTF8"));
                String line;
                while ((line = bufferfromReader.readLine()) != null) {
                    System.out.println(line);
                    file_data += line+"\n";
                }
               
                bufferfromReader.close();
            } catch (Exception exception) {
                System.out.println("Error while reading file line by line:" + exception.getMessage());
        }
        }
    });

    
 // ������ ������ ������������ 2   ���� 4
 	a1 = new JTextField ();
 	a1.setToolTipText("����� ������� a");
 	a1.setBounds(30,280,70,25);
 	main_panel.add(a1);
 	JLabel text = new JLabel("�"); 
     text.setBounds(10,275,120,30);
 	main_panel.add(text);
 	b1 = new JTextField ();
 	b1.setToolTipText("����� ������� b");
 	b1.setBounds(30,300,70,25);
 	main_panel.add(b1);
 	JLabel t = new JLabel("b");
     t.setBounds(10,300,120,30);
 	main_panel.add(t);
 	c1 = new JTextField ();
 	c1.setToolTipText("����� ������� c");
 	c1.setBounds(30,320,70,25);
 	main_panel.add(c1);
 	JLabel tx = new JLabel("c"); 
     tx.setBounds(10,320,120,30);
 	main_panel.add(tx);
 	d1 = new JTextField ();
 	d1.setToolTipText("����� ������� d");
 	d1.setBounds(30,340,70,25);
 	main_panel.add(d1);
 	JLabel txt = new JLabel("d"); 
     txt.setBounds(10,340,120,30);
 	main_panel.add(txt);
 	JLabel txx = new JLabel("����� ������"); 
     txx.setBounds(30,250,120,30);
 	main_panel.add(txx);
 	
 	
 	JButton perimetr = new JButton("����������"); // ��������� ������ 
 	perimetr.setBounds(100,320,120,40);
 	main_panel.add(perimetr);
 	perimetr.addActionListener(new ActionListener() {
 		public void actionPerformed(ActionEvent e) {
 			JOptionPane.showMessageDialog(main_panel, calculate()); 
 		}

 				
 	});


	
	main_GUI.setVisible(true);
	
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
	
	public static String calculate () {
		if(a1.getText().length()==0) return "�� ������ �������� �"; //������
		if(b1.getText().length()==0) return "�� ������ �������� b";
		if(c1.getText().length()==0) return "�� ������ �������� c";
		if(d1.getText().length()==0) return "�� ������ �������� d";
	if(!isDouble(a1.getText())) return "������� �������� ��������";
	if(!isDouble(b1.getText())) return "������� �������� ��������";
	if(!isDouble(c1.getText())) return "������� �������� ��������";
	if(!isDouble(d1.getText())) return "������� �������� ��������";
	Double a = Double.parseDouble(a1.getText());
	Double b = Double.parseDouble(b1.getText());
	Double c = Double.parseDouble(c1.getText());
	Double d = Double.parseDouble(d1.getText());
	if(a<=0) return "������� �������� �������� �";
	if(b<=0) return "������� �������� �������� b";
	if(c<=0) return "������� �������� �������� c";
	if(d<=0) return "������� �������� �������� d";
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

	}
	
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}

}
