
public class Tea {

	
	
	
	
	
	
	public static void main(String[] args) {
		TeaBag teabag = new TeaBag(TeaBag.MINT);
		Kettle kettle = new Kettle();
		Cup cup = new Cup();
		
		kettle.boil();
		
	
		cup.makeTea(teabag, kettle.getWater());
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
