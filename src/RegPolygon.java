import javax.swing.JOptionPane;

public class RegPolygon
{
	private int n;
	private int side;
	private double x;
	private double y;
	
	public RegPolygon()  //no arguments
	{
		int n = 0;
		int side = 0;
		int x = 0;
		int y = 0;
	}
	
	public RegPolygon(int newN, int newSide, double newX, double newY)  //arguments
	{
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	public int getN() {return n;}
	public double getSide() {return side;}
	public double getX() {return x;}
	public double getY() {return y;}
	
	public void getAttributes()
	{
		String input;
		input= JOptionPane.showInputDialog(null,
				"Please Enter an Integer: ",
				"X-Coordinate of the Center",
				JOptionPane.QUESTION_MESSAGE);
		
		x=Integer.parseInt(input);
		
		input= JOptionPane.showInputDialog(null,
				"Please Enter an Integer: ",
				"Y-Coordinate of the Center",
				JOptionPane.QUESTION_MESSAGE);
		
		y=Integer.parseInt(input);
		
		input= JOptionPane.showInputDialog(null,
				"Please Enter an Integer: ",
				"Number of Sides",
				JOptionPane.QUESTION_MESSAGE);
		
		side=Integer.parseInt(input);
		
		input= JOptionPane.showInputDialog(null,
				"Please Enter an Integer: ",
				"Radius of Bounding Circle",
				JOptionPane.QUESTION_MESSAGE);
		
		n=Integer.parseInt(input);
	}
	
	public double angle() {
		return 360/side;
	}
	
	
	public double getPerimeter() {
		return side * n;
	}
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
	
	public String toString()
	{
		return  "     Regular Polygon Properties "+"\n"+
				"______________________________"+"\n"+
				"          Center = ( "+x+","+y+")"+"\n"+
				"          # Sides ="+side+"\n"+
				"          Radius ="+n+"\n"+
				"        Side Lenght ="+n+"\n"+
				"            Perimeter ="+getPerimeter()+"\n"+
				"                 Area ="+getArea()+"\n"
				;
				
	} 			
}
