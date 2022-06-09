package object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import Menu.GamePanel;

public class SuperObject {

	public BufferedImage image;
	public String name;
	public boolean collision = false;
	public int worldX, worldY;
	public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
	public int solidAreaDefaultX = 0;
	public int solidAreaDefaultY = 0;
	
	public void draw(Graphics2D g2, GamePanel gp) {
		
		int screenX = worldX - gp.playerAssassin.worldX + gp.playerAssassin.screenX;
		int screenY = worldY - gp.playerAssassin.worldY + gp.playerAssassin.screenY;
		
		if(worldX + gp.tileSize > gp.playerAssassin.worldX - gp.playerAssassin.screenX && 
		   worldX - gp.tileSize < gp.playerAssassin.worldX + gp.playerAssassin.screenX && 
		   worldY + gp.tileSize > gp.playerAssassin.worldY - gp.playerAssassin.screenY && 
		   worldY - gp.tileSize < gp.playerAssassin.worldY + gp.playerAssassin.screenY
				) {
			g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
		}
	
	}
	
}
