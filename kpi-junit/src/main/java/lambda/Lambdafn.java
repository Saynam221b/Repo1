package lambda;


interface MathOperation{
	
	int operation(int a, int b);
}
public class Lambdafn {
	
	
	private int operate(int a, int b, MathOperation mathoperation) {
		return mathoperation.operation(a, b);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambdafn test = new Lambdafn();
		
		//with declaration
		MathOperation addition = (int a,int b) -> a+b;
		
		//without declaration
		MathOperation subt = (a, b) -> a-b;
		
		//with return statement with curly braces
		MathOperation mul = (int a,int b) -> {return a*b; };
		
		//without return statement without curly braces
		MathOperation div = (int a,int b) -> a/b;
		
		
		System.out.println(test.operate (1,2,addition));
		System.out.println(test.operate (3,2,subt));
		System.out.println(test.operate (5,2,mul));
		System.out.println(test.operate (10,2,div));
	}

}
