package zhangsongming.designPatterns_23.factory;

public class AddOperation extends AbstractOperation {

	public double getResult() {
		
		System.out.println("the add result is :" + numberA+numberB);
		return numberA+numberB;
	}
}
