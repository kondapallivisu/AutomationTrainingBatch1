package Assignment1;

public class MathClass implements CalculatorBase {

	
	int a;
	int b;
	
	
	public MathClass(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}
	
	public MathClass() {
		// TODO Auto-generated constructor stub

	}
	
	public int Addition() {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int Addition(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		
	}

}
