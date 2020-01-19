import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class PromptsOne extends JFrame implements ActionListener 
{
	// creating and declaring private JComponents
    private final JButton btnExit, btnBack;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private final Container frame;

	// default constructor
	public PromptsOne() 
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

		setContentPane (new JLabel (new ImageIcon ("Images/1.png")));

		frame = getContentPane();
		setUndecorated (true);
		frame.setLayout (null);
		setResizable (false);

		final Color color1 = new Color(198, 43, 43); 
	//	final Color color2 = new Color(237, 144, 45); 
		final Color color3 = new Color(242, 223, 84); 
	//	final Color color4 = new Color(192, 211, 82); 
		final Color color5 = new Color(129, 183, 49); 
		
		
		btn2 = new JButton("Yes");
        btn2.setBackground(color5);
		btn2.setToolTipText("Yes");
		btn2.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btn2.setBounds(100, 420, 100, 50);
		getContentPane().add(btn2);
		
		btn3 = new JButton("N/A");
        btn3.setBackground(color3);
		btn3.setToolTipText("N/A");
		btn3.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btn3.setBounds(200, 420, 100, 50);
		getContentPane().add(btn3);
		
		btn4 = new JButton("No");
        btn4.setBackground(color1);
		btn4.setToolTipText("No");
		btn4.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btn4.setBounds(300, 420, 100, 50);
		getContentPane().add(btn4);
		
		
		
		// creating the button and setting bounds for the exit button
        btnExit = new JButton(new ImageIcon("Images/black-close-button.png"));
		btnExit.setToolTipText("Exit");
		btnExit.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnExit.setBounds(370, 650, 80, 80);
		getContentPane().add(btnExit);
		
		btnExit.setOpaque(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setBorderPainted(false);
        
        btnBack = new JButton(new ImageIcon("Images/black-back-button.png"));
		btnBack.setToolTipText("Back to Main Menu");
		btnBack.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnBack.setBounds(40, 650, 80, 80);
		getContentPane().add(btnBack);

		btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);

		// Display in the centre
		final Dimension dim = Toolkit.getDefaultToolkit ().getScreenSize ();
		this.setLocation (dim.width / 2 - this.getSize ().width / 2, dim.height / 2 - this.getSize ().height / 2);
		
        btnExit.addActionListener(this);
		btnBack.addActionListener(this);

		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);	
		

		
		// setting the frame visible to the user
		setVisible(true);
		setResizable(false);
	}
	
	// method to connect and interact when the user presses buttons
	public void actionPerformed(final ActionEvent e)
	{	
		// if the exit button is pressed
		if (e.getSource() == btnExit)
		{
			System.out.println("Exit button pressed");

			// exit the program
			System.exit(0);
		}
		if (e.getSource() == btn1)
		{
			System.out.println("Button 1 pressed");
			new PromptsTwo();

		}
		if (e.getSource() == btn2)
		{
			System.out.println("Button 2 pressed");
			new PromptsTwo();

		}
		if (e.getSource() == btn3)
		{
			System.out.println("Button 3 pressed");
			new PromptsTwo();

		}
		if (e.getSource() == btn4)
		{
			System.out.println("Button 4 pressed");
			new PromptsTwo();

		}
		if (e.getSource() == btn5)
		{
			System.out.println("Button 5 pressed");
			new PromptsTwo();

		}
		if(e.getSource() == btnBack) 
		{
			System.out.println("Back button pressed");
			new MainMenu();
		}
	}

	// self testing main method
	public static void main(String[] args) 
	{
		new PromptsOne();
	}
}
 