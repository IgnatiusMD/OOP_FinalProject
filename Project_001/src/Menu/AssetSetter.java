package Menu;

import object.OBJ_enemyGoblin;
import object.OBJ_enemyImp;
import object.OBJ_enemyOrgeBOSS;
import object.OBJ_enemySkeleton;
import object.OBJ_enemySpider;
import object.OBJ_enemyWolf;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.obj[0] = new OBJ_enemyGoblin();
		gp.obj[0].worldX = 23 * gp.tileSize;
		gp.obj[0].worldY = 7 * gp.tileSize;
		
		gp.obj[1] = new OBJ_enemyImp();
		gp.obj[1].worldX = 23 * gp.tileSize;
		gp.obj[1].worldY = 40 * gp.tileSize;
		
		gp.obj[2] = new OBJ_enemySkeleton();
		gp.obj[2].worldX = 9 * gp.tileSize;
		gp.obj[2].worldY = 33 * gp.tileSize;

		gp.obj[3] = new OBJ_enemySpider();
		gp.obj[3].worldX = 8 * gp.tileSize;
		gp.obj[3].worldY = 18 * gp.tileSize;
		
		gp.obj[4] = new OBJ_enemyOrgeBOSS();
		gp.obj[4].worldX = 10 * gp.tileSize;
		gp.obj[4].worldY = 8 * gp.tileSize;
		
		gp.obj[5] = new OBJ_enemyWolf();
		gp.obj[5].worldX = 36 * gp.tileSize;
		gp.obj[5].worldY = 20 * gp.tileSize;
		
		gp.obj[6] = new OBJ_enemyGoblin();
		gp.obj[6].worldX = 36 * gp.tileSize;
		gp.obj[6].worldY = 20 * gp.tileSize;

		gp.obj[7] = new OBJ_enemyImp();
		gp.obj[7].worldX = 38 * gp.tileSize;
		gp.obj[7].worldY = 7 * gp.tileSize;
		
		gp.obj[8] = new OBJ_enemySkeleton();
		gp.obj[8].worldX = 36 * gp.tileSize;
		gp.obj[8].worldY = 10 * gp.tileSize;

		gp.obj[9] = new OBJ_enemySpider();
		gp.obj[9].worldX = 36 * gp.tileSize;
		gp.obj[9].worldY = 39 * gp.tileSize;
		
		gp.obj[10] = new OBJ_enemyWolf();
		gp.obj[10].worldX = 36 * gp.tileSize;
		gp.obj[10].worldY = 43 * gp.tileSize;
	}
	
}
