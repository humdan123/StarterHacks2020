import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class SettingsMenu extends JFrame implements ActionListener 
{
	// creating and declaring private JComponents
    private final JButton btnBack;
    private final Container frame;

	// default constructor
	public SettingsMenu() 
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

		setContentPane (new JLabel (new ImageIcon ("Images/settings-menu.jpg")));

		frame = getContentPane();
		setUndecorated (true);
		frame.setLayout (null);
		setResizable (false);
    
        btnBack = new JButton(new ImageIcon("Images/back-button.png"));
		btnBack.setToolTipText("Back to Main Menu");
		btnBack.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnBack.setBounds(200, 650, 80, 80);
		getContentPane().add(btnBack);

		btnBack.setOpaque(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setBorderPainted(false);

		// Display in the centre
		final Dimension dim = Toolkit.getDefaultToolkit ().getScreenSize ();
		this.setLocation (dim.width / 2 - this.getSize ().width / 2, dim.height / 2 - this.getSize ().height / 2);
		
       
		btnBack.addActionListener(this);
		
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
	}

	// self testing main method
	public static void main(String[] args) 
	{
		new SettingsMenu();
	}
}