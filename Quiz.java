package quiz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Quiz {
	public static void main(String args[]) {
	JFrame frame = new JFrame("QuizGUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label1=new JLabel();
    label1.setText("Welcome to Quiz'o'mania!");
    label1.setBounds(220,10,500,50 );
    frame.add(label1); // Adds Button to content pane of frame
    frame.setSize(600,700);
    JLabel label2=new JLabel();
    label2.setText("The following class can be used to create disabled images:");
    label2.setBounds(10,50,500,50 );
    frame.add(label1);
    JRadioButton r1=new JRadioButton("A.GrayFilter",false);
    r1.setBounds(10,90,500,20 );
    JRadioButton r2=new JRadioButton("B.SwingConstants",false);
    r2.setBounds(10,120,500,20 );
    JRadioButton r3=new JRadioButton("C.SwinUtilities",false);
    r3.setBounds(10,150,500,20 );
    JLabel label3=new JLabel();
    label3.setText("By default, the Jspinner component encapsulates");
    label3.setBounds(10,190,500,50 );
    JRadioButton r4=new JRadioButton("A.JTextArea",false);
    r4.setBounds(10,240,500,20 );
    JRadioButton r5=new JRadioButton("B.JlayeredPane",false);
    r5.setBounds(10,270,500,20 );
    JRadioButton r6=new JRadioButton("C.JButtons",false);
    r6.setBounds(10,300,500,20 );
    frame.add(label1);
    JLabel label4=new JLabel();
    label4.setText("JDesktopPane is an example of:");
    label4.setBounds(10,340,500,50 );
    JRadioButton r7=new JRadioButton("A.An MDI",false);
    r7.setBounds(10,380,500,20 );
    JRadioButton r8=new JRadioButton("B.Subclass of JLayeredPane",false);
    r8.setBounds(10,410,500,20 );
    JRadioButton r9=new JRadioButton("C.Subclass of JInternal Frame",false);
    r9.setBounds(10,440,500,20 );
    JButton b1,b2;
    b1=new JButton("Submit");
    b1.setBounds(200,500,100,30 );
    b2=new JButton("Reset");
    b2.setBounds(300,500,100,30 );
    JTextField t=new JTextField();
    t.setBounds(200,600,200,20);
    frame.add(t);
    frame.add(label1);
    frame.add(label2);
    frame.add(label3);
    frame.add(label4);
    frame.add(b1);
    frame.add(b2);
    frame.add(r1);
    frame.add(r2);
    frame.add(r3);
    frame.add(r4);
    frame.add(r5);
    frame.add(r6);
    frame.add(r7);
    frame.add(r8);
    frame.add(r9);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setResizable(false);
    b1.addActionListener(new ActionListener(){  
 	   public void actionPerformed(ActionEvent e){  
 	            int count=0; 
 	            if(r2.isSelected()) {
 	          	      count++;
 	             }
 	            if(r5.isSelected()) {
	          	      count++;
	             }
 	            if(r9.isSelected()) {
	          	      count++;
	             }
 	            t.setText("Result="+count);
 	           }  
 	       });
     b2.addActionListener(new ActionListener(){  
  	   public void actionPerformed(ActionEvent e){  
  		  if(r2.isSelected()) {
      	      r2.setSelected(false);
          }
          if(r5.isSelected()) {
        	  r5.setSelected(false);
          }
          if(r9.isSelected()) {
        	  r9.setSelected(false);
          }
          if(r1.isSelected()) {
      	      r1.setSelected(false);
          }
          if(r3.isSelected()) {
        	  r3.setSelected(false);
          }
          if(r4.isSelected()) {
        	  r4.setSelected(false);
          }
          if(r6.isSelected()) {
      	      r6.setSelected(false);
          }
          if(r7.isSelected()) {
        	  r7.setSelected(false);
          }
          if(r8.isSelected()) {
        	  r8.setSelected(false);
          }
          t.setText("");
  	           }  
  	       });
   }
}
