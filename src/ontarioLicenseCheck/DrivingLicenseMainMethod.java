package ontarioLicenseCheck;

public class DrivingLicenseMainMethod {
	public static void main(String args[]) {
		DrivingLicenseOntario license = new DrivingLicenseOntario();
		license.age = 16;
	/*	license.typeOfLicenseRequested = " ";
		license.currentLicense = "";
		license.drivingTestQualificationResult(); */
		license.currentLevel="G1";
		license.EligibilityCheckG1=false;
		license.currentLevel="G2";
		license.EligibilityCheckG2=false;
		license.currentLevel="G";
		license.EligibilityCheckG=true;
		license.CheckEligibility();
		
	}

}
