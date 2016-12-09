package com.snakeladdergame;

import java.util.Scanner;

public class Snake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] snake=new int[100];
		int[] ladder=new int[100];
		System.out.println("enter diceposition");
		int diceposition=sc.nextInt();
		System.out.println("enter destination");
		int destination=sc.nextInt();
		//System.out.println("enter the no of ladders present");
		//int n=sc.nextInt();
		//System.out.println("enter the snake starting and end");
		//int start,end;
		/*for(int i=1;i<n+1;i++){
			System.out.println("enter start of ladder");
			start=sc.nextInt();
			System.out.println("enter end of ladder");
			end=sc.nextInt();
			ladder[start]=end;
			
			
		}*/
		ladder[5]=8;ladder[11]=26;ladder[20]=29;ladder[9]=30;ladder[3]=22;
		snake[17]=4;snake[19]=7;snake[21]=9;snake[27]=1;
		int[][] board=new int[destination+1][6];
		for(int i=1;i<destination+1;i++){
			int count=0;
			for(int j=0;j<6;j++){
				int c=i+count;
				if(ladder[c]>0){
					//System.out.println("inside if "+c);
					board[i][j]=ladder[c];
					count++;
				}else{
					if(snake[c]>0){
						board[i][j]=-1*snake[c];
						
					}else{
						board[i][j]=c;
					}
					//System.out.println("inside else "+c);
					count++;
					
				}
				
						
			}
		}
		for(int i=1;i<destination+1;i++){
			int count=0;
			for(int j=0;j<6;j++){
				System.out.print(board[i][j]+"\t");
						
			}
			System.out.println();
		}
		ThrowCount c=new ThrowCount(destination,diceposition,board);
		c.count();

	}

}
