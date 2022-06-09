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
		int playerBottomWorldY = player.worldY + player.solidArea.y + player.solidArea.height;
		
		int playerLeftCol = playerLeftWorldX / gp.tileSize;
		int playerRightCol = playerRightWorldX / gp.tileSize;
		int playerTopRow = playerTopWorldY / gp.tileSize;
		int playerBottomRow = playerBottomWorldY / gp.tileSize;
		
		int tileNum1, tileNum2;
		
		if(player.direction.equalsIgnoreCase("up")) {
			
			playerTopRow = (playerTopWorldY - player.speed) / gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[playerLeftCol][playerTopRow];
			tileNum2 = gp.tileM.mapTileNum[playerRightCol][playerTopRow];
			
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
				player.collisionOn = true;
			}
		}
		else if(player.direction.equalsIgnoreCase("down")){
			playerBottomRow = (playerBottomWorldY + player.speed) / gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[playerLeftCol][playerBottomRow];
			tileNum2 = gp.tileM.mapTileNum[playerRightCol][playerBottomRow];
			
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
				player.collisionOn = true;
			}
		}
		else if(player.direction.equalsIgnoreCase("left")){
			playerLeftCol = (playerLeftWorldX - player.speed) / gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[playerLeftCol][playerTopRow];
			tileNum2 = gp.tileM.mapTileNum[playerLeftCol][playerBottomRow];
			
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
				player.collisionOn = true;
			}
		}
		else if(player.direction.equalsIgnoreCase("right")){
			playerRightCol= (playerRightWorldX + player.speed) / gp.tileSize;
			tileNum1 = gp.tileM.mapTileNum[playerRightCol][playerTopRow];
			tileNum2 = gp.tileM.mapTileNum[playerRightCol][playerBottomRow];
			
			if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
				player.collisionOn = true;
			}
		}
		
	}
	
	public int checkObject(Player player, boolean assassin) {
		
		int index = 99999;
		
		for(int i = 0; i < gp.obj.length; i++) {
			if(gp.obj[i] != null) {
				// Get Player Solid area position
				player.solidArea.x = player.worldX + player.solidArea.x;
				player.solidArea.y = player.worldY + player.solidArea.y;
				
				// Get the object solid area position
				gp.obj[i].solidArea.x = gp.obj[i].worldX + gp.obj[i].solidArea.x;
				gp.obj[i].solidArea.y = gp.obj[i].worldY + gp.obj[i].solidArea.y;
				
				if(player.direction.equalsIgnoreCase("up")) {
					player.solidArea.y -= player.speed;
					
					if(player.solidArea.intersects(gp.obj[i].solidArea)) {
						
						if(gp.obj[i].collision == true) {
							player.collisionOn = true;
						}
						
						if(assassin == true) {
							index = i;
						}
						
					}
					
				}
				else if(player.direction.equalsIgnoreCase("down")) {
					player.solidArea.y += player.speed;
					
					if(player.solidArea.intersects(gp.obj[i].solidArea)) {
						
						if(gp.obj[i].collision == true) {
							player.collisionOn = true;
						}
						
						if(assassin == true) {
							index = i;
						}
						
					}
					
				}
				else if(player.direction.equalsIgnoreCase("left")) {
					player.solidArea.x -= player.speed;
					
					if(player.solidArea.intersects(gp.obj[i].solidArea)) {
						
						if(gp.obj[i].collision == true) {
							player.collisionOn = true;
						}
						
						if(assassin == true) {
							index = i;
						}
						
					}
				
				}
				else if(player.direction.equalsIgnoreCase("right")) {
					player.solidArea.x += player.speed;
				
					if(player.solidArea.intersects(gp.obj[i].solidArea)) {
						
						if(gp.obj[i].collision == true) {
							player.collisionOn = true;
						}
						
						if(assassin == true) {
							index = i;
						}
						
					}
				}
				
				player.solidArea.x = player.solidAreaDefaultX;
				player.solidArea.y = player.solidAreaDefaultY;
				gp.obj[i].solidArea.x = gp.obj[i].solidAreaDefaultX;
				gp.obj[i].solidArea.y = gp.obj[i].solidAreaDefaultY;
				
			}
		}
		
		return index;
		
	}
	
}
