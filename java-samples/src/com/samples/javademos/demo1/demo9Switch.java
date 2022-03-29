package com.samples.javademos.demo1;

public class demo9Switch {

	public static void main(String[] args) {
//		int switchVal = 6;
//		
//		switch(switchVal) {
//			case 1:
//				System.out.println("value 1");
//				break;
//			case 2:
//				System.out.println("value 2");
//				break;
//			case 3: case 4: case 5:
//				System.out.println("value was either a 3 or 4 or 5");
//				break;
//			default:
//					System.out.println("some other value");
//		}
//		
		String month = "JAnUary";
		
		switch(month.toLowerCase()) {
			case "january":
				System.out.println("value 1");
				break;
			case "february":
				System.out.println("value 2");
				break;
			case "march":
				System.out.println("value was either a 3 or 4 or 5");
				break;
			default:
					System.out.println("some other value");
		}
	}
	
	
}
