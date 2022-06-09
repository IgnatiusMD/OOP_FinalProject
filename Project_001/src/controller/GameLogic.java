package controller;

import java.util.Vector;


import NPC.*;
import PlayerJob.*;

public class GameLogic {
	
	public static Vector <NPC> enemiesList = new Vector<>();
	public static Ogre boss = new Ogre();
	
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
		[LowerBoundX, UpperBoundX, LowerBoundY, UpperBoundY, isVisited]*/
		
		Integer[] coord1 = {1092, 1140, 1308, 1356, 0};
		Integer[] coord2 = {996, 1044, 1008, 1056, 0};
		Integer[] coord3 = {550, 598, 1528, 1576, 0};
		Integer[] coord4 = {1100, 1148, 420, 368, 0};
		enemyCoordinates.add(coord1);
		enemyCoordinates.add(coord2);
		enemyCoordinates.add(coord3);
		enemyCoordinates.add(coord4);
	}
	
	public Integer getEnemyPosAndIndex(int tile, int boundary) {
		return enemyCoordinates.get(tile)[boundary];
	}
	
	public void removeEnemyPosAndType(int tile) {
		enemyCoordinates.remove(tile);
	}
	
	public void flagEnemyPosition(int tile) {
		enemyCoordinates.get(tile)[4] = 1;
	}
	
	public Integer getCoordinateListSize() {
		return enemyCoordinates.size();
	}
	
	public NPC getEnemyFromList(int index) {
		return enemiesList.get(index);
	}
	
	public boolean checkEncounter() {
		for(int i = 0; i < getCoordinateListSize(); i++) {
			if((plAssassin.getWorldX() >= getEnemyPosAndIndex(i, 0) 
					&& plAssassin.getWorldX() <= getEnemyPosAndIndex(i, 1)) 
					&& ( plAssassin.getWorldY() >= getEnemyPosAndIndex(i, 2) 
					&& plAssassin.getWorldY() <= getEnemyPosAndIndex(i, 3))
					&& getEnemyPosAndIndex(i, 4) == 0) {
				flagEnemyPosition(i);
				
				return true;
			}
		}
		return false;
	}
	
	public NPC getEnemyFromList() {
		return enemiesList.get(0);
	}
	
	public void popEnemyFromList() {
		enemiesList.remove(0);
	}
	
	public void processCommand(String[] commands) {
		
	}
}