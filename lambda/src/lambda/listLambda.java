package lambda;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface ForRechTest{
	void print(List test);
}

public class listLambda {
	
	public static void main(String args[]) {
		
		
		List<String> gameList = new ArrayList<String>();
		gameList.add("Cricket");
		gameList.add("Football");
		gameList.add("Chess");
		gameList.add("Hockey");
		gameList.add("BasketBall");
		gameList.add("Tennis");
		
		for(int i=0;i<gameList.size();i++) {
			System.out.println(gameList.get(i));
		}
		
		//gameList.forEach(i -> System.out.println(i));
	
	
	
	}

}
