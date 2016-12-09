package com.snakeladdergame;

import java.util.Arrays;

public class SnakeLadderGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board=new int[][]{
			{0,0,0,0,0,0},
			{1,2,22,4,8,6},
			{2,22,4,8,6,7},
			{22,4,8,6,7,8},
			{4,8,6,7,8,9},
			{8,6,7,8,9,10},
			{6,7,8,9,10,26},
			{7,8,9,10,26,12},
			{8,9,10,26,12,13},
			{9,10,26,12,13,14},
			{10,26,12,13,14,15},
			{26,12,13,14,15,16},
			{12,13,14,15,16,4},
			{13,14,15,16,4,18},
			{14,15,16,4,18,7},
			{15,16,4,18,7,29},
			{16,4,18,7,29,9},
			{4,18,7,29,9,22},
			{18,7,29,9,22,23},
			{7,29,9,22,23,24},
			{29,9,22,23,24,25},
			{9,22,23,24,25,26},
			{22,23,24,25,26,1},
			{23,24,25,26,1,28},
			{24,25,26,1,28,29},
			{25,26,1,28,29,30},
			{26,1,28,29,30,0},
			{1,28,29,30,0,0},
			{28,29,30,0,0,0},
			{29,30,0,0,0,0},
			{30,0,0,0,0,0}
			};
			int[] arr=new int[7];
			int dicePosition=1;
			int destination=20;
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
