package WriteTextFile;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
public class registration {

	 public static void menu(){
	        System.out.println("\t---Welcom to uber book a ride---");
	        System.out.println("0. End");
	        System.out.println("1. Ride Now");
	        System.out.println("2. Ride Later");
	        System.out.println("Option:");
	    }

	    public static void rideNow(File file) throws IOException{
	     System.out.println("============================");
       	 System.out.println("Enter pickup location :");
       	 Scanner scanner1 = new Scanner(System.in);
       	 String pickup = scanner1.nextLine();
       	 System.out.println("Enter desctination :");
       	 String destination = scanner1.nextLine();
       	 BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
         writer.newLine();
       	 writer.append("Your Pickup Location : "+pickup);
       	 writer.newLine();
         writer.append("Your Destination : "+destination);
       	 writer.close();
	    }
	    
	    public static void rideLater(File file) throws IOException{
	    	 // Instantiate a Date object
	         Date date = new Date();
	         // display time and date using toString()
	         System.out.println("Date : "+date.toString());
	       	 System.out.println("Enter pickup location :");
	       	 Scanner scanner1 = new Scanner(System.in);
	       	 String pickup = scanner1.nextLine();
	       	 System.out.println("Enter desctination :");
	       	 String destination = scanner1.nextLine();
	       	 BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
	       	 writer.newLine();
	       	 writer.append("Date : "+date.toString());
	         writer.newLine();
	       	 writer.append("Your Pickup Location : "+pickup);
	       	 writer.newLine();
	         writer.append("Your Destination : "+destination);
	       	 writer.close();
	    }
	    
	    public static void Exit(){
	        System.out.println("You are in delete() method.");
	    }
	    
	    public static void main(String[] args) throws IOException {
	        int option;
	        File file = new File("CustomerInfo.txt");
	        Scanner input = new Scanner(System.in);
	        
	        do{
	            menu();
	            option = input.nextInt();
	            
	            switch(option){
	            case 0:
	                System.out.println("Exiting...");
	                break;

	            case 1:
	            	rideNow(file);
	                break;
	                
	            case 2:
	            	rideLater(file);
	                break;
	            default:
	                System.out.println("Invalid option.");
	            }
	        } while(option != 0);
	    }

}
