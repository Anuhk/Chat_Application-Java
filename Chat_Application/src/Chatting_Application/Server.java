package Chatting_Application;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.event.*;
import java.awt.*;
import java.text.*;
import java.util.*;


public class Server extends JFrame implements ActionListener {
	JTextField text;

	JPanel textarea;

	Box vertical=Box.createVerticalBox();

	Server(){
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(7,94,84));
		p1.setBounds(0,0,450,70);
		p1.setLayout(null);
		add(p1);
		
		ImageIcon i1= new ImageIcon("C:\\Users\\Anushka\\AppData\\Local\\Temp\\f8fd11aa-7efa-48a5-8fb9-34f9182487f9_icons-20240329T172151Z-001.zip.7f9\\icons\\arrow.jpg");
		Image i2= i1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel back= new JLabel(i3);
		JFrame frame=new JFrame();
		frame.add(new JLabel(i1));
		back.setBounds(5,20,25,25);
		p1.add(back);
		 back.addMouseListener(new MouseAdapter(){
			 public void mouseClicked(MouseEvent ae) {
				 System.exit(0);
			 }
		 });
		 ImageIcon i4= new ImageIcon("C:\\Users\\Anushka\\Desktop\\Image\\pr.jpg");
			
			Image i5= i4.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
			ImageIcon i6=new ImageIcon(i5);
			 JLabel profile= new JLabel(i6);
			 JFrame frame1=new JFrame();
			frame1.add(new JLabel(i4));
			profile.setBounds(40,10,50,50);
			p1.add(profile);
			
ImageIcon i7= new ImageIcon("C:\\Users\\Anushka\\AppData\\Local\\Temp\\68aa4350-f4a1-44be-961b-257ba02b73e6_icons-20240329T172151Z-001.zip.3e6\\icons\\video.png");
			
			Image i8= i7.getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT);
			ImageIcon i9=new ImageIcon(i8);
			 JLabel video= new JLabel(i9);
			 JFrame frame2=new JFrame();
			frame2.add(new JLabel(i7));
			video.setBounds(300,20,40,40);
			p1.add(video);
			
ImageIcon i10= new ImageIcon("C:\\Users\\Anushka\\AppData\\Local\\Temp\\1b1c4ffe-1492-4488-a798-b1d39c254d30_icons-20240329T172151Z-001.zip.d30\\icons\\phone.png");
			
			Image i11= i10.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
			ImageIcon i12=new ImageIcon(i11);
			 JLabel ph= new JLabel(i12);
			 JFrame frame3=new JFrame();
			frame3.add(new JLabel(i10));
			ph.setBounds(360,25,35,30);
			p1.add(ph);
			
ImageIcon i13= new ImageIcon("C:\\Users\\Anushka\\AppData\\Local\\Temp\\340b1e43-e9ef-4262-8491-6a200848bb5c_icons-20240329T172151Z-001.zip.b5c\\icons\\3icon.png");
			
			Image i14= i13.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
			ImageIcon i15=new ImageIcon(i14);
			 JLabel morevert= new JLabel(i15);
			 JFrame frame4=new JFrame();
			frame4.add(new JLabel(i15));
			morevert.setBounds(410,29,10,25);
			p1.add(morevert);
			
			JLabel name=new JLabel("Person 1");
			name.setBounds(110,15,100,18);
			name.setForeground(Color.WHITE);
			name.setFont(new Font("SAN_SERIF",Font.BOLD,18));
			p1.add(name);
			
			
			JLabel status=new JLabel("Online");
			status.setBounds(110,35,100,18);
			status.setForeground(Color.WHITE);
			status.setFont(new Font("SAN_SERIF",Font.BOLD,14));
			p1.add(status);
			
			
			JPanel textarea= new JPanel();
			textarea.setBounds(5,75,440,570);
			add(textarea);
			
			JTextField text=new JTextField();
			text.setBounds(5,655,310,40);
			text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
			add(text);
			
			JButton send= new JButton("Send");
			send.setBounds(320,655,123,40);
			send.setBackground(new Color(7,94,84));
			send.setForeground(Color.WHITE);
			send.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
			add(send);
			
			
		setSize(450,700);
		setLocation(200,50);
		setUndecorated(true);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		 String out= text.getText();

			

		 JPanel p2 = formatLabel(out);

		

		 textarea.setLayout(new BorderLayout());

		 

		 JPanel right = new JPanel(new BorderLayout());

		  right.add(p2,BorderLayout.LINE_END);

		     vertical.add(right);

		     vertical.add(Box.createVerticalStrut(20));

		      textarea.add(vertical,BorderLayout.PAGE_START);

		     text.setText("");

		     repaint();

		     invalidate();

		     validate();
		
	}
	public static JPanel formatLabel(String out){


		 JPanel panel = new JPanel();

		 panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

		 JLabel output = new JLabel(out);

		 output.setFont(new Font("Tarun",Font.PLAIN,20));

		 output.setBackground(new Color(37,211,102));

		 output.setOpaque(true);

		  output.setBorder(new EmptyBorder(15,15,15,50));

		  panel.add(output);

		  Calendar cal =Calendar.getInstance();

		  SimpleDateFormat sdf= new SimpleDateFormat("HH:mm") ;

		    

		  JLabel time = new JLabel();

		  time.setText(sdf.format(cal.getTime()));

		  panel.add(time);

		  

		  

		 return panel;

	}

	
	
  public static void main(String [] args) {
	  
	  new Server();
  }
}
