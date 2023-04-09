package assaignmentApril3;

import java.util.Scanner;

public class WaterTank {
	float maxTankcapacity = 100;
	float bucketCapacity = 10;
	Scanner sc = new Scanner(System.in);

	void tankOverflowCheck() {
		float remainingWaterInTank;
		System.out.println("Enter the tank initial Capacity");
		float tankCapacity = sc.nextFloat();
		while ((tankCapacity + bucketCapacity) < maxTankcapacity) {
			tankCapacity += bucketCapacity;
			remainingWaterInTank = maxTankcapacity - tankCapacity;
			System.out.println("Current water Level is:" + tankCapacity);
			System.out.println("Remaining water level is " + remainingWaterInTank);
		}
		if (tankCapacity+bucketCapacity >= maxTankcapacity) {
			System.out.println("Cannot add more bucket of water.Tank will overflow");
		}
	}

}
