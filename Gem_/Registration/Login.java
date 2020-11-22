package Registration;

import java.util.Scanner;




class CustomException extends Exception { //userdefined exception
	  public CustomException(String message) {
	    // call the constructor of Exception class
	    super(message);
	  }
	}
public class Login {

	String UserName;
	String Password;
	
	public void registerUser() 
	{
		try {
		
	        Scanner register_input = new Scanner(System.in);
	        System.out.println("Provide Login Details");
	        System.out.print("UserName: ");
	        UserName = register_input.nextLine();
	        System.out.print("Password: ");
	        Password = register_input.nextLine();
	        
	        
		
		
		    while(UserName.length()!=0 || Password.length()!=0)
	        {
	        	
	            final String UserName_Data="shreyansh";
	            final String Password_Data="shreyansh";
	        	
	            if (UserName.equals(UserName_Data))
	            {
	            	
	                System.out.println("------------------------------------------------");
	    	        System.out.println("Welcome to "+UserName);
	            }
	            else
	            {
	    		
	            	
	    			throw new CustomException("Login Details Invalid");   
	                
	                
	            }
	            break;
	        }
		}
		catch (Exception e) {
			System.out.println("[" + e + "] Exception Occured");
			registerUser();
		}
	    
	}    
	
}
