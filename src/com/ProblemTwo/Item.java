package ProblemTwo;

public class Item {
	
	public Item(int id, String title) {
		this.ID = id;
		this.Title = title;
	}
public int ID;
public String Title;

public String toString() {
	return "Item: id = "+this.ID+", title = "+this.Title;
}
}
