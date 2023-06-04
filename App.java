package week05CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("Cat");
		logger.Error("Meow");
		
		Logger logger1 = new SpacedLogger();
		
		logger1.Log("Roger");
		logger1.Error("double");
		
		
	}
	
	
		
}	
	

//public String asterisks(String error) {
	  //String asteriskAdd = " ";
	  
	  //int asterisk = 13 + error.length(); //is there a way to loop through so this prints 13 character spaces?
	  //for(int i = 1; i <= asterisk; i++) {
	  //asteriskAdd += "*";
	  

	  //return asteriskAdd;	