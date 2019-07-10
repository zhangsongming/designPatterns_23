package zhangsongming.designPatterns_23.factory;

public class MultiplyOperation extends AbstractOperation{

	public double getResult() {
		System.out.println("the multiply result is :" + numberA*numberB);
		return numberA*numberB;
	}
}
