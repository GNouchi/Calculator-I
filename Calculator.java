package folderOne.Calculator;
//implements java.io.Serializable
public class Calculator {
	private String operation ="";
	private double firstVar;
	private double secondVar;
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getFirstVar() {
		return firstVar;
	}
	public void setFirstVar(double firstVar) {
		this.firstVar = firstVar;
	}
	public double getSecondVar() {
		return secondVar;
	}
	public void setSecondVar(double secondVar) {
		this.secondVar = secondVar;
	}

	public double performOperation() {
		double result =0;
		String opr = this.getOperation();
		if(this.getOperation().equals("+")) {
			result = this.getFirstVar()+ this.getSecondVar();
		}
		else if(this.operation.equals("-")) {
			result = this.getFirstVar() - this.getSecondVar();
		}
		else {
			System.out.println("error did not run: FirstVar = " + this.getFirstVar() +", Operation = "+ this.getOperation()+", SecondVar = "+this.getSecondVar());
		}
		return result;		
	}
	public void getResults() {
		double newResult = this.performOperation();
		System.out.println("Operation returned: "+newResult);
	}
}
