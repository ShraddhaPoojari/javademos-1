package com.samples.javademos.oop5;

public class testPolymorphism {

	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			Movie myMovie = randomMovie();			
			System.out.println("Movie # " + i + " : " + myMovie.getName() + "\n" + "Plot: " + myMovie.plot());
		}
	}

	private static Movie randomMovie() {
		int randomNumber = (int)(Math.random() * 5 + 1);
		System.out.println("Random Number generated was: " + randomNumber);
		switch (randomNumber) {
			case 1:
				return new Jaws();
			case 2:
				return new IndependenceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarWars();
			case 5:
				return new SomeMovie();
		}
		return null;
	}
	
}
