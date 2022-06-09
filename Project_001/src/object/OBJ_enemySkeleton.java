package object;

import javax.imageio.ImageIO;

public class OBJ_enemySkeleton extends SuperObject{

	public OBJ_enemySkeleton() {
		
		name = "Spider";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Dragon.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
