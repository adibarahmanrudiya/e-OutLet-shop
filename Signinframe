import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signinframe extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel userlb,passlb;
	JTextField userTF;
	JPasswordField passPF;
	JButton signinbtn,exitbtn;
	Color myColor;
	Font myFont;
	
	public Signinframe()
	{
		super("e-OutLet");
		this.setSize(800,450);
		this.setLocation(300,150);
		myColor=new Color(239,228,176);
		myFont=new Font("Roboto",Font.PLAIN,28);
			
			panel=new JPanel();
			panel.setLayout(null);
			panel.setBackground(myColor);
			
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
			signinbtn.addActionListener(this);
			
			panel.add(signinbtn);
			
			exitbtn=new JButton("Exit");
			exitbtn.setBounds(400,250,100,50);
			exitbtn.setBackground(Color.RED);
			exitbtn.addActionListener(this);
					
			panel.add(exitbtn);
			
			
			
			
			this.add(panel);
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
			JOptionPane.showMessageDialog(this,"Logingin");
			Frame f1=new Frame();
			f1.setVisible(true);
			this.setVisible(false);
			}
		}
		else if(ae.getSource()==exitbtn)
		{
			Frame f1=new Frame();
			f1.setVisible(true);
			this.setVisible(false);
		}
	}
	
		
	
			
	
	
}