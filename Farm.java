package farmSimulation;

import java.util.List;
import java.util.ArrayList;

public class Farm {
	//data members
	private List<Animal> animals;
	private List<Crop> crops;
	private int totalMoney;
	
	//constructor
	Farm() {
		this.animals = new ArrayList<Animal>();
		this.crops = new ArrayList<Crop>();
		this.totalMoney = 100;
	}
	
	//setters
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	//getters
	public List<Animal> getAnimals() {
		return animals;
	}
	
	public List<Crop> getCrops() {
		return crops;
	}
	
	public int getTotalMoney() {
		return totalMoney;
	}
	
	//add Animal
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	//add Crop
	public void addCrop(Crop crop) {
		crops.add(crop);
	}
}
