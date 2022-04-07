package com.bridgelab.Assignment4.SnakeLadder;
/**
 * @author atik
 *  position of player and dice role
*/
public class SnakeLadder {
	
	private static final int noPlay = 0;
	private static final int ladder = 1;
	private static final int snake = 2;
	private static final int maxPosition = 100;
	private static final int minPosition = 0;
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to SNAKES AND LADDERS GAME!!");
		
		int positionA = 0;
		int diceCount = 0;
		
		while(positionA < maxPosition) {
			
			int dice = (int) (Math.floor(Math.random() * 6) + 1);
			diceCount ++;
			int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
			
			switch(checkPlay) {
				case noPlay: 
					break;
					
				case ladder: 
					positionA += dice;
					if(positionA > maxPosition) {
						positionA = positionA-dice;
					}
					break;
				
				case snake: 
					positionA -= dice;
					if(positionA < minPosition ) {
						positionA = 0;
					}
					break;
			}
			System.out.println("Position after Die Roll "+diceCount+" : "+positionA);
		}	
		System.out.println("Total Dice Rolls : "+diceCount);
	}
	}



