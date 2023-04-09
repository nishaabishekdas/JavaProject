package learningArray;

import java.util.Scanner;

public class DivByFiveThreeClass {
	int[] arrayListExm = new int[10];
	Scanner sc = new Scanner(System.in);

	void divByThreeFive() {
		int j=1;
		System.out.println("Enter the max limit:");
		int maxLimit = sc.nextInt();
		for(int i=0;i<arrayListExm.length;i++) {
			for(int count=j+1;count<maxLimit;count++) {
				if(count%3==0 && count%5==0) {
					arrayListExm[i]=count;
					j=count;
					break;
				}
			}
		}
	}
	void displayArrayExmple() {
		for(int i=0;i<arrayListExm.length;i++) {
			System.out.println(arrayListExm[i]);
		}
	}

}
