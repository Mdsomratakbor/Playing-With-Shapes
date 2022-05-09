package ProblemTwo;

public class Printed extends Item {
	public Printed(int id, String title, int pages) {
		super(id, title);
		this.numberOfPages = pages;
	}
	public int numberOfPages;
	public String toString() {
		return "Printed Item: id = "+this.ID+", title = "+this.Title+" and pages = "+this.numberOfPages;
	} 
}
