package farmSimulation;

public class Wheat extends Crop{
	//constructor
		Wheat() {
			super();
			this.setHeightPerMonth(0.75f);
			this.setWaterCostPerMonth(7);
			this.setPlantingCost(10);
		}
			
		//ready for harvest function
		public boolean readyForHarvest() {
			if(this.getHeight() >= 4) {
				return true;
			}
			else {
				return false;
			}	
		}
			
		//harvest function returns money earned from harvest
		public int harvestProfit() {
			return 60;
		}
}
