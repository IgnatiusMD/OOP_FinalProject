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

	public CreditPage() {
		setFrame();
		
		header = new JPanel();
		header.setPreferredSize(new Dimension(100, 50));
		header.setBackground(Color.decode("#CCF7FF"));
		
		
		body = new JPanel();
		body.setBackground(Color.decode("#CCF7FF"));
		
		backBtn = new JButton("BACK");
		backBtn.addActionListener(this);
		backBtn.setPreferredSize(new Dimension(600, 100));
		
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
