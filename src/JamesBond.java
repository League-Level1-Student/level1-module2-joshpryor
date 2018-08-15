
public class JamesBond {

	int findCode(Vault bob) {
		for (int i = 0; i < 1000000; i++) {
			System.out.println(i);
			boolean b = bob.tryCode(i);
			if (b == true ) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
	}
}
