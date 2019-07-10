package zhangsongming.designPatterns_23.factory;

public class OperationFactory {

	public AbstractOperation abstractOperation = new AddOperation();
	
	public AbstractOperation getOperation(char operationParams, String numberA, String numberB) {
	switch(operationParams) 
	{
	case '+': 
		abstractOperation.setNumberA(Double.parseDouble(numberA));
		abstractOperation.setNumberB(Double.parseDouble(numberB));
		return abstractOperation;		
	case '-':
		abstractOperation = new SubstractOperation();
		abstractOperation.setNumberA(Double.parseDouble(numberA));
		abstractOperation.setNumberB(Double.parseDouble(numberB));
		return abstractOperation;
		
	case '*':
		abstractOperation = new MultiplyOperation();
		abstractOperation.setNumberA(Double.parseDouble(numberA));
		abstractOperation.setNumberB(Double.parseDouble(numberB));
		return abstractOperation;
		
	case '/':
		abstractOperation = new DivideOperation();
		abstractOperation.setNumberA(Double.parseDouble(numberA));
		abstractOperation.setNumberB(Double.parseDouble(numberB));
		return abstractOperation;
		
	default:
		abstractOperation.setNumberA(Double.parseDouble(numberA));
		abstractOperation.setNumberB(Double.parseDouble(numberB));
		return abstractOperation;
			
	}
}
}
