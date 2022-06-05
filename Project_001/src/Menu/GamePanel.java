package Menu;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import controller.*;
import PlayerJob.*;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable{
	
	private static final long serialVersionUID = 1L;
	
	final int originalTileSize = 16; // 16*16 tile
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale; // 48*48 tile
	final int maxScreenCol = 16; // 768px
	final int maxScreenRow = 12; // 576px
	
	final int screenWidth = tileSize * maxScreenCol;
	final int screenHeight = tileSize * maxScreenRow;
	
	Thread gameThread;

	
	private KeyHandler keyH = new KeyHandler();
	public Map1 map1;

	Assassin playerAssassin = new Assassin(this, keyH);
	GameLogic gl = new GameLogic(this.playerAssassin);

	TileManager tileM = new TileManager(this);
	public CollisionChecker colChecker = new CollisionChecker(this);
	
	// FPS
	int FPS = 60;
	
	public GamePanel(Map1 map1) {
		this.map1 = map1;
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
				if(gl.checkEncounter()) { 
					map1.cardLayout.show(map1.panel, "combat");
				}
				else {
					this.setFocusable(true);
					if(playerAssassin.getSpeed()==0) {
						playerAssassin.setSpeed(0);
					}
				}
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
