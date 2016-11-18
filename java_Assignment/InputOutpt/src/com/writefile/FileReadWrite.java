package com.writefile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter source file path");
		String source=sc.nextLine();
		System.out.println("enter destination file path");
		String destination=sc.nextLine();
		FileInputStream fin=null;
		FileOutputStream fout=null;
		int i=0;
		if(new File(source).isFile()){
			try {
				fin=new FileInputStream(source);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			if(new File(destination).isFile()){
				System.out.println("Do you want to overwrite the file");
				System.out.println("Press y to yes and n to no ");
				String ans=sc.nextLine();
				if(ans.equals("y")){
					try {
						fout=new FileOutputStream(destination);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
					}
					i=0;
					try {
						while((i=fin.read())!=-1){
							fout.write(i);	
						}
						System.out.println("file is overwritten");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}else
					System.out.println("file is not overwritten");
				
			}else{
				
				try {
					fout=new FileOutputStream(destination);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				i=0;
				try {
					
					while((i=fin.read())!=-1){
						fout.write(i);	
					}
					System.out.println("New file created and data written inside file");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}else{
			System.out.println("Source File does not exist");
		}
			
		

	}

}
