package object;

import javax.imageio.ImageIO;

public class OBJ_enemyCerberusBOSS extends SuperObject{
	
	protected Integer hp;
	protected Integer mp;
	protected Integer attack;
	protected Integer defense;
	
	
	public OBJ_enemyCerberusBOSS(){
		
		name = "Cerberus";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/enemy/Cerberus.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		collision = true;
	}

}
