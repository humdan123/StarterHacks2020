import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Start extends JFrame implements ActionListener 
{
	// creating and declaring private JComponents
	private JButton btnStart, btnExit;
	private Container frame;


	// default constructor
	public Start() 
	{
		// try-catch with specific code to ensure the GUI is not distorted on a Windows computer
		try 
		{ // (https://docs.oracle.com/javase/7/docs/api/javax/swing/UIManager.html)
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (InstantiationException e) 
		{
			e.printStackTrace();
		} 
		catch (IllegalAccessException e) 
		{
			e.printStackTrace();
		}
		catch (UnsupportedLookAndFeelException e) 
		{
			e.printStackTrace();
		}
		
		// setting up the layout and size of the window
		setSize (500, 786);
		setLocation (720, 200);
		setDefaultCloseOperation (EXIT_ON_CLOSE); 

		setContentPane (new JLabel (new ImageIcon ("Images/start-screen.jpg")));

		frame = getContentPane();
		setUndecorated (true);
		frame.setLayout (null);
		setResizable (false);

		Color testColor = new Color(198, 43, 43); 
		
		// creating the button and setting bounds for the play button
		btnStart = new JButton("Start");
		btnStart.setToolTipText("Click to Start Application");
		btnStart.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20));
		btnStart.setBounds(30, 600, 100, 100);
		getContentPane().add(btnStart);

	

		// creating the button and setting bounds for the exit button
		btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit");
		btnExit.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnExit.setBounds(300, 600, 100, 100);
		getContentPane().add(btnExit);

		// Display in the centre
		Dimension dim = Toolkit.getDefaultToolkit ().getScreenSize ();
		this.setLocation (dim.width / 2 - this.getSize ().width / 2, dim.height / 2 - this.getSize ().height / 2);

		
		btnExit.addActionListener(this);
		btnStart.addActionListener(this);
		
		// setting the frame visible to the user
		setVisible(true);
		setResizable(false);
	}
	
	// method to connect and interact when the user presses buttons
	public void actionPerformed(ActionEvent e)
	{
		// if the play button is pressed
		if (e.getSource() == btnStart)
		{
			System.out.println("Play button pressed");

			// close current window
			dispose();
			
			// open the Game Options window
			new MainMenu();
		}
		
	
		// if the exit button is pressed
		if (e.getSource() == btnExit)
		{
			System.out.println("Exit button pressed");

			// exit the program
			System.exit(0);
		}


	}

	// self testing main method
	public static void main(String[] args) 
	{
		new Start();
	}
}
 
