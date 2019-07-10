package zhangsongming.designPatterns_23.factory;

public abstract class AbstractOperation implements Operation {


	public double numberA;
	public double numberB;
	
   public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

public abstract double getResult();
}
