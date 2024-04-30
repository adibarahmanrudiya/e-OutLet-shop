import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterFrame extends JFrame implements MouseListener,ActionListener
{
	JPanel panel;
	Color mycolor,mycolor2;
	Font myfont;
	JLabel namelb,emaillb,genderlb,doblb,addresslb;
	JTextField nameTF,emailTF,phoneTF;
	JRadioButton male,female;
	ButtonGroup bg1;
	JComboBox day,month,year;
	JTextArea t1;
	JCheckBox terms;
	JButton submit;
	
	public RegisterFrame()
	{
		super("e-OutLet");
		this.setSize(700,500);
		this.setLocation(300,150);
		mycolor=new Color(239,228,176);
		mycolor2=new Color(200,100,120);
		myfont=new Font("Roboto",Font.PLAIN,28);
		
			panel=new JPanel();
			panel.setLayout(null);
			panel.setBackground(mycolor);
			
			namelb=new JLabel("Name: ");
			namelb.setBounds(20,50,100,20);
			
			
			panel.add(namelb);
			
			nameTF=new JTextField();
			nameTF.setBounds(130,50,100,20);
	
			panel.add(nameTF);
			
			emaillb=new JLabel("E-mail");
			emaillb.setBounds(20,100,100,20);
			
			panel.add(emaillb);
			
			emailTF=new JTextField();
			emailTF.setBounds(130,100,100,20);
			panel.add(emailTF);
			
			
			genderlb=new JLabel("Gender");
			genderlb.setBounds(20,150,100,20);
			panel.add(genderlb);
			
			male=new JRadioButton("Male");
			male.setBounds(130,150,80,20);
			male.setBackground(mycolor2);
			male.addMouseListener(this);
		    male.addActionListener(this);
			male.setSelected(true);
			panel.add(male);
			
			female=new JRadioButton("Female");
			female.setBounds(220,150,80,20);
			female.setBackground(mycolor2);
			female.addMouseListener(this);
			female.addActionListener(this);
			female.setSelected(true);
			panel.add(female);
			
			bg1=new ButtonGroup();
			bg1.add(male);
			bg1.add(female);
			
			doblb=new JLabel("Date of birth");
			doblb.setBounds(20,200,100,20);
			panel.add(doblb);
			
			String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
			String months[]={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
			String years[]={"2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998"};
			
			
			day=new JComboBox(days);
			day.setBounds(130,200,50,20);
			panel.add(day);
			month=new JComboBox(months);
			month.setBounds(190,200,50,20);
			panel.add(month);
			year=new JComboBox(years);
			year.setBounds(250,200,60,20);
			panel.add(year);
			
			addresslb=new JLabel("Address");
			addresslb.setBounds(20,250,100,20);
			panel.add(addresslb);
			
			t1=new JTextArea();
			t1.setBounds(130,240,200,50);
			panel.add(t1);
			
			terms=new JCheckBox("Accept all terms and conditions");
			terms.setBounds(50,300,220,20);
			panel.add(terms);
			
			submit=new JButton("Submit");
			submit.setBounds(150,350,80,20);
			submit.setBackground(Color.BLUE);
			submit.addMouseListener(this);
			submit.addActionListener(this);
			panel.add(submit);
			
		
		
		this.add(panel);
		
	}
	    public void mouseClicked(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseReleased(MouseEvent me){}
		public void mouseEntered(MouseEvent me)
		{
			
			if(me.getSource()==submit)
			{
			submit.setBackground(Color.BLUE);
			submit.setForeground(Color.WHITE);
			}
			else
			{
			}
		}
		public void mouseExited(MouseEvent me)
		{
			
			if(me.getSource()==submit)
			{
			
			submit.setBackground(Color.WHITE);
			submit.setForeground(Color.BLACK);
			}
			else
			{
			}
		}
   public void actionPerformed(ActionEvent ae)
		{
			String command=ae.getActionCommand();
			if(ae.getSource()==submit)
			{
				submit.setBackground(Color.BLUE);
				Signinframe f1=new Signinframe();
				f1.setVisible(true);
				this.setVisible(false);
			}
		}
}
			
	