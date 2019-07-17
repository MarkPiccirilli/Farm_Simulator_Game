package farmSimulation;

public class DairyCow extends Animal {
	
	//constructor
	public DairyCow(String name, int age) {
		super(name, age);
		this.setLifespan(15);
		this.setFoodCostPerMonth(10);
		this.setPurchaseCost(50);
	}
	
	//produce: Cow produces milk
	public int monthlyProduceProfit() {
		if(this.getAge() > 3) {
			return 30;
		}
		else {
			return 0;
		}
	}
	
	public int lifetimeProfit() {
		return 0;
	}
}