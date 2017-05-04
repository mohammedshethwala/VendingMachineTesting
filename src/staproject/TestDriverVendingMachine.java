/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staproject;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Mohammed
 */
public class TestDriverVendingMachine {
    
    public static void main(String[] args) {
        
        int userOption=0;
        int return_value=-1;
        
        //Create an object of VendingMachine class. It's constructor will be invoked
        VendingMachine obj=new VendingMachine();
        //Get the key pressed from the keyboard
        Scanner in = new Scanner(System.in);
        
        System.out.println("Driver for the Vending Machine");
        
        //If the user presses 11, then driver will close, otherwise it will iterate in this loop
        while(userOption!=11){
		 
                 System.out.println("------------------------------------");
		 System.out.println("Please choose from below options:");
		 System.out.println("1. coin()");
		 System.out.println("2. small_cup()");
		 System.out.println("3. large_cup()");
		 System.out.println("4. sugar()");
		 System.out.println("5. tea()");
		 System.out.println("6. insert_large_cups(int n)");
		 System.out.println("7. insert_small_cups(int n)");
		 System.out.println("8. set_price(int p)");
		 System.out.println("9. cancel()");
		 System.out.println("10. dispose()");
                 
                 System.out.println("------------------------------------");
		 System.out.println("11. Quit");
                 
                 System.out.println("------------------------------------");
                 
		 System.out.println("Testing Oriented Methods:");
		 System.out.println("12. show_state()");
		 System.out.println("13. show_all_values()");
		 System.out.println("14. show_x()");
                 System.out.println("15. show_price()");
                 System.out.println("16. show_k()");
		 System.out.println("17. show_k1()");
		 System.out.println("18. show_t()");
		 System.out.println("19. show_s()");
           
                 System.out.println("------------------------------------");
                 System.out.println("");
		 System.out.println("Enter number: ");
		 
		 userOption=in.nextInt();
		 
                 //This switch is used to display the user selected method on the screen
		 switch(userOption){
		 case 1:
			 System.out.println("coin()");
			 return_value=obj.coin();
			 System.out.println("The return value="+return_value);
			 break;
		 case 2:
			 System.out.println("small_cup()");
			 return_value=obj.small_cup();
			 System.out.println("The return value="+return_value);
			 break;
		 case 3:
			 System.out.println("large_cup()");
			 return_value=obj.large_cup();
			 System.out.println("The return value="+return_value);
			 break;
		 case 4:
			 System.out.println("sugar()");
			 return_value=obj.sugar();
			 System.out.println("The return value="+return_value);
			 break;
		 case 5:
			 System.out.println("tea()");
			 return_value=obj.tea();
			 System.out.println("The return value="+return_value);
			 break;
		 case 6:
			 int n;
			 System.out.println("insert_large_cups(int n)");
			 System.out.println("Enter value of n:");
			 n=in.nextInt();
			 return_value=obj.insert_large_cups(n);
			 System.out.println("The return value="+return_value);
			 break;
		 case 7:
			 int n1;
			 System.out.println("insert_small_cups(int n)");
			 System.out.println("Enter value of n:");
			 n1=in.nextInt();
			 return_value=obj.insert_small_cups(n1);
			 System.out.println("The return value="+return_value);
			 break;
		 case 8:
			 int p;
			 System.out.println("set_price(int p)");
			 System.out.println("Enter value of p:");
			 p=in.nextInt();
			 return_value=obj.set_price(p);
			 System.out.println("The return value="+return_value);
			 break;
		 case 9:
			 System.out.println("cancel()");
			 return_value=obj.cancel();
			 System.out.println("The return value="+return_value);
			 break;
		 case 10:
			 System.out.println("dispose()");
			 return_value=obj.dispose();
			 System.out.println("The return value="+return_value);
			 break;
		 
		 case 12:
                         System.out.println("show_state()");
			 obj.show_state();
			 break;
		 case 13:
                         System.out.println("show_all_values()");
			 obj.show_all_values();
			 break;
		 case 14:
                         System.out.println("show_x()");
			 obj.show_x();
			 break;
		 case 15:
                         System.out.println("show_price()");
			 obj.show_price();
			 break;
                 case 16:
                         System.out.println("show_k()");
			 obj.show_k();
			 break;
		 case 17:
                         System.out.println("show_k1()");
			 obj.show_k1();
			 break;
                 case 18:
                         System.out.println("show_t()");
			 obj.show_t();
			 break;
		 case 19:
                         System.out.println("show_s()");
			 obj.show_s();
			 break;
		 default:
			 if(userOption!=11)
                         {
                            System.out.println("Please choose only from the given options!!");
                            System.out.println("Else Enter 11 to quit");
			 }
                         
                         break;
		 }
		 System.out.println("");
						 
	 }
	 
	 System.out.println("Test Driver is Stopped");
	 System.exit(0);
    }
    
}
