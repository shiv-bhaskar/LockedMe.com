package com.lockedme;

import java.util.List;
import java.util.Scanner;

public class HandleOp {
	public static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOp.dispMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					FileOps.displayAllFiles("root");
					break;
				case 2:
					HandleOp.handleFileMenuOp();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}
	
	public static void handleFileMenuOp() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOp.dispFileMenuOp();
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// File Add
					System.out.println("Enter the name of the file to be added to the \"root\" folder");
					String fileToAdd = sc.next();
					
					FileOps.createFiles(fileToAdd);
					break;
				
				case 2:
					// File/Folder delete
					System.out.println("Enter the name of the file to be deleted from \"root\" folder");
					String fileToDelete = sc.next();
					
					FileOps.deleteFile(fileToDelete);	

					break;
				case 3:
					// File/Folder Search
					System.out.println("Enter the name of the file to be searched from \"root\" folder");
					String fileToSearch = sc.next();
					
					
					FileOps.searchFiles("root",fileToSearch);

					
					break;
				case 4:
					handleWelcomeScreenInput();
					break;
				case 5:
					// Exit
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOp();
			}
		} while (running == true);
	}
}
