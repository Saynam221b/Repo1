package OOps;

import java.util.Scanner;

	
public class ExcepH {
	

	public static void main(String[] args) {
	
		try (  Scanner sc = new Scanner(System.in))

		
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = a+b+c;
			System.out.println("Output is "+d/0);
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Done");
		}
	}


	}

