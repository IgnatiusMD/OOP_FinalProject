package object;

import javax.imageio.ImageIO;

public class OBJ_enemySpider extends SuperObject{

	public OBJ_enemySpider() {
		name = "Spider";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Spider.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
