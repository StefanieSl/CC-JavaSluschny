package Thema1.grundlagen;

import utils.IO;

public class Eingabe2 {

	public static void main(String[] args) {

		String name = IO.promptAndReadString("What is your name?");
		
		String age = IO.promptAndReadString("What is your age?");

		System.out.println("Your name is " + name + " and your age is " + age);
	}

}
