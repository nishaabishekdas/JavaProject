package interviewPrep;

public class InterviewQuestionClass {
	int num1=0;
	int num2=1;
	int result;
	int countMax=10;
	void findResult() {
		for(int i=0;i<countMax;i++) {
		result=num1+num2;
		num1=num2;
		num2=result;
		System.out.println(result);
		}
	}
}
