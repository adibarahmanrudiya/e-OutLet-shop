import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rudiyaframe extends JFrame implements MouseListener,ActionListener

{
		JPanel panel;
		JButton signinbtn,registerbtn;
		Color mycolor;
		Font myfont;
		ImageIcon img;
		
		public Rudiyaframe()
		{
			super("e-OutLet");//project name
			this.setSize(800,450);
			this.setLocation(300,150);
			
			mycolor=new Color(239,228,176);
			myfont=new Font("Roboto",Font.PLAIN,28);
			
			panel=new JPanel();
			panel.setLayout(null);
			panel.setBackground(mycolor);
			
			signinbtn=new JButton("Sign in");
			signinbtn.setBounds(180,225,200,90);
			signinbtn.setBackground(Color.BLUE);
			signinbtn.addMouseListener(this);
			signinbtn.addActionListener(this);
			panel.add(signinbtn);
			
			registerbtn=new JButton("Register");
			registerbtn.setBounds(400,225,200,90);
			registerbtn.setBackground(Color.GRAY);
			registerbtn.addMouseListener(this);
			registerbtn.addActionListener(this);
			panel.add(registerbtn);
			
			
			this.add(panel);
		}
		public void mouseClicked(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseReleased(MouseEvent me){}
		public void mouseEntered(MouseEvent me)
		{
			
			if(me.getSource()==signinbtn)
			{
			signinbtn.setBackground(Color.BLUE);
			signinbtn.setForeground(Color.WHITE);
			}
			else if(me.getSource()==registerbtn)
			{
			registerbtn.setBackground(Color.BLUE);
			registerbtn.setForeground(Color.WHITE);
			}
			else
			{
			}
		}
		public void mouseExited(MouseEvent me)
		{
			
			if(me.getSource()==signinbtn)
			{
			
			signinbtn.setBackground(Color.WHITE);
			signinbtn.setForeground(Color.BLACK);
			}
			else if(me.getSource()==registerbtn)
			{
			registerbtn.setBackground(Color.WHITE);
			registerbtn.setForeground(Color.BLACK);
			}
			else
			{
			}
		}
		public void actionPerformed(ActionEvent ae)
		{
			String command=ae.getActionCommand();
			if(ae.getSource()==signinbtn)
			{
				signinbtn.setBackground(Color.BLUE);
				Signinframe f1=new Signinframe();
				f1.setVisible(true);
				this.setVisible(false);
			}
		}
}
			
		

	
	
	
	
	
	
	
	
	