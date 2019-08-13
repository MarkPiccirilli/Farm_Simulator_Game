package farmSimulation;

import java.util.Iterator;

public class FarmSimulation {

	public static void main(String[] args) {
		
		//create farm
		Farm farm = new Farm();
		
		//create menu
		Menu menu = new Menu(farm);
		
		while(menu.mainMenu()) {
			
			//loop through animals
			Iterator<Animal> animalItr = farm.getAnimals().iterator();
			while(animalItr.hasNext()) {
				Animal animal = animalItr.next();
				//set animal effect on total money
				farm.setTotalMoney(farm.getTotalMoney() - animal.getFoodCostPerDay() + animal.monthlyProduceProfit());
				//animal gets one month older
				animal.age();
				//if animal age reaches lifespan, the animal dies
				if(animal.getAge() == animal.getLifespan()) {
					farm.setTotalMoney(farm.getTotalMoney() + animal.lifetimeProfit());
					animalItr.remove();
				}
			}
			
			//loop through crops
			Iterator<Crop> cropItr = farm.getCrops().iterator();
			while(cropItr.hasNext()) {
				Crop crop = cropItr.next();
				if(crop.readyForHarvest()) {
					farm.setTotalMoney(farm.getTotalMoney() + crop.harvestProfit());
					cropItr.remove();  //crop is removed from list after harvest
				}
				else {
					farm.setTotalMoney(farm.getTotalMoney() - crop.getWaterCostPerMonth());
				}
				crop.grow();
			}
			
			//if total money is less than zero then the game is over
			if(farm.getTotalMoney() < 0) {
				break;
			}
			//print total money
			System.out.println("Total Money: " + farm.getTotalMoney());
			System.out.println(farm.getAnimals());
			System.out.println(farm.getCrops());
		} //end while loop
		//game over print out
		System.out.println("game over");
		System.out.println("Total Money: " + farm.getTotalMoney());
	}
}
