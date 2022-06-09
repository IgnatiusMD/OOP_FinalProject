package Menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CreditPage extends JFrame implements ActionListener {
	
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
	
	// Panel
	JPanel header, body;
	
	// Button
	JButton backBtn;
	
	// Content
	JLabel vl, greg, md, className, classCode;

	public CreditPage() {
		setFrame();
		
		header = new JPanel(new GridLayout(5, 1));
		header.setPreferredSize(new Dimension(100, 200));
		header.setBackground(Color.decode("#9CE15B"));
		
		body = new JPanel();
		body.setBackground(Color.decode("#9CE15B"));
		
		vl = new JLabel("Vincentius Loanka Sinaga - 2440015846", JLabel.CENTER);
		vl.setFont(new Font("Monaco", Font.BOLD, 20));
		
		md = new JLabel("Ignatius Michael Dinata - 2440010750", JLabel.CENTER);
		md.setFont(new Font("Monaco", Font.BOLD, 20));
		
		greg = new JLabel("Gregory Hugo - 2401960095", JLabel.CENTER);
		greg.setFont(new Font("Monaco", Font.BOLD, 20));
		
		className = new JLabel("Object Oriented Programming Lecture", JLabel.CENTER);
		className.setFont(new Font("Monaco", Font.BOLD, 20));
		
		classCode = new JLabel("COMP6708001", JLabel.CENTER);
		classCode.setFont(new Font("Monaco", Font.BOLD, 20));
		
		backBtn = new JButton("BACK");
		backBtn.addActionListener(this);
		backBtn.setPreferredSize(new Dimension(600, 100));
		backBtn.setBackground(Color.decode("#000000"));
		backBtn.setForeground(Color.decode("#FFFFFF"));
		
		header.add(className);
		header.add(classCode);
		header.add(greg);
		header.add(vl);
		header.add(md);
		
		body.add(backBtn);
		
		this.add(header, BorderLayout.NORTH);
		this.add(body, BorderLayout.CENTER);
		
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
		if (e.getSource().equals(backBtn)) {
			new MainMenu();
			setVisible(false);
		}
	}

}
