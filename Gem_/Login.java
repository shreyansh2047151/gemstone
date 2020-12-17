package Registration;

import java.util.*;




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

		ArrayList<String> list =new ArrayList<String>();
        	list.add("shreyansh");
        	list.add("shreyansh");

		if(list.contains(null))
		{
		System.out.println("No User Avilable");
		}
		
	        Scanner register_input = new Scanner(System.in);
	        System.out.println("Provide Login Details");
	        System.out.print("UserName: ");
	        UserName = register_input.nextLine();
	        System.out.print("Password: ");
	        Password = register_input.nextLine();
	        
	        
		
		
		    while(UserName.length()!=0 || Password.length()!=0)
	        {
	        	
	            if (UserName.equals(list.get(0)) && Password.equals(list.get(1)))
	            {
	            	
	                System.out.println("------------------------------------------------");
	    	        System.out.println("Welcome ");
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
