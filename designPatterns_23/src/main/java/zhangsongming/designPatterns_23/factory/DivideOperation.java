package zhangsongming.designPatterns_23.factory;

public class DivideOperation extends AbstractOperation{

	public double getResult() {
		
		if(numberA!=0 && numberB!=0) {
			System.out.println("the divide result is :" + numberA/numberB);
			return numberA/numberB;
		}
		return 0;
	}
}
