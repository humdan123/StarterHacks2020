import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class MainMenu extends JFrame implements ActionListener 
{
	// creating and declaring private JComponents
    private final JButton btnExit, btnBack;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private final Container frame;

	// default constructor
	public MainMenu() 
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

		setContentPane (new JLabel (new ImageIcon ("Images/5.png")));

		frame = getContentPane();
		setUndecorated (true);
		frame.setLayout (null);
		setResizable (false);

		final Color color1 = new Color(198, 43, 43); 
		final Color color2 = new Color(237, 144, 45); 
		final Color color3 = new Color(242, 223, 84); 
		final Color color4 = new Color(192, 211, 82); 
		final Color color5 = new Color(129, 183, 49); 
		final Color testColor = new Color(198, 43, 43);
		
		
		// creating the button and setting bounds for the exit button
        btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit");
		btnExit.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnExit.setBounds(280, 650, 150, 60);
        getContentPane().add(btnExit);
        
        btnBack = new JButton("Back");
		btnBack.setToolTipText("Back to Main Menu");
		btnBack.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnBack.setBounds(80, 650, 150, 60);
		getContentPane().add(btnBack);

		// Display in the centre
		final Dimension dim = Toolkit.getDefaultToolkit ().getScreenSize ();
		this.setLocation (dim.width / 2 - this.getSize ().width / 2, dim.height / 2 - this.getSize ().height / 2);
		
        btnExit.addActionListener(this);
		btnBack.addActionListener(this);
		
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
        if (e.getSource() == btnBack) 
        {
            new Start();
        }
		
	}

	// self testing main method
	public static void main(String[] args) 
	{
		new MainMenu();
	}
}