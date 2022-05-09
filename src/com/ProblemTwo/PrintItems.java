package ProblemTwo;

public class PrintItems {
	public static void main(String[] args) {
		Item[] items = new Item[4];
		items[0] = new Printed(11234, "Java: A Beginner's Guide", 1010);
		items[1] = new Multimedia(2001, "Effective java", 1200);
		items[2] = new Printed(2365, "Building Java Programs", 874);
		items[3] = new Item(5823, "Learn OOP");
		
		for(int i=0; i<4; i++) {
			System.out.println(items[i]+"\n");
		}
		
	}
	
}
