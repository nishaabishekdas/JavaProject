package assaignmentApril3;

public class WaterTank {
	int maxTankcapacity = 100;
	int bucketCapacity = 10;

	void tankOverflowCheck() {
		int tankCapacityLevel = 0;
		while (tankCapacityLevel < maxTankcapacity) {
			tankCapacityLevel += bucketCapacity;
			System.out.println("Current water Level is:" + tankCapacityLevel);
		}
		if (tankCapacityLevel == maxTankcapacity) {
			System.out.println("Cannot add more bucket of water.Tank will overflow");
		}
	}

}
