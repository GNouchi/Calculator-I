package folderOne.Calculator;

public class calcTest {
	public static void main(String[]args) {
		Calculator test1 = new Calculator();
		System.out.println(test1.getFirstVar());
		System.out.println(test1.getSecondVar());
		System.out.println(test1.getOperation());
		test1.performOperation();
		test1.getResults();
		test1.setFirstVar(-2);
		test1.setSecondVar(3);
		test1.setOperation("-");
		System.out.println(test1.getFirstVar());
		System.out.println(test1.getSecondVar());
		System.out.println(test1.getOperation());
		test1.performOperation();
		test1.getResults();
	}
}
