public class Account{
  	private double amount;
    private String name;

    public Account(String name){
      this.name = name;
      this.amount = 0.0;
      this.printAmount();
    }

    public Account(String name,double initialAmt){
      this.name = name;
      this.amount = initialAmt;
      this.printAmount();
    }

    public String getName(){
      return this.name;
    }

 	  public double getAmount(){
    	return this.amount;
  	}

    public void printAmount(){
      System.out.println(this.getName() + " contains " + this.getAmount());
      return;
    }

  	private void addAmount(double input){
    	this.amount = this.amount + input;
    	return;
  	}

  	private void subAmount(double output){
  		this.amount = this.amount - output;
    	return;
  	}

    public void transferTo(Account receiver,double amount){
      System.out.println("Transferring " + amount + " from " + this.getName() + " to " + receiver.getName());
      this.subAmount(amount);
      receiver.addAmount(amount);
      return;
    }
}
