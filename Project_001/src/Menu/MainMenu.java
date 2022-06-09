package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import PlayerJob.Assassin;
import tile.TileManager;

public class MainMenu extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	final int originalTileSize = 16; // 16*16 tile
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale; // 48*48 tile
	final int maxScreenCol = 16; // 768px
	final int maxScreenRow = 12; // 576px
	
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;
	
	// FPS
	int FPS = 60;
	
	// Panels
	JPanel header, body, buttons;
	
	// Header
	JLabel titleLabel;
	
	// Buttons
	JButton playGame, creditPage, exitGame, temp;
	
	public MainMenu() {
		setFrame();
		
		// Header
		header = new JPanel();
		header.setPreferredSize(new Dimension(100, 50));
		header.setBackground(Color.decode("#CCF7FF"));
		
		titleLabel = new JLabel("FINAL TANTASY");
		titleLabel.setForeground(Color.decode("#104A00"));
		
		header.add(titleLabel);
		
		// TINGGAL MASUKIN GAMBAR AYOLAHHHH :"
		
		// Body
		body = new JPanel();
		buttons = new JPanel(new BorderLayout());
		body.setBackground(Color.decode("#CCF7FF"));
		
		playGame = new JButton("PLAY");
		playGame.addActionListener(this);
		playGame.setPreferredSize(new Dimension(600, 100));
		
		creditPage = new JButton("CREDITS");
		creditPage.addActionListener(this);
		creditPage.setPreferredSize(new Dimension(600, 100));
		
		exitGame = new JButton("EXIT");
		exitGame.addActionListener(this);
		exitGame.setPreferredSize(new Dimension(600, 100));
		
		buttons.add(playGame, BorderLayout.NORTH);
		buttons.add(creditPage, BorderLayout.CENTER);
		buttons.add(exitGame, BorderLayout.SOUTH);
		
		body.add(buttons);
		
		this.add(header, BorderLayout.NORTH);
		this.add(body, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new MainMenu();
	}
	
	public void setFrame() {
		this.setVisible(true);
		this.setSize(new Dimension(screenWidth, screenHeight));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Final Tantasy");
		this.setLocationRelativeTo(null);
		this.setFocusable(true);
		this.setBackground(Color.decode("#CCF7FF"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(playGame)) {
//			play Game
			setVisible(false);
		} else if (e.getSource().equals(creditPage)) {
			new CreditPage();
			setVisible(false);
		} else if (e.getSource().equals(exitGame)) {
			setVisible(false);
		}
		
	}

}
