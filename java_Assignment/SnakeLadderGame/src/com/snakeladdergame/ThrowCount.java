package com.snakeladdergame;

import java.util.Arrays;

public class ThrowCount {
	int[][] board;
	int destination;
	int dicePosition;

	public ThrowCount(int destination2, int diceposition2, int[][] board2) {
		// TODO Auto-generated constructor stub
		destination=destination2;
		this.board=board2;
		dicePosition=diceposition2;
	}
	void count(){
		
		int[] arr=new int[7];
		int dicePosition=this.dicePosition;
		int destination=this.destination;
		int diceThrowCount=0;
		int count,flag=0;
		System.out.print(dicePosition+"--> ");
		while(dicePosition!=30){
			count=0;
			for(int i=0;i<6;i++){
					arr[count]=board[dicePosition][i];
					if(board[dicePosition][i]>destination){
						arr[count]=0;
					}	
					count++;
				}
			Arrays.sort(arr);
			dicePosition=arr[count];
			diceThrowCount++;
			System.out.print(dicePosition+"--> ");
			if((dicePosition+6)>destination || (dicePosition+6)==destination){
				diceThrowCount++;
				System.out.print(destination+"(Reached Destination)");
				System.out.print("\n");
				break;
			}else if(dicePosition>destination || dicePosition==destination)
				break;
			}

		System.out.println("Total dice throw = "+diceThrowCount);

	}

}
