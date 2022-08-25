package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.MenuBar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Window extends JFrame{
	
	JPanel container;
	
	JMenuBar menuBar;
	JMenu mainMenu;
	
	JMenuItem fileItem;
	JMenuItem editItem;
	JMenuItem windowItem;
	JMenuItem helpItem;
	
	JButton fileButton;
	JButton editButton;
	JButton windowButton;
	JButton helpButton;
	
	JTextArea textArea;
	
	public Window() {
		
		// main window
		
		JFrame window = new JFrame("Window");		
	
		window.setLocationRelativeTo(null);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		
		
		// components intialization
				
		mainMenu = new JMenu("menuPrincipal");
		
		menuBar = new JMenuBar();
	
		fileItem = new JMenuItem();
		editItem = new JMenuItem();
		windowItem = new JMenuItem();
		helpItem = new JMenuItem();
		
		fileButton = new JButton();
		editButton = new JButton();
		windowButton = new JButton();
		helpButton = new JButton();
		
		textArea = new JTextArea();
		
		//menuItens insertion
		
		fileItem.add(fileButton);
		editItem.add(editButton);
		windowItem.add(windowButton);
		helpItem.add(helpButton);
		
		//menuBar insertion
		
		menuBar.add(new JMenu("file"));
		menuBar.add(new JMenu("edit"));
		menuBar.add(new JMenu("window"));
		menuBar.add(new JMenu("help"));
		
		window.add(menuBar);
		window.add(textArea);
		
		window.setSize(new Dimension(640,480));
		
		window.setVisible(true);
	}
}
