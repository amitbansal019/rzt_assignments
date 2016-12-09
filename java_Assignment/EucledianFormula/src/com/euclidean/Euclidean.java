package com.euclidean;

import java.util.Arrays;

public class Euclidean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a=new int[][]
			{
			{1,2,3,4,5},
			{2,5,1,3,4},
			{23,11,56,86,27},
			{45,78,23,11,84},
			{33,11,95,28,49}
			};
		int[][] b=new int[5][5];
		double[] distance=new double[5];
		int substract,multiply,addition;
		double root;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				b[j][i]=a[i][j];
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++){
			addition=0;
			for(int j=0;j<5;j++){
				substract=a[0][j]-b[j][i];
				multiply=substract*substract;
				addition=addition+multiply;
				
			}
			root=Math.sqrt(addition);
			distance[i]=root;
		}
		Arrays.sort(distance);
		for(int i=0;i<5;i++){
			System.out.println(distance[i]);
		}

	}

}
