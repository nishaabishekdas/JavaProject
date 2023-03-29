package FirstPackage;

public class RefrigeratorMain {
	public static void main(String[] args) {
		Refrigerator lgRefrig = new Refrigerator();
		lgRefrig.brandName="LG Electronics";
		lgRefrig.refModel="LRFCSTTTS";
		lgRefrig.refType="French Door Refrigerator";
		lgRefrig.capacity=16.9f;
		lgRefrig.colour="Stainless Steel";
		lgRefrig.width=33;
		lgRefrig.height=69.4f;
		lgRefrig.coolingTemp=37;
		lgRefrig.isDoorAlarm= true;
		lgRefrig.isWaterDispencer=true;
		lgRefrig.coolingFoodItem();
		lgRefrig.doorOpenAlarm();
		lgRefrig.waterDispenser();
		System.out.println("**********************************************");
		Refrigerator samsungRefrig= new Refrigerator();
		samsungRefrig.brandName="Samsung Electronics";
		samsungRefrig.refModel="JESCSTUTS";
		samsungRefrig.refType="Side-by-Side Door Refrigerator";
		samsungRefrig.capacity=23.9f;
		samsungRefrig.colour="Stainless Steel";
		samsungRefrig.width=35.9f;
		samsungRefrig.height=70;
		samsungRefrig.coolingTemp=38;
		samsungRefrig.isDoorAlarm= true;
		samsungRefrig.isWaterDispencer=false;
		samsungRefrig.coolingFoodItem();
		samsungRefrig.doorOpenAlarm();
		samsungRefrig.waterDispenser();
	}

}
