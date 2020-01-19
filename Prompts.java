import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Prompts extends JFrame implements ActionListener 
{
	// creating and declaring private JComponents
    private final JButton btnBack;
    private JButton btn1, btn2, btn3;
    private final Container frame;

	// default constructor
	public Prompts() 
	{
		// try-catch with specific code to ensure the GUI is not distorted on a Windows computer
		try 
		{ 
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} 
		catch (final ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (final InstantiationException e) 
		{
			e.printStackTrace();
		} 
		catch (final IllegalAccessException e) 
		{
			e.printStackTrace();
		}
		catch (final UnsupportedLookAndFeelException e) 
		{
			e.printStackTrace();
		}
		
		// setting up the layout and size of the window
		setSize (500, 786);
		setLocation (720, 200);
		setDefaultCloseOperation (EXIT_ON_CLOSE); 

		setContentPane (new JLabel (new ImageIcon ("Images/prompts.png")));

		frame = getContentPane();
		setUndecorated (true);
		frame.setLayout (null);
		setResizable (false);

		final Color color1 = new Color(198, 43, 43); 
		final Color color3 = new Color(255, 255, 255); 
		final Color color5 = new Color(129, 183, 49);
		
    
        btnBack = new JButton(new ImageIcon("Images/black-back-button.png"));
		btnBack.setToolTipText("Back to Main Menu");
		btnBack.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnBack.setBounds(20, 50, 80, 80);
		getContentPane().add(btnBack);

		btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);

        btn1 = new JButton("Menstruation");
        btn1.setBackground(color1);
		btn1.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btn1.setBounds(150, 320, 200, 60);
		getContentPane().add(btn1);
		
		btn2 = new JButton("Ovulation");
        btn2.setBackground(color3);
		btn2.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btn2.setBounds(150, 420, 200, 60);
		getContentPane().add(btn2);
		
		btn3 = new JButton("Neither");
        btn3.setBackground(color5);
		btn3.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btn3.setBounds(150, 520, 200, 60);
		getContentPane().add(btn3);

   


		// Display in the centre
		final Dimension dim = Toolkit.getDefaultToolkit ().getScreenSize ();
		this.setLocation (dim.width / 2 - this.getSize ().width / 2, dim.height / 2 - this.getSize ().height / 2);
		
       
        btnBack.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
		
		// setting the frame visible to the user
		setVisible(true);
		setResizable(false);
	}
	
	// method to connect and interact when the user presses buttons
	public void actionPerformed(final ActionEvent e)
	{			
		if(e.getSource() == btnBack) 
		{
			System.out.println("Back button pressed");
			new MainMenu();
        }
        if(e.getSource() == btn1) 
		{
			System.out.println("Menstruation button pressed");
			new PromptsOne();
        }
        if(e.getSource() == btn2) 
		{
			System.out.println("Ovulation button pressed");
			new PromptsOne();
        }
        if(e.getSource() == btn3) 
		{
			System.out.println("Neither button pressed");
			new PromptsOne();
		}
	}

	// self testing main method
	public static void main(String[] args) 
	{
		new Prompts();
	}
}