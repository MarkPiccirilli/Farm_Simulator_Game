package farmSimulation;

public abstract class Animal {
	//data members
	private String name;
	private int age;
	private int ageMonths; //months since last birthday
	private int foodCostPerMonth;
	private int purchaseCost;
	private int lifespan;
	
	
	//constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		this.ageMonths = 0;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAgeMonths(int ageMonths) {
		this.ageMonths = ageMonths;
	}
 	
	public void setFoodCostPerMonth(int foodCostPerDay) {
		this.foodCostPerMonth = foodCostPerDay;
	}
	
	public void setPurchaseCost(int purchaseCost) {
		this.purchaseCost = purchaseCost;
	}
	
	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getAgeMonths() {
		return ageMonths;
	}
	
	public int getFoodCostPerDay() {
		return foodCostPerMonth;
	}
	
	public int getPuchaseCost() {
		return purchaseCost;
	}
	
	public int getLifespan() {
		return lifespan;
	}
	
	//age
	public void age() {
		this.setAgeMonths(this.getAgeMonths() + 1);
		if(this.getAgeMonths() == 12) {
			setAgeMonths(0);
			setAge(getAge() + 1);
		}
	}
	
	//produce profit function for animals that produce regular goods
	public abstract int monthlyProduceProfit();
	
	//lifetime profit, for animals that are raised for meat
	public abstract int lifetimeProfit();
} 
