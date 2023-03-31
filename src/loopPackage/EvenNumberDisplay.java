package loopPackage;

public class EvenNumberDisplay {
	int number;
	void evenNumberMethod() {
		int finalResult=0;
		while(number<=10) {
			finalResult=number*2;
			System.out.println(finalResult);
			number++;
		}
	}

}
