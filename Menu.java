package farmSimulation;

import java.util.Scanner;

public class Menu {
	Farm farm;
	Scanner s;
	
	Menu(Farm farm) {
		this.farm = farm;
		s = new Scanner(System.in);
	}
	
	public Farm getFarm() {
		return farm;
	}
	
	public void setFarm(Farm farm) {
		this.farm = farm;
	}
	
	public boolean mainMenu() {
		System.out.println("1. Buy animal");
		System.out.println("2. Plant Crop");
		System.out.println("3. Do Nothing");
		System.out.println("4. Exit");
		
		int choice = this.userInput(s, 4);
		
		if(choice == 1) {
			this.animalMenu();
			return true;
		}
		else if(choice == 2) {
			this.cropMenu();
			return true;
		}
		else if(choice == 3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void animalMenu() {
		System.out.println("Which animal would you like to buy? (animals are 3 years old when purchased)");
		System.out.println("1. Dairy Cow (50 dollars)");
		System.out.println("2. chicken (20 dollars)");
		System.out.println("3. pig (30 dollars)");
		int choice = this.userInput(s, 3);
		Animal animal;
		System.out.print("New Animal Name: ");
		String name = s.nextLine();
		int age = 3; //bought animals are 3 years old
		if(choice == 1) {
			animal = new DairyCow(name, age);
		}
		else if(choice == 2) {
			animal = new Chicken(name, age);
		}
		else {
			animal = new Pig(name, age);
		}
		farm.setTotalMoney(farm.getTotalMoney() - animal.getPuchaseCost());
		this.getFarm().addAnimal(animal);
	}
	
	public void cropMenu() {
		System.out.println("Which crop would you like to buy?");
		System.out.println("1. corn (20 dollars)");
		System.out.println("2. Wheat (10 dollars)");
		System.out.println("3. SoyBeans (15 dollars)");
		int choice = this.userInput(s, 3);
		Crop crop;
		if(choice == 1) {
			crop = new Corn();
		}
		else if(choice == 2) {
			crop = new Wheat();
		}
		else {
			crop = new SoyBeans();
		}
		farm.setTotalMoney(farm.getTotalMoney() - crop.getPlantingCost());
		this.getFarm().addCrop(crop);
	}
	
	public int userInput(Scanner s, int max) {
		int choice;
		while(!s.hasNextInt() || (choice = s.nextInt()) > max || choice < 1) {
			System.out.println("Please enter valid choice between 1 and " + max + " .");
			s.nextLine();
		}
		return choice;
	}
}
