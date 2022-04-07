package com.bridgelab.Assignment4.SnakeLadder;
/**
 * @author atik
 * Added play options
*/
public class SnakeLadder {
	private static final int noPlay = 0;
	private static final int ladder = 1;
	private static final int snake = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to SNAKES AND ladderS GAME!!");
		int startPositionA = 0;
		int dice = (int) (Math.floor(Math.random() * 6) + 1);
		System.out.println(dice);
		int checkPlay = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println(checkPlay);

		switch(checkPlay) {
			case noPlay: 
				break;
			case ladder: 
				startPositionA += dice;
				break;
			case snake: 
				startPositionA -= dice;
				break;
		}
		System.out.println(startPositionA);
	}


	}

