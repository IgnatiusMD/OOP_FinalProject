package object;

import javax.imageio.ImageIO;

public class OBJ_enemyViper extends SuperObject{

	public OBJ_enemyViper() {
		name = "Key";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Viper.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
