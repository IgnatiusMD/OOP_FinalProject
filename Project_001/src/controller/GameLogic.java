package controller;
import java.util.ArrayList;
import Menu.Map1;
import java.util.Arrays;
import java.util.Vector;

import NPC.*;
import PlayerJob.*;

public class GameLogic {
	
	static Vector <NPC> enemiesList = new Vector<>();
	static Ogre boss = new Ogre();
	
	private static Vector <Integer[]> enemyCoordinates = new Vector<>();
	
	Assassin plAssassin;
	
	public GameLogic(Assassin plAssassin) {
		this.plAssassin = plAssassin;
		addEnemies();
		addEncounterCoordinates();
	}
	
	public void addEnemies() {
		enemiesList.add(new Goblin());
		enemiesList.add(new Goblin());
		enemiesList.add(new Spider());
		enemiesList.add(new Spider());
		enemiesList.add(new Wolf());
		enemiesList.add(new Wolf());
		enemiesList.add(new Skeleton());
		enemiesList.add(new Skeleton());
	}
	
	public void addEncounterCoordinates() {
		/*coord Array Content
		[LowerBoundX, UpperBoundX, LowerBoundY, UpperBoundY]*/
		
		Integer[] coord1 = {200, 248, 200, 248, 0};
		Integer[] coord2 = {300, 348, 300, 348, 0};
		Integer[] coord3 = {550, 598, 550, 598, 0};
		Integer[] coord4 = {100, 148, 320, 368, 0};
		enemyCoordinates.add(coord1);
		enemyCoordinates.add(coord2);
		enemyCoordinates.add(coord3);
		enemyCoordinates.add(coord4);
	}
	
	public Integer getCoordinate(int tile, int boundary) {
		return enemyCoordinates.get(tile)[boundary];
	}
	
	public void removeCoordinate(int tile) {
		enemyCoordinates.remove(tile);
	}
	
	public void flagEnemyPosition(int tile) {
		enemyCoordinates.get(tile)[4] = 1;
	}
	
	public Integer getCoordinateListSize() {
		return enemyCoordinates.size();
	}
	
	public boolean checkEncounter() {
		for(int i = 0; i < getCoordinateListSize(); i++) {
			if((plAssassin.getWorldX() >= getCoordinate(i, 0) 
					&& plAssassin.getWorldX() <= getCoordinate(i, 1)) 
					&& ( plAssassin.getWorldY() >= getCoordinate(i, 2) 
					&& plAssassin.getWorldY() <= getCoordinate(i, 3))
					&& getCoordinate(i, 4) == 0) {
				plAssassin.setSpeed(0);
				flagEnemyPosition(i);
				return true;
			}
		}
		return false;
	}
	
	public void processCommand(String[] commands) {
		
	}
}