public class Food {
	private double costPerBulk;
	private double costPerUnit;
	private double unitsPerBulk;
	private String unit;
	private String bulk;
	private String lastPurchase;
	private double unitsLeft;
	
    public Food() {
		costPerBulk = 0.0;
		costPerUnit = 0.0;
		unitsPerBulk = 1.0;
		unitsLeft = 0.0;
		unit = "";
		bulk = "";
    }
    
    public double getCost(double units){
    	return costPerUnit * units;
    }
    
    public void setBulkCost(double cost){
    	costPerBulk = cost;
    	return;
    }
}