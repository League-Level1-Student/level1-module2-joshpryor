
public class PopcornMaker {

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Popcorn jiffy = new Popcorn("buttered");
		Microwave minny = new Microwave();
		
		minny.putInMicrowave(jiffy);
		minny.setTime(2);
		minny.startMicrowave();
		jiffy.applyHeat();
		jiffy.eat();
		
	}
	
}
