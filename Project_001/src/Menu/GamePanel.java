package Menu;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import controller.*;
import object.SuperObject;
import PlayerJob.*;
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
	
	Thread gameThread;
	
	private KeyHandler keyH = new KeyHandler();
	public Map1 map1;
	public Assassin playerAssassin = new Assassin(this, keyH);
	GameLogic gl = new GameLogic(this.playerAssassin);
	TileManager tileM = new TileManager(this);
	public CollisionChecker colChecker = new CollisionChecker(this);
	Combat combat;
	public SuperObject obj[] = new SuperObject[20];
	public AssetSetter aSetter = new AssetSetter(this);	
	// WORLD SETTING
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;
	public final int worldWidth = tileSize * maxWorldCol;
	public final int worldHeight = tileSize * maxWorldRow;
	
	// FPS
	int FPS = 60;
	
	public GamePanel(Map1 map1) {
		combat = new Combat(gl, map1);
		this.map1 = map1;
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyH);
		this.setFocusable(true);
		
	}
	
	public void setUpGame() {
		aSetter.setObject();
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
				if(gl.checkEncounter() == 1) { 
					combat.startCombat(playerAssassin, gl.getEnemyFromList());
					gl.popEnemyFromList();
				}
				else {
//					System.out.println(playerAssassin.getWorldX() +", "+playerAssassin.getWorldY());
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
		
		// TILE
		tileM.draw(g2);
		
		
		//OBJECT
		for(int i = 0; i < obj.length; i++) {
			if(obj[i] != null) {
				obj[i].draw(g2, this);
			}
		}
		
		
		// PLAYER
		playerAssassin.draw(g2);
		g2.dispose();
		
	}
	
}
