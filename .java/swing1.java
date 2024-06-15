//import javax.swing.*;
//import java.awt.event.*;




// public class swing1 {
//     public static void main(String[] args) {
//         JFrame f=new JFrame("Button ex");
//         JButton b =new JButton("click here");
//         JTextField tf=new JTextField();
//         b.setBounds(40,120,98,40);
//         tf.setBounds(40,80,89,50);
//         b.addActionListener(new ActionListener(){
//             public void actionPerformed(ActionEvent e) {
//                 tf.setText("hello");
//             }

//         });
//         f.add(b);
//         f.add(tf);
//         f.setSize(500,500);
//         f.setLayout(null);
//         f.setVisible(true);

//     }
    
// }

// class swing1{
//     public static void main(String[] args) {
//         JFrame f=new JFrame("label");
//         JLabel x1,x2;
//         x1=new JLabel("First label");
//         x1.setBounds(40,50,100,20);
//         x2=new JLabel("Second label");
//         x2.setBounds(30,70,90,30);
//         f.add(x1);
//         f.add(x2);
//         f.setSize(250,250);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
// }

// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class swing1  extends Frame implements ActionListener{
//     JTextField tf; JLabel l; JButton b;
//     swing1(){
//         tf=new JTextField();
//         tf.setBounds(40,40,111,40);
//         l=new JLabel();
//         l.setBounds(20,80,300,40);
//         b=new JButton("Find IP");
//         b.setBounds(30,120,90,30);
//         b.addActionListener(this);
//         add(b);
//         add(tf);
//         add(l);
//         setSize(300,600);
//         setLayout(null);
//         setVisible(true);

//     }
//         public void actionPerformed(ActionEvent e) {  
//             try{  
//                 String host=tf.getText();  
//                 String ip=java.net.InetAddress.getByName(host).getHostAddress();  
//                 l.setText("IP of "+host+" is: "+ip);  
//             }catch(Exception ex){
//                 System.out.println(ex);
//             }  
//         }
//         public static void main(String[] args) {
//             new swing1();
//         }



//     }


// public class swing1{
//     public static void main(String[] args) {
//         JFrame f=new JFrame("xyz");
//         JTextField tf= new JTextField();
//         tf.setBounds(50,50,150,50);
//         JButton b = new JButton("Confirm");
//         b.setBounds(40,100,100,50);
//         b.addActionListener( new ActionListener() {
//             public void actionPerformed(ActionEvent e){
//             tf.setEditable(false);

//         }
//         });
//         f.add(b);
//         f.add(tf);
//         f.setSize(400,400);
//         f.setLayout(null);
//         f.setVisible(true);

//     }
// }


// public class swing1 implements ActionListener{
//     JTextField tf1,tf2,tf3;
//     JButton b1,b2;
//     swing1(){
//         JFrame f= new JFrame();
//         tf1=new JTextField();
//         tf1.setBounds(50,50,100,30);
//         tf2=new JTextField();
//         tf2.setBounds(50,100,100,30);
//         tf3=new JTextField();
//         tf3.setBounds(50,150,100,30);
//         tf3.setEditable(false);
//         b1=new JButton("+");
//         b1.setBounds(50,200,100,30);
//         b2=new JButton("-");
//         b2.setBounds(50,250,100,30);
//         b1.addActionListener(this);
//         b2.addActionListener(this);
//         f.add(tf1);
//         f.add(tf2);
//         f.add(tf3);
//         f.add(b1);
//         f.add(b2);
//         f.setSize(400,400);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
//     public void actionPerformed(ActionEvent e){
//         String s1=tf1.getText();
//         String s2=tf2.getText();
//         int a=Integer.parseInt(s1);
//         int b=Integer.parseInt(s2);
//         int c=0;
//         if(e.getSource()==b1){
//             c=a+b;
//         } else if (e.getSource()==b2){
//                 c=a-b;
//             }
//             String result = String.valueOf(c);
//             tf3.setText(result);

        
//     }
//     public static void main(String[] args) {
//         new swing1();
//     }
    
// }

// import javax.swing.*;

// public class swing1{
//     public static void main(String[] args) {
//         JFrame f =  new JFrame("example practice");
//         JTextArea ta = new JTextArea();
//         ta.setBounds(20,40,100,90);
//         f.add(ta);
//         f.setSize(500,500);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
// } 

//import javax.swing.*;
// import java.awt.event.*;

