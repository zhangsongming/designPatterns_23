package zhangsongming.designPatterns_23.factory;

public class client {

	public static void main(String[] args) {
		
		OperationFactory operationFacory = new OperationFactory();
		AbstractOperation abstractOperation;
		abstractOperation = operationFacory.getOperation('+', "35", "50");
		abstractOperation.getResult();
		abstractOperation = operationFacory.getOperation('-', "35", "50");
		abstractOperation.getResult();
		abstractOperation = operationFacory.getOperation('*', "35", "50");
		abstractOperation.getResult();
		abstractOperation = operationFacory.getOperation('/', "35", "50");
		abstractOperation.getResult();
	}
}
