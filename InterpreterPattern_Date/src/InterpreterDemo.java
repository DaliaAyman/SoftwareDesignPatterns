import java.util.ArrayList;
import java.util.Date;

public class InterpreterDemo {

	public static void main(String[] args) {
		System.out.println("The Expression: 'MM-DD-YYYY'");
		String expression = "MM-DD-YYYY";

		Context context = new Context();
		context.setExpression(expression);
		context.setDate(new Date());

		ArrayList<AbstractExpression> expressionOrderList = getExpressionOrder(context);

		System.out.println("Date: " + new Date());

		for (AbstractExpression abstractExpression : expressionOrderList) {
			abstractExpression.evaluate(context);
			System.out.println(abstractExpression.getClass().getName()
					+ " Evaluated     : " + context.getExpression());
		}
		System.out.println("Output : " + context.getExpression());
	}

	private static ArrayList<AbstractExpression> getExpressionOrder(
			Context context) {
		ArrayList<AbstractExpression> expressionOrderList = new ArrayList<AbstractExpression>();
		String[] strArray = context.getExpression().split("-");
		for (String string : strArray) {
			if (string.equalsIgnoreCase("MM")) {
				expressionOrderList.add(new MonthExpression());
			} else if (string.equalsIgnoreCase("DD")) {
				expressionOrderList.add(new DayExpression());
			} else {
				expressionOrderList.add(new YearExpression());
			}
		}
		return expressionOrderList;
	}
}