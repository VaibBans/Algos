package com.cg.arraypractice;
import java.util.Scanner;

public class ToughCompetitors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int i,skill[] = new int[6],j,min=0,k=0;
		while(testCase>0) {
			int num = sc.nextInt();
			int arr[] = new int[num];
			for(i=0;i<num;i++) {
				arr[i] = sc.nextInt();
			}
			for(i=0;i<arr.length-1;i++) {
				for(j=i;j<arr.length;j++) {
					if(j!=i&&k<6) {
						System.out.println("Before assigning K "+k);
						skill[k] = arr[i]-arr[j];
						System.out.println("J "+j);
						System.out.println("K "+k);
						k++;
					}
					if(skill[k]<0)
						skill[k] = skill[k]*(-1);
					else
						skill[k] = skill[k];
				}
				System.out.println("I "+i);
			}
			for(i=0;i<skill.length;i++)
				System.out.println(skill[i]);
			min = skill[0];
			for(i=0;i<skill.length;i++) {
				if(skill[i]<min)
					min = skill[i];
			}
			System.out.println("Tough Competition "+min);
			testCase--;
		}
		sc.close();
	}
}