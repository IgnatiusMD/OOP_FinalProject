package PlayerJob;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Menu.GamePanel;
import Menu.KeyHandler;
import Menu.Map1;

public class Assassin extends Player{

	private Double critChance = 0.3;
	
	private BufferedImage upBuffImage, downBuffImage, leftBuffImage, rightBuffImage, image;
	
	GamePanel gp;
	KeyHandler keyH;
	
	public final int screenX;
	public final int screenY;
	
	public Assassin(GamePanel gp, KeyHandler keyH) {
		super();
		this.keyH = keyH;

		this.gp = gp;
		this.keyH = keyH;
		
		screenX = gp.screenWidth/2 - (gp.tileSize/2);
		screenY = gp.screenHeight/2 - (gp.tileSize/2);
		
		solidArea = new Rectangle();
		solidArea.x = 8;
		solidArea.y = 16;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 32;
		solidArea.height = 32;
		
		setDefaultValues();
		getPlayerImage();
	}
	
	
	private void setDefaultValues() {
		strength = 30;
		agility = 70;
		intellect = 20;
		
		hp = 1200; 
		mp = intellect * 2;
		attack = agility * 3;
		defense = 90 + strength;
		
		worldX = gp.tileSize * 23;
		worldY = gp.tileSize * 21;
		this.speed = 4;
		
		this.direction = "up";
	}
	
	public Double getCritChance() {
		return critChance;
	}

	public void setCritChance(Double critChance) {
		this.critChance = critChance;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public GamePanel getGp() {
		return gp;
	}

	public void setGp(GamePanel gp) {
		this.gp = gp;
	}

	public KeyHandler getKeyH() {
		return keyH;
	}

	public void setKeyH(KeyHandler keyH) {
		this.keyH = keyH;
	}

	@Override
	public Integer attack() {
		if(criticalHit()) {
			System.out.println("CRIT!!");
			return (attack * 2);
		}
		else {
			return attack;
		}
	}
	
	@Override
	public Integer defend() {
		return 150;
	}
	
	@Override 
	public void updateStats(){
		mp = intellect * 2;
		attack = agility * 3;
		defense = 90 + strength;
	}
	
	@Override
	public void levelup() {
		if(exp >= 200) {
			System.out.println("\nYou've leveled up!!!\n");
			hp += 200;
			agility += 20;
			strength += 10;
			intellect += 5;
			
			updateStats();
			
			exp -= 200;
		}
	}
	
	private boolean criticalHit() {
		return (Math.random() >= (1 - critChance)) ? true : false;
	}
	
	public void update() {
		// CHECK TILE COLLISION
		collisionOn = false;
		gp.colChecker.checkTile(this);
		
		// CHECK OBJECT COLLISION
		int objIndex = gp.colChecker.checkObject(this,  true);
		pickUpObject(objIndex);
		
		// EVENT COLLISION HANDLE
		if(keyH.upPressed == true) {
			this.direction = "up";
			
			if(collisionOn == false) {
				worldY -= this.speed;
			}
			
		}
		else if(keyH.downPressed == true) {
			this.direction = "down";
			
			if(collisionOn == false) {
				worldY += this.speed;
			}
			
		}
		else if(keyH.leftPressed == true) {
			this.direction = "left";
			
			if(collisionOn == false) {
				worldX -= this.speed;
			}
		}
		else if(keyH.rightPressed == true) {
			this.direction = "right";
			
			if(collisionOn == false) {
				worldX += this.speed;
			}
		}
		
		levelup();
	}
	
	public void pickUpObject(int i) {
		
		if(i != 99999) {
			//EVENT HANDLING IF THE PLAYER COLLISION WITH OBJECT
			gp.obj[i] = null;
		}
		
	}
	
	
	public void draw(Graphics2D g2) {
		
		image = null;
		
		if(this.direction.equalsIgnoreCase("up")) {
			image = upBuffImage;
		}
		else if(this.direction.equalsIgnoreCase("down")) {
			image = downBuffImage;
		}
		else if(this.direction.equalsIgnoreCase("left")) {
			image = leftBuffImage;
		}
		else if(this.direction.equalsIgnoreCase("right")) {
			image = rightBuffImage;
		}
		
		g2.drawImage(this.image, screenX, screenY, gp.tileSize, gp.tileSize, null);
	}
	
	public void getPlayerImage() {
		try {
			
			upBuffImage = ImageIO.read(getClass().getResourceAsStream("/AssassinChar/AssassinUp.png"));
			downBuffImage = ImageIO.read(getClass().getResourceAsStream("/AssassinChar/AssassinDown.png"));
			leftBuffImage = ImageIO.read(getClass().getResourceAsStream("/AssassinChar/AssassinLeft.png"));
			rightBuffImage = ImageIO.read(getClass().getResourceAsStream("/AssassinChar/AssassinRight.png"));
			 
		} catch (Exception e) {
			System.out.println("Image Charakter Assets not found");
		}
	}

}
