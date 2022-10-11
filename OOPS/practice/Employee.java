package practice;

public class Employee implements Salary,Leaves{

	@Override
	public int noOfLeaves() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int salaryAmt() {
		// TODO Auto-generated method stub
		return 2212;
	}

	@Override
	public String currency() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String args[]) {
		Employee e = new Employee();
		System.out.println("Salary of employee is "+e.salaryAmt());
		
	}

}
