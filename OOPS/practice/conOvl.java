package practice;

public class conOvl {
	
	
	
	conOvl(){
		System.out.println("Const 1");
	}
	
	conOvl(int a, int b){
		System.out.println("Const 2");
		
	}
	
	conOvl(int a, int b, int c){
		System.out.println("Const 3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conOvl c1 = new conOvl();
		conOvl c2 = new conOvl();
		conOvl c3 = new conOvl();
		

	}

}
