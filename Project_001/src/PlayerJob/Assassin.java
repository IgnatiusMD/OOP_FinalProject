package PlayerJob;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import Menu.GamePanel;
import Menu.KeyHandler;

public class Assassin extends Player{

	private Double critChance = 0.3;
	private Integer x;
	private Integer y;
	private Integer speed;
	
	private BufferedImage upBuffImage, downBuffImage, leftBuffImage, rightBuffImage, image;
	private String direction;
	
	GamePanel gp;
	KeyHandler keyH;
	
	public Assassin(GamePanel gp, KeyHandler keyH) {
		super();
		this.gp = gp;
		this.keyH = keyH;
		
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
		
		this.x = 100;
		this.y = 100;
		this.speed = 4;
		
		this.direction = "up";
	}
	
	public Double getCritChance() {
		return critChance;
	}

	public void setCritChance(Double critChance) {
		this.critChance = critChance;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
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
			return (attack * 2);
		}
		else {
			return attack;
		}
	}
	
	@Override
	public Integer defend() {
		return (defense+150);
	}
	
	@Override
	public void levelup() {
		if(exp >= 200) {
			agility += 30;
			strength += 15;
			intellect += 5;
			
			exp -= 200;
		}
	}
	
	private boolean criticalHit() {
		return (Math.random() >= (1 - critChance)) ? true : false;
	}
	
	public void update() {
		if(keyH.upPressed == true) {
			this.direction = "up";
			this.y -= this.speed;
		}
		else if(keyH.downPressed == true) {
			this.direction = "down";
			this.y += this.speed;
		}
		else if(keyH.leftPressed == true) {
			this.direction = "left";
			this.x -= this.speed;
		}
		else if(keyH.rightPressed == true) {
			this.direction = "right";
			this.x += this.speed;
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
		
		g2.drawImage(this.image, this.x, this.y, gp.tileSize, gp.tileSize, null);
	}
	
	public void getPlayerImage() {
		try {
			
			upBuffImage = ImageIO.read(getClass().getResourceAsStream("/AssassinChar/AssassinUp.png"));
			downBuffImage = ImageIO.read(getClass().getResourceAsStream("/AssassinChar/AssassinDown.png"));
			leftBuffImage = ImageIO.read(getClass().getResourceAsStream("/AssassinChar/AssassinLeft.png"));
			rightBuffImage = ImageIO.read(getClass().getResourceAsStream("/AssassinChar/AssassinRight.png"));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
