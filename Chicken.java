package farmSimulation;

public class Chicken extends Animal {
	//constructor
		public Chicken(String name, int age) {
			super(name, age);
			this.setLifespan(7);
			this.setFoodCostPerMonth(8);
			this.setPurchaseCost(20);
		}
		
		//produce: Cow produces milk
		public int monthlyProduceProfit() {
			if(this.getAge() > 2) {
				return 20;
			}
			else {
				return 0;
			}
		}
		
		public int lifetimeProfit() {
			return 0;
		}
}
