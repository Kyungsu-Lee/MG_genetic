package mg.gui;

public class MyPoint
{
	private double x;
	private double y;

	public MyPoint(int x, int y) { this.x = x; this.y = y; }
	public MyPoint(double x, double y) { this.x = x; this.y = y; }
	public MyPoint(int x, double y) { this.x = x; this.y = y; }
	public MyPoint(double x, int y) { this.x = x; this.y = y; }
	
	public double getX() { return x; }
	public double getY() { return y; }

	public static MyPoint add(MyPoint other, MyPoint p)
	{
		return new MyPoint(p.getX() + other.getX(), p.getY() + other.getY());
	}

	public MyPoint sub(MyPoint other, MyPoint p)
	{
		return new MyPoint(p.getX() - other.getX(), p.getY() - other.getY());
	}

	public static MyPoint mid(MyPoint p, MyPoint q)
	{
		return new MyPoint((p.getX() + q.getY())/2, (p.getY() + q.getY())/2);
	}

	@Override
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
}
