mport java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Sframe implements ActionListener
{
JFrame jf;
JButton jb;
Button b;
JTextField jtf;
Sframe(String s)
{
jf=new JFrame(s);
jtf = new JTextField();
jtf.setBounds(30,50,100,100);
jb=new JButton(“SWING”);
b=new Button(“AWT”);
b.setBounds(170, 200, 90,60);
jb.setBounds(170,100,90,70);

jf.add(jtf);
jf.add(b);
jf.add(jb);

 
b.addActionListener(this);
jb.addActionListener(this);

jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
jf.setSize(700,500);
jf.setLayout(null);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==jb)
{
jtf.setText(“swing pressed”);
}
else if(e.getSource()==b)
{
jtf.setText(“awt pressed”);
}
}
public static void main(String…a)
{
new Sframe(” my simng frame”);
}
}