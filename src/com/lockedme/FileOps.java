package com.lockedme;

import java.util.Arrays;
import java.util.List;

import java.io.File;
import java.io.IOException;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;



public class FileOps {


	public static void displayAllFiles(String path) {
		File fDir=new File(path);
		File files[]=fDir.listFiles();
		if(files.length>0) {
			List<String> fileList=Arrays.asList(fDir.list());
			System.out.println("The files in the directory are");
			for(String s:fileList) {
				System.out.println(s);
			}
			
			System.out.println();
			
			}
			
		else {
			System.out.println("Directory is empty");
			System.exit(0);
		}
	}

	

	public static void createFiles(String fileToAdd) {
		Path filePath = Paths.get("./root/" + fileToAdd);
		try {
			Files.createDirectories(filePath.getParent());
			Files.createFile(filePath);
			System.out.println(fileToAdd + " has been successfully added to the directory.");

			

		} catch (IOException e) {
			System.out.println("Failed to create file " + fileToAdd);
			System.out.println(e.getClass().getName());
		}
	}

	

	public static void searchFiles(String path, String fileName) {
		File dir = new File(path);
		String[] fileList=dir.list();
		int flag=0;
	
		
		if(fileList==null) {
			System.out.println("The directory is empty");
		}
		else {
			for(int i=0;i<fileList.length;i++) {
				String currFileName=fileList[i];
				
				if(currFileName.equals(fileName))
				{
					System.out.println("File "+currFileName+" found at "+dir);
					flag=1;
				}
			}
		}
		if(flag==0)
		{
			System.out.println(fileName+" not found");
		}

	}

	public static void deleteFile(String fileToDelete) {

		Path filePath = Paths.get("./root/" + fileToDelete);
		try {
			Files.delete(filePath);
		}
		catch(NoSuchFileException e)
        {
            System.out.println("File Not Found");
        }
        catch(DirectoryNotEmptyException e)
        {
            System.out.println("Directory is not empty.");
        }
        catch(IOException e)
        {
            System.out.println("Invalid");
        }
          
		System.out.println("Successfully Deleted");

	}
}
