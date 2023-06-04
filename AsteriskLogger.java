package week05CodingAssignment;

public class AsteriskLogger implements Logger {



	@Override
	public void Log(String log) {
		//String word = "***Hello***";
		System.out.println("***"+ log + "***");
				
	}	
	//@Override
	public void Error(String error) {
		//String word2 = "******************\n\n***Error: Hello***\n\n****************** ";
		//String[] arrOfString = error.split("\n");
		
		//for (String a : arrOfString)
		//System.out.println(a);
		
		System.out.println("******************");
		
		System.out.println("***" + "Error: "+ error +"***");
		
		System.out.println("******************");
		
	
	}

    
}	 