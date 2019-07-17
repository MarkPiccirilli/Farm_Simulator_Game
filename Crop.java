package farmSimulation;

public abstract class Crop {
	//data members
	private float height;
	private float heightPerMonth;
	private int waterCostPerMonth;
	private int plantingCost;
	
	//constructor
	Crop() {
		this.height = 0;
	}
	
	//setters
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setHeightPerMonth(float heightPerDay) {
		this.heightPerMonth = heightPerDay;
	}
	
	public void setWaterCostPerMonth(int waterCostPerDay) {
		this.waterCostPerMonth = waterCostPerDay;
	}
	
	public void setPlantingCost(int plantingCost) {
		this.plantingCost = plantingCost;
	}
	
	//getters
	public float getHeight() {
		return height;
	}
	
	public float getHeightPerMonth() {
		return heightPerMonth;
	}
	
	public int getWaterCostPerMonth() {
		return waterCostPerMonth;
	}
	
	public int getPlantingCost() {
		return plantingCost;
	}
	
	//grow function
	public void grow() {
		this.setHeight(this.getHeight() + this.getHeightPerMonth());
	}
	
	//ready for harvest function
	public abstract boolean readyForHarvest();
	
	//harvest profit function
	public abstract int harvestProfit();
}
