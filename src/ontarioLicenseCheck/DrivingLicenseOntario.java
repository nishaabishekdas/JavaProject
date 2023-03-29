package ontarioLicenseCheck;

public class DrivingLicenseOntario {
	int age;
	String currentLevel;
	Boolean EligibilityCheckG1;
	Boolean EligibilityCheckG2;
	Boolean EligibilityCheckG;
	void CheckEligibility() {
		if(age<16) {
			System.out.println("Not Eligible for License");
		}
		else if(EligibilityCheckG1) {
				System.out.println("Eligible for Licence G2");
			}
		else if(EligibilityCheckG2) {
			System.out.println("Eligible for Licence G");
		}
		else if(EligibilityCheckG){
			System.out.println("Already has G");
		}
		
		
	}
}
