package farmSimulation;

public class Pig extends Animal {
	//constructor
	public Pig(String name, int age) {
		super(name, age);
		this.setLifespan(5);
		this.setFoodCostPerMonth(6);
		this.setPurchaseCost(30);
	}
	
	//produce: Cow produces milk
	public int monthlyProduceProfit() {
		return 0;
	}
	
	public int lifetimeProfit() {
		return 250;
	}
}
