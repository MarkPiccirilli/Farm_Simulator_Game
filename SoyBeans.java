package farmSimulation;

public class SoyBeans extends Crop {
	//constructor
		SoyBeans() {
			super();
			this.setHeightPerMonth(0.25f);
			this.setWaterCostPerMonth(4);
			this.setPlantingCost(15);
		}
			
		//ready for harvest function
		public boolean readyForHarvest() {
			if(this.getHeight() >= 2) {
				return true;
			}
			else {
				return false;
			}	
		}
			
		//harvest function returns money earned from harvest
		public int harvestProfit() {
			return 70;
		}
}
