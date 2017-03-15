import java.io.*;

public class Test{
	public static void main(String[] args){
		String accountFile = "accounts.csv";
		String line = "";
		BufferedReader br = null;
		String[][] accnts = new String[5][2];
		int numAccnts = 0;
		try{
			br = new BufferedReader(new FileReader(accountFile));
			while((line = br.readLine()) != null){
				numAccnts ++;
				accnts[numAccnts - 1] = line.split(",");
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(br != null){
				try{
					br.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}

    	Account Savings = new Account(accnts[0][0],Double.parseDouble(accnts[0][1]));
      Account Food = new Account(accnts[1][0],Double.parseDouble(accnts[1][1]));

			Food.transferTo(Savings,19.0);

			Food.printAmount();
			Savings.printAmount();
    }
}