// public class swing1 implements ActionListener{
//     JLabel l1,l2;
//     JPasswordField password;
//     JButton b;
//     swing1(){
//         JFrame f=new JFrame();
//         l1=new JLabel();
//         l1.setBounds(30,20,100,20);
//         l2=new JLabel();
//         l2.setBounds(200,20,100,20);
//         password=new JPasswordField();
//         password.setBounds(20,40,200,40);
//         b=new JButton("count words");
//         b.setBounds(80,370,150,30);
//         b.addActionListener(this);
//         f.add(l1);
//         f.add(l2);
//         f.add(password);
//         f.add(b);
//         f.setSize(500,500);
//         f.setLayout(null);
//         f.setVisible(true);

//     } public void actionPerformed(ActionEvent e){
//         String text= new String(password.getPassword());
//         String words[]=text.split("\\s");
//         l1.setText("words: "+ words.length);
//         l2.setText("character: " + text.length());
//     }
//     public static void main(String[] args) {
//         new swing1();
//     }
// }
// public class swing1{
// public static void main(String args[]){
//     JFrame f= new JFrame("checkbox");
//     JCheckBox c1= new JCheckBox("html");
//     c1.setBounds(20,20,100,50);
//     JCheckBox c2= new JCheckBox("Javascript", true);
//     c2.setBounds(20,100,100,50);
//     f.add(c1);
//     f.add(c2);
//     f.setSize(400,400);
//     f.setLayout(null);
//     f.setVisible(true);

// }
// }

 import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

// public class swing1{
//     public static void main(String[] args) {
//         JFrame f= new JFrame("Checkbox");
//         JLabel l=new JLabel();
//         l.setSize(300,100);
//         JCheckBox c1= new JCheckBox("HTML");
//         c1.setBounds(50,100,50,50);
//         JCheckBox c2 = new JCheckBox("JAVASCRIPT");
//         c2.setBounds(50,150,50,50);
//         f.add(c1);
//         f.add(c2);
//         f.add(l);
        

//         c1.addItemListener(new ItemListener() {
//             public void itemStateChanged(ItemEvent e ){

//                 l.setText("HTML CHECKBOX: " + (e.getStateChange()==1?"checked":"unchecked"));
//             }
            
//         });

//         c2.addItemListener(new ItemListener() {
//             public void itemStateChanged(ItemEvent e ){

//                 l.setText("JAVASCRIPT CHECKBOX: " + (e.getStateChange()==1?"checked":"unchecked"));
//             }
            
//         });

//         f.setSize(500,500);
//         f.setLayout(null);
//         f.setVisible(true);

        


//     }
// }

// public class swing1{
//     public static void main(String[] args) {
//         JFrame f = new JFrame();
//         JRadioButton r1 = new JRadioButton("A) Male");
//         JRadioButton r2 = new JRadioButton("B) Female");
//         r1.setBounds(50,50,100,50);
//         r2.setBounds(50,100,100,50);
//         ButtonGroup bg = new ButtonGroup();
//         bg.add(r1);
//         bg.add(r2);
//         f.add(r1);
//         f.add(r2);
//         f.setSize(400,400);
//         f.setLayout(null);
//         f.setVisible(true);
//     }
// }

// public class swing1{
//     public static void main(String[] args) {
//         JFrame f = new JFrame("Country");
//         String Country [] = {"India", "Pakistan", "Nepal", "Bhutan"};
//         JComboBox cb= new JComboBox(Country);
//         cb.setBounds(60,50,100,30);
//         f.add(cb);
//         f.setLayout(null);
//         f.setSize(500,500);
//         f.setVisible(true);

//     }
// }

// public class swing1{
//     public static void main(String[] args) {
//         JFrame f = new JFrame("Languages");
//         JLabel l = new JLabel();
//         l.setBounds(50,10,300,50);
//         JButton b = new JButton("show");
//         b.setBounds(50,100,100,20);
//         String languages[]={"c","c++","java","python"};
//         JComboBox cb = new JComboBox(languages);
//         cb.setBounds(70,100,80,90);
//         f.add(l);
//         f.add(b);
//         f.add(cb);
//         b.addActionListener( new ActionListener(){
//             public void actionPerformed(ActionEvent e ){
//                 String data="Programming lang selected: " + cb.getItemAt(cb.getSelectedIndex());
//                 l.setText(data);
//             }
//         });
//         f.setSize(400,400);
//         f.setLayout(null);
//         f.setVisible(true);

//     }
// }

public class swing1{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        p.setBounds(50,100,300,300);
        p.setBackground(Color.lightGray);
        JButton b1 = new JButton("Button 1");
        b1.setBounds(40,80,80,40);
        b1.setBackground(Color.darkGray);
        JButton b2 = new JButton("Button 2");
        b2.setBounds(100,80,80,40);
        b2.setBackground(Color.darkGray);
        p.add(b1);
        p.add(b2);
        f.add(p);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}