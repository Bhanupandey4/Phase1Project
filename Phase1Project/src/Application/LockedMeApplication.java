package Application;
import Showallfile.*;
import fileOption.*;
import fileOption.FileManagement;

import java.util.Scanner;


public class LockedMeApplication {
	
	
		

		public static void main(String[] args) {
			System.out.println(" ************************************************************************************************************                  ");		
		    System.err.println("                    ******************* LockedMe.com **************        ");
		   		System.err.println( "                       Name : Bhanu Pandey    "); 
	            System.err.println("                 Email Id : bhannu.pandey4@gmail.com       "); 
	            System.err.println("                       Contact Number : 9079744389        ");
	            System.out.println("                                                                                    ");           
			System.out.println(" **************************************************************************************************************"); 
		

			// TODO Auto-generated method stub
			
			Scanner in= new Scanner(System.in);
		
			boolean mainLoop=true;
			int choice;
	while(true) {

	//Display the menu
		
	System.out.println();
	System.out.println("         ************** Welcome to the File Management System ****************                       ");
		


	System.out.println("Available Choices :");
	System.out.println(" 1 : Display names of all the current files in Directory (Ascending Order) ");
	System.out.println(" 2 : Menu ");
	System.out.println(" 3 : Exit ");


	System.out.println();
	System.out.println("*******************************");
	System.out.println("Please Enter the Choice Number:");


	//Get user choice
	 choice = in.nextInt();

	//Display the title of the chosen  module
	switch (choice)
	{
	case 1:
		ShowallFiles sf=new ShowallFiles();
		sf.Show();
		
		
		break;
		
	case 2:
		FileManagement fn=new FileManagement();
		fn.Filemenu();
		
		
		break;

	case 3:
		
		System.out.println("Exiting from the Program...");
		 System.exit(0);
		break;
	default:
		 System.out.println("This is invalid Menu Choice! Please enter another Choice Number");

	break;

	}
		}

	}
		
	}


