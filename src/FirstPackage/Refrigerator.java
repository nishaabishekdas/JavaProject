package FirstPackage;

public class Refrigerator {
	String brandName;
	String refModel;
	String refType;
	String colour;
	float coolingTemp;
	float capacity;
	float height;
	float width;
	Boolean isWaterDispencer;
	Boolean isDoorAlarm;

	void coolingFoodItem() {
		System.out.println("Cooling Temperature is:" + coolingTemp);
	}

	void doorOpenAlarm() {
		System.out.println("Is refrigerator contains door Alarm:" + isDoorAlarm);
	}

	void waterDispenser() {
		System.out.println("Is refrigerator contains water dispencer:" + isWaterDispencer);
	}

}
