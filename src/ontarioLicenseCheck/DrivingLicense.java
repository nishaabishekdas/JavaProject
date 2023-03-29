package ontarioLicenseCheck;

public class DrivingLicense {
	int age;
	String typeOfLicenseRequested;
	String currentLicense;

	void drivingTestQualificationResult() {
		if (age < 16) {
			System.out.println("Donot Qualify for Drive Test");
		} else {
			if (typeOfLicenseRequested == "G1") {
				if (currentLicense != null) {
					if (currentLicense == "G1") {
						System.out.println("Already G1 holder");
					} else if (currentLicense == "G2") {
						System.out.println("Our record shows you already has G1.Please apply for G");
					} else if (currentLicense == "G") {
						System.out
								.println("Our record shows you already has G.Please apply back to G1 when G expires.");
					} else {
						System.out.println("Enter a valid entry for currentLisence");
					}
				} else {
					System.out.println("Eligible to get G1");
				}
			} else if (typeOfLicenseRequested == "G2") {
				if (currentLicense != null) {
					if (currentLicense == "G1") {
						System.out.println("Eligible to get G2");
					} else if (currentLicense == "G2") {
						System.out.println("Already G2 holder");
					} else if (currentLicense == "G") {
						System.out
								.println("Our record shows you already has G.Please apply back to G1 when G expires.");
					} else {
						System.out.println("Not Eligible to get G2");
					}
				} else {
					System.out.println("Enter a valid entry for currentLisence");
				}

			} else if (typeOfLicenseRequested == "G") {
				if (currentLicense != null) {
					if (currentLicense == "G1") {
						System.out.println("Apply for G2 first to get eligible for G");
					} else if (currentLicense == "G2") {
						System.out.println("Eligible to get G");
					} else if (currentLicense == "G") {
						System.out.println("Already G holder");
					} else {
						System.out.println("Enter a valid entry for currentLisence");
					}
				} else {
					System.out.println("Not Eligible to get G");
				}
			}

			else {
				System.out.println("Not a valid entry");
			}
		}
	}
}
