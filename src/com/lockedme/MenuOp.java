package com.lockedme;

public class MenuOp {

	public static void printWelcomeScreen(String appName, String devName) {
		//Display Application Details
		String appDetails = String.format("____________________________________________________\n"
				+ "|| Welcome to %s. \n" + "|| This application was developed by %s.\n"
				+ "____________________________________________________\n", appName, devName);
		System.out.println(appDetails);
		//Display Application Features
		String appFeatures = "This application can be used to :-\n"
				+ "-> Retrieve all file names in the \"root\" folder\n"
				+ "-> Search, add, or delete files in \"root\" folder.\n";
		System.out.println(appFeatures);
	}

	public static void dispMenu() {
		//Display menu to select operation
		String menu = "\n\n||| Select any option and press Enter to proceed |||\n\n"
						+ "1) Retrieve all files inside \"root\" folder\n"
						+ "2) Display options for operations on the File\n"
						+ "3) Exit Program\n";
		System.out.println(menu);

	}

	public static void dispFileMenuOp() {
		//Display menu to select operations to be performed on file
		String fileMenu = "\n\n        Select any option number from below and press Enter      \n\n"
							+ "1) Add a user file to \"root\" folder\n" 
							+ "2) Remove a file from \"root\" folder\n"
							+ "3) Search for a file from \"root\" folder\n" 
							+ "4) Return Back\n" 
							+ "5) Exit program\n";

		System.out.println(fileMenu);
	}
	
	
	

}
