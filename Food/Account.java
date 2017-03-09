public class Account{
  	private double amount;
  
  	public Account(){
   		amount = 0.0;
 	}
  
 	public double getAmount(){
    	return amount;
  	}
  
  	public void addAmount(double input){
    	amount = amount + input;
    	return;
  	}
  
  	public void subAmount(double output){
  		amount = amount - output;
    	return;
  	}
}