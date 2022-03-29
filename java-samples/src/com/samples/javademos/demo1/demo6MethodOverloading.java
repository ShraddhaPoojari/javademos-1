package com.samples.javademos.demo1;

public class demo6MethodOverloading {

	public static void main(String[] args) {
		calculateScore("John", 500);
		calculateScore(650);
		calculateScore("Ram", 675.24);
		calculateScore();
	}
	
	public static double calculateScore(String playerName, double score) {
		System.out.println("Player " + playerName + " scored " + score + " points ");
		return score*1000;
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points ");
		return score*1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed Player " + " scored " + score + " points ");
		return score*1000;
	}
	public static int calculateScore() {
		System.out.println("Unnamed Player " + " scored " + "No points ");
		return -1;
	}
}
