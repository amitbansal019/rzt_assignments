package com.matrix;

import java.util.Scanner;

public class Matrix {
	int row;
	int column;
	int[][] arr=new int[11][11];
	int[][] arr1=new int[11][11];
	Matrix(){
		
	}
	Matrix(int i,int j){
		this();
		row=i;
		column=j;
	}
	public void setElement(int r, int c, int value){
		if(r>0 && c>0)
			arr[r][c]=value;
		else 
			arr[r][c]=0;
		
	}
	public void transpose(){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				arr1[j][i]=arr[i][j];
			}
		}
		
	}
	public void display(){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int row=sc.nextInt();
		System.out.println("enter the collumn");
		int column=sc.nextInt();
		Matrix x=new Matrix(row,column);
		System.out.println("enter the element the which you want to set");
		System.out.println("enter the row");
		int r=sc.nextInt();
		System.out.println("enter the column");
		int c=sc.nextInt();
		System.out.println("enter the value ");
		int v=sc.nextInt();
		x.setElement(r,c,v);
		x.display();
		

	}

}
