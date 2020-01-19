import java.awt.event.*;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;


public class MainMenu extends JFrame implements ActionListener 
{
	// creating and declaring private JComponents
    private final JButton btnExit, btnPlus, btnHelp, btnSettings, btnPrompts;
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

		setContentPane (new JLabel (new ImageIcon ("Images/main-menu.jpg")));

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
        btnExit = new JButton(new ImageIcon("Images/close-button.png"));
        btnExit.setToolTipText("Exit");
		btnExit.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnExit.setBounds(10, 40, 50, 51);
        getContentPane().add(btnExit);

        btnExit.setOpaque(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setBorderPainted(false);

        btnHelp = new JButton(new ImageIcon("Images/help-button.png"));
		btnHelp.setToolTipText("Help");
		btnHelp.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnHelp.setBounds(380, 40, 50, 51);
        getContentPane().add(btnHelp);

        btnHelp.setOpaque(false);
        btnHelp.setContentAreaFilled(false);
        btnHelp.setBorderPainted(false);

        btnPrompts = new JButton(new ImageIcon("Images/3lines.png"));
		btnPrompts.setToolTipText("Answer Prompts");
		btnPrompts.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnPrompts.setBounds(210, 470, 70, 60);
        getContentPane().add(btnPrompts);

        btnPrompts.setOpaque(false);
        btnPrompts.setContentAreaFilled(false);
        btnPrompts.setBorderPainted(false);

        btnSettings = new JButton(new ImageIcon("Images/settings-button.png"));
		btnSettings.setToolTipText("Settings");
		btnSettings.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnSettings.setBounds(440, 40, 50, 51);
        getContentPane().add(btnSettings);

        btnSettings.setOpaque(false);
        btnSettings.setContentAreaFilled(false);
        btnSettings.setBorderPainted(false);

        btnPlus = new JButton(new ImageIcon("Images/plus-button.png"));
        btnPlus.setToolTipText("View Calender");
        btnPlus.setFont(new Font("Lucida Blackletter", Font.PLAIN, 20)); 
		btnPlus.setBounds(220, 650, 60, 60);
        getContentPane().add(btnPlus);

        btnPlus.setOpaque(false);
        btnPlus.setContentAreaFilled(false);
        btnPlus.setBorderPainted(false);

		// Display in the centre
		final Dimension dim = Toolkit.getDefaultToolkit ().getScreenSize ();
		this.setLocation (dim.width / 2 - this.getSize ().width / 2, dim.height / 2 - this.getSize ().height / 2);
		
        btnExit.addActionListener(this);
        btnHelp.addActionListener(this);
        btnSettings.addActionListener(this);
        btnPlus.addActionListener(this);
        btnPrompts.addActionListener(this);
		
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

        if (e.getSource() == btnPrompts)
		{
			System.out.println("Prompts button pressed");

			new PromptsOne();
        }
       
		
	}

	// self testing main method
	public static void main(final String[] args) 
	{
		new MainMenu();
	}
}