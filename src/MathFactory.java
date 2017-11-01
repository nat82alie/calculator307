import javafx.scene.control.Label;

public class MathFactory {
	
	Label label1;
	
	public MathFactory(Label label1) {
		label1 = this.label1;
	}
	
	public String calculateResult(String input) {
		String[] pieces = input.split(" ");
		double res = 0;
		Mathematics operation;
		
		if (pieces.length != 3) {
			return "Invalid input:\nMust be [int +|-|*|/ int] separated by spaces";
		}
		
		else if (pieces[1].equals("+")) {
			operation = new Addition();
			res = operation.doMath(pieces[0], pieces[2]);
			return ("Result: " + Double.toString(res));
		}
		else if (pieces[1].equals("-")) {
			operation = new Subtraction();
			res = operation.doMath(pieces[0], pieces[2]);
			return ("Result: " + Double.toString(res));
		}
		else if (pieces[1].equals("*")) {
			operation = new Multiplication();
			res = operation.doMath(pieces[0], pieces[2]);
			return ("Result: " + Double.toString(res));
		}
		else if (pieces[1].equals("/")) {
			operation = new Division();
			res = operation.doMath(pieces[0], pieces[2]);
			return ("Result: " + Double.toString(res));
		}
		else {
			return "Invalid operator";
		}
	}

}
