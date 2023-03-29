package learnOperator;

public class ArithmeticAssignmentOperator {
	public static void main(String args[]) {
		ArithmeticOperators arithmetic = new ArithmeticOperators();
		arithmetic.num1 = 9;
		arithmetic.num2 = 2;
		arithmetic.sumOperator();
		arithmetic.differenceOperator();
		arithmetic.multiplicationOperator();
		arithmetic.modeOperation();
		AssignmentOperator assaignment = new AssignmentOperator();
		assaignment.num1=10;
		assaignment.addOperator();
		assaignment.minusOperator();
		assaignment.multiOperator();
		assaignment.divisionOperator();
	}
}
