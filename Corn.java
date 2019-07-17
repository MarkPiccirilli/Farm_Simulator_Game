package farmSimulation;

public class Corn extends Crop {
	
	//constructor
	Corn() {
		super();
		this.setHeightPerMonth(0.5f);
		this.setWaterCostPerMonth(5);
		this.setPlantingCost(20);
	}
		
	//ready for harvest function
	public boolean readyForHarvest() {
		if(this.getHeight() >= 8) {
			return true;
		}
		else {
			return false;
		}	
	}
		
	//harvest function returns money earned from harvest
	public int harvestProfit() {
		return 90;
	}
}
