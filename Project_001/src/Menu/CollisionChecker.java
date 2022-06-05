package Menu;

import PlayerJob.Player;

public class CollisionChecker {
	
	GamePanel gp;
	
	public CollisionChecker(GamePanel gp) {
		this.gp = gp;
	}
	
	public void checkTile(Player player) {
		
		int playerLeftWorldX = player.worldX + player.solidArea.x;
		int playerRightWorldX = player.worldX + player.solidArea.x + player.solidArea.width;
		int playerTopWorldY = player.worldY + player.solidArea.y;
		int playerBottomWorldX = player.worldY + player.solidArea.y + player.solidArea.height;
		
		int playerLeftCol = playerLeftWorldX / gp.tileSize;
		int playerRightCol = playerRightWorldX / gp.tileSize;
		int playerTopRow = playerTopWorldY / gp.tileSize;
		int playerbuttomRow = playerTopWorldY / gp.tileSize;
		
	}

}
