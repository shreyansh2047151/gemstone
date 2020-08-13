//1.Implement the concept of control statement and array
//2.Implement the concept of class,data members,member functions and access specifier.
import java.util.*;
//Class Main
public class Main_class {
	static String gemstoneName="By Devai Gems";
	//access specifier is public
	//member function
public static void main(String args[]){
		//Data Members
		//Initialising Array
		int gemId[];
		int items;
		int price[];
		String gemName[];
		float weight[];
		int c=1;
		Scanner st=new Scanner(System.in);
		System.out.println("Welcome to Gemstone Shop Managemnt System " + gemstoneName);
		System.out.println("How many gemstones you have in the store?");
		items=st.nextInt();
		gemId=new int[items];
		gemName= new String[items];
		price=new int[items];
		weight=new float[items];
		//Using for-loop and if statement as control statement
		for(int i=0;i<items;i++){                                                         
			gemId[i]=c++;
			System.out.println("Enter the name of the gemstone "+(i+1));
			gemName[i]=st.next();
			System.out.println("Enter the price of the gemstone "+gemName[i]);
			price[i]=st.nextInt();
			if(price[i]<=0){
				System.out.println("Price cannot be zero or less. Enter the price of the "+gemName[i]+" again");
				price[i]=st.nextInt();
				System.out.println("Price cannot be zero or less. Enter the weight of the "+gemName[i]+" again");
				weight[i]=st.nextInt();
			}
			System.out.println("Enter the weight of the gemstone "+gemName[i]);
			weight[i]=st.nextFloat();
		}
		System.out.println("Gemstone Id "+"Gemstone Name "+ " Price of the Gemstone  "+ "Weight in carats  ");
		for(int i=0;i<items;i++){
			System.out.println(gemId[i]+"    	      "+gemName[i]+"   	       "+price[i]+"        	     "+weight[i]);
		}
	}
}