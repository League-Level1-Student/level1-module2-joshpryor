
public class Minion {

	 private String name; 
	 private int eyes; 
	 private String color;
	 private String master;
	 
	  Minion(String nam, int i, String col, String mastr) {
		 
		 name=nam;
		 eyes=i;
		 color=col;
		 master=mastr;
		 
		 
		 
	 } 
	 
	String getName() {
	return name;	
		
	} 
	 void setName(String n) {

		 this.name=n;
		 
	 }
	 
int getEyes() {
	return eyes;
	
}	 
	void setEyes(int e) {
		this.eyes = e;
		
	}
	 
	String getColor() {
	return color;	
		
	} 
	 void setcolor(String c) {
		 this.color=c;
		 
	 }
	
		String getMaster() {
			return master;	
				
			} 
			 void setMaster(String m) {
				 this.master=m;
				 
			 }
	
	
}
