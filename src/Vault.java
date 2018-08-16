import javax.swing.JOptionPane;

public class Vault {
int code = 123456;
	
		boolean tryCode(int rex) {
			if (rex == code) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
		public static void main(String[] args) {
		//	int jop = JOptionPane.showInputDialog("what is the code");
		Vault vic = new Vault();
			//vic.tryCode(99999999);
	
			System.out.println(vic.tryCode(12345678));
		}
			
			
			
			
}
		













