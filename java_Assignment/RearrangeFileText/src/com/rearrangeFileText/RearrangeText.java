package com.rearrangeFileText;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RearrangeText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(new File("/home/amit/javaReadFile.txt"));
		ArrayList<String> fLine=new ArrayList<String>();
		String[] word = null;
		char nextword;
		char charLast,charFirst;
		while(sc.hasNext()){
			String line=sc.nextLine();
			word=line.split(" ");
			for(int i=0;i<word.length;i++){
				fLine.add(word[i]);
			}
		}
		int m=1;
		String build=fLine.get(0);
		
		int fileSize=fLine.size();
		int flag = 0;
	    fLine.remove(0);
		charLast=build.charAt(build.length()-1);
		while(m<fileSize){
			for(int j=0;j<fLine.size();j++){
				charFirst=fLine.get(j).charAt(0);
				if(charLast==charFirst){
					build=build+" "+fLine.get(j);
					fLine.remove(j);
					flag=1;
					charLast=build.charAt(build.length()-1);
					break;
					
				}
				}
			if(flag==0){
				System.out.println(fLine);
				build=build+fLine.get(0);
				charLast=fLine.get(0).charAt(fLine.get(0).length()-1);
				System.out.println(build);
				System.out.println(charLast);
				
			}
			
			fileSize=fLine.size();
			//System.out.println(fileSize);
			}
		System.out.println(build);
		FileWriter fw = new FileWriter("/home/amit/javaFileWrite.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(build);
		
			
		}

	}


