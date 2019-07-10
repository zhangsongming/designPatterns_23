package zhangsongming.designPatterns_23.factory;

public class SubstractOperation extends AbstractOperation{

	public double getResult() {
		System.out.println("the sub result is :" + (numberA-numberB));
		return numberA-numberB;
	}
}
