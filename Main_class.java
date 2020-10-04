//1.Implement the concept of control statement and array
//2.Implement the concept of class,data members,member functions and access specifier.
//3.Implement the concept of function overloading and constructor overloading.
//4.Implement the static keyword- static variable, static block, static function and static class.
import java.util.*;
public class Main
{
    static String gemstoneName="Bob Gems";     //static variable
	static {
	    System.out.println("The store is owned and managed by Shreyansh Jain");     //static block
	}
	public static void main(String[] args) {
        Main.changeCompany();    //calling static method
        Main obj = new Main(1, "Peridot", 230);    //calling constructor
        Main obj1 = new Main(2, "Amathys", 500, 50);      //calling constructor
        obj.display();
        obj1.display();
		Scanner st=new Scanner(System.in);
		System.out.println("Welcome to Gemstone Shop Managemnt System " + gemstoneName);
		System.out.println("Please Select Menu");
		System.out.println("1.Add Gemstone -press 1"); 
		System.out.println("2.View Gemstone -press 2");
		System.out.println("3.Exit -press 3");
		System.out.println("Enter Your Choice:");
		int ch=st.nextInt();
		switch(ch)
		{
		    case 1:
		        add_gemstone();
		        break;
		        
		  case 2:
		      System.out.println("no gemstones available");
		      break;
		      
		  case 3:
		      Exit();
		      break;
		      
		        
		}
	}
	//Adding a Gemstone
public static void add_gemstone()
	{
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    ArrayList<String> list1=new ArrayList<String>();
	    ArrayList<Integer> list2=new ArrayList<Integer>();
	    
		int gemId;
		int items;
		int price;
		String gemName;
		float weight;
	    System.out.println("How many gemstones you have in the store?");
	    Scanner st1=new Scanner(System.in);
		items=st1.nextInt();
		for(int i=0;i<items;i++)
		{
		    System.out.println("Enter the name of the gemstone "+(i+1));
		    list1.add(st1.next());
		    System.out.println("Enter the price of the gemstone "+list1.get(i));
		    price=st1.nextInt();
		
			if(price<=0)
			{
			    System.out.println("Price cannot be zero or less. Enter the price again");
			    list.add(st1.nextInt());
			}
			else
			{
			    list.add(price);
			}
			
		  System.out.println("Enter the weight of the gemstone "+list1.get(i));
		  list2.add(st1.nextInt());
		}
		
		for (int j = 0; j < list.size(); j++) {
		            System.out.println("-------------");
		            System.out.print("Item"+"\t");
		            System.out.println(j+1);
		            System.out.print("name"+"\t");
		             System.out.println(list1.get(j));
		            System.out.print("Price"+"\t");
                    System.out.println(list.get(j));
                    System.out.print("Weight"+"\t");
                    System.out.println(list2.get(j));
                    System.out.println("-------------");
                }
		
		
		
	}
		

	//for exit	
	public static void Exit()
{
    Scanner Exit_data=new Scanner(System.in);
     System.out.println("Do you Want to Exit -- yes/no");
                    String ans_response=Exit_data.next();
                    String yes="yes";
                    String no="no";
                   if(ans_response.equals(yes))
                    {
                    System.out.println("You are Exit");
                    }
                    else if(ans_response.equals(no))
                    {
                  
                    main(null);
                  
                    }
                    else
                    {
                        System.out.println("Wrong Choice");
                        Exit();
                    }
}
  static void changeCompany(){         //static method
      gemstoneName= "Devai Gems";
  }
  int id,price,discount;
  String name;
  Main(int i, String n, int p)
  {     //constructor overloading
      id=i;
      name=n;
      price=p;
  }
  Main(int i, String n, int p, int d)
  {    //constructor overloading
      id=i;
      name=n;
      price=p;
      discount=d;
  }
  void display()
  {
      System.out.println("id: "+id);
      System.out.println("name "+name);
      System.out.println("price "+price);
      System.out.println("discount "+discount);
  }
}

