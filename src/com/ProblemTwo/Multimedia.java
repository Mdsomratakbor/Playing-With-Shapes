package ProblemTwo;

public class Multimedia extends Item {
	public Multimedia(int id, String title, int length) {
		super(id, title);
		this.Length = length;
	}
 public int Length;
 
 public String toString() {
		return "Multimedia Item: id = "+this.ID+", title = "+this.Title+" and length = "+this.Length+" seconds";
	}
}
