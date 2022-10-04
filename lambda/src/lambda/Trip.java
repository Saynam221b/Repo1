package lambda;


interface stable {
	boolean mentalStable(boolean st);
	
	
}


public class Trip {

	private boolean operate(boolean s, stable st) {
		return st.mentalStable(s);
	}	
	
	public static void main(String[] args) {

		Trip test = new Trip();
	
		stable boy1 = (boolean s) -> s;
		stable boy2 = (boolean s) -> s;
		stable boy3 = (boolean s) -> s;
		stable boy4 = (boolean s) -> s;
		stable old1 = (boolean s) -> s;
		stable old2 = (boolean s) -> s;
		stable old3 = (boolean s) -> s;
		stable old4 = (boolean s) -> s;
		
		
		System.out.println("Is boy 1 stable? "+ test.operate (false, boy1));
		System.out.println("Is old 1 stable? "+ test.operate (false, old1));
		System.out.println("Is boy 2 stable? "+ test.operate (false, boy2));
		System.out.println("Is old 2 stable? "+ test.operate (false, old2));
		System.out.println("Is boy 3 stable? "+ test.operate (false, boy3));
		System.out.println("Is old 3 stable? "+ test.operate (true,  old3));
		System.out.println("Is boy 4 stable? "+ test.operate (true,  boy4));
		System.out.println("Is old 4 stable? "+ test.operate (false, old4));
		
		System.out.println();
		System.out.println("The two people who recovered after 8 months and will get released are - ");
		
		if(test.operate(false,boy1)==true) {
			System.out.println("boy 1");
			
		}
		if(test.operate(false,boy2)==true) {
			System.out.println("boy 2");
			
		}
		if(test.operate(false,boy3)==true) {
			System.out.println("boy 3");
			
		}
		if(test.operate(true,boy4)==true) {
			System.out.println("boy 4");
			
		}
		if(test.operate(false,old1)==true) {
			System.out.println("old 1");
			
		}
		if(test.operate(false,old2)==true) {
			System.out.println("old 2");
			
		}
		if(test.operate(true,old3)==true) {
			System.out.println("old 3");
			
		}
		if(test.operate(false,old4)==true) {
			System.out.println("old 4");
			
		}
		
	
	
	}
}