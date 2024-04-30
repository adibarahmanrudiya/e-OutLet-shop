import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signinframe extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	JLabel userlb,passlb;
	JTextField userTF;
	JPasswordField passPF;
	JButton signinbtn,nextbtn;
	Color mycolor;
	Font myfont;
	
	public Signinframe()
	{
		super("e-OutLet");
		this.setSize(800,450);
		this.setLocation(300,150);
		mycolor=new Color(239,228,176);
		myfont=new Font("Roboto",Font.PLAIN,28);
			
			panel=new JPanel();
			panel.setLayout(null);
			panel.setBackground(mycolor);
			
			userlb=new JLabel("Username: ");
			userlb.setBounds(250,50,100,50);
			
			panel.add(userlb);
			
			userTF=new JTextField();
			userTF.setBounds(350,50,120,50);
			panel.add(userTF);
			
			passlb=new JLabel("Password: ");
			passlb.setBounds(250,120,100,50);
			panel.add(passlb);
			
			passPF=new JPasswordField();
			passPF.setBounds(350,120,120,50);
			passPF.setEchoChar('*');
			panel.add(passPF);
			
			signinbtn=new JButton("Signin");
			signinbtn.setBounds(280,250,100,50);
			signinbtn.setBackground(Color.ORANGE);
			signinbtn.addMouseListener(this);
			signinbtn.addActionListener(this);
			
			panel.add(signinbtn);
			
			nextbtn=new JButton("Next");
			nextbtn.setBounds(400,250,100,50);
			nextbtn.setBackground(Color.RED);
			nextbtn.addMouseListener(this);
			nextbtn.addActionListener(this);
					
			panel.add(nextbtn);
			
			
			
			
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
			else if(me.getSource()==nextbtn)
			{
			nextbtn.setBackground(Color.BLUE);
			nextbtn.setForeground(Color.WHITE);
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
			else if(me.getSource()==nextbtn)
			{
			nextbtn.setBackground(Color.WHITE);
			nextbtn.setForeground(Color.BLACK);
			}
			else
			{
			}
		}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=userTF.getText();
		String s2=passPF.getText();
		
		if(ae.getSource()==signinbtn)
		{
			if(s1.isEmpty()||s2.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Fill Up All");
			}
			else{
			JOptionPane.showMessageDialog(this,"Signin in");
			}
		}
		 if(ae.getSource()==nextbtn)
		{  
	        nextbtn.setBackground(Color.BLUE);
			RegisterFrame f1=new RegisterFrame();
			f1.setVisible(true);
			this.setVisible(false);
		}
	}
	
}