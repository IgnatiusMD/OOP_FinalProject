package Menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import PlayerJob.Assassin;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable{
	
	private static final long serialVersionUID = 1L;
	
	// SCREEN SETTING
	
	final int originalTileSize = 16; // 16*16 tile
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale; // 48*48 tile
	public final int maxScreenCol = 16; // 768px
	public final int maxScreenRow = 12; // 576px
	
	public final int screenWidth = tileSize * maxScreenCol;
	public final int screenHeight = tileSize * maxScreenRow;
	
	// CALL NEEDED FEATURE
	KeyHandler keyH = new KeyHandler();
	Thread gameThread;
	public Assassin playerAssassin = new Assassin(this, keyH);
	TileManager tileM = new TileManager(this);
	public CollisionChecker colChecker = new CollisionChecker(this);
	
	// WORLD SETTING
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;
	public final int worldWidth = tileSize * maxWorldCol;
	public final int worldHeight = tileSize * maxWorldRow;
	
	
	// FPS
	int FPS = 60;
	
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
	}
	
	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		
		double drawInterval = 1000000000 / FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		
		while(gameThread != null) {
			
			currentTime = System.nanoTime();
			
			delta += (currentTime - lastTime) / drawInterval;
			
			lastTime = currentTime;
			
			if(delta >= 1) {
				update();
				repaint();
				delta--;
			}
		}
		
	}
	
	public void update() {
		
		playerAssassin.update();
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		tileM.draw(g2);
		playerAssassin.draw(g2);
		
		
		g2.dispose();
		
	}
}
