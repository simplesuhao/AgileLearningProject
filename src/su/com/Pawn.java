package su.com;

public class Pawn {
	private String color;
	final String redPawn = "red";
	final String blackPawn = "black";
	public Pawn(){
		color = "white";
	}
	public Pawn(String color){
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
