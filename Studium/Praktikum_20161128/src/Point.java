
public class Point {
	
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distance(Point p) {
		return Math.sqrt(((this.x - this.y)*(this.x - this.y))+((p.getX() - p.getY())*(p.getX() - p.getY())));
	}
	
	public String toString() {
		return "Punkt: (" + this.x + "," + this.y + ")";
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(5,8);
		Point p2 = new Point(2,3);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println("Distance: " + p1.distance(p2));

	}
}

