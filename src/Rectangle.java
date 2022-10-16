import javax.swing.JOptionPane;

public class Rectangle 
{
	//data members
	private int xTopLeft;
	private int yTopLeft;
	private int width;
	private int height;
	
	//Constructors
	public Rectangle()  //no arguments
	{
		int xTopLeft = 0;
		int yTopLeft = 0;
		int width = 100;
		int height = 100;
	}
	
	public Rectangle(int x, int y, int w, int h)  //arguments
	{
		xTopLeft = x;
		yTopLeft = y;
		width = w;
		height = h;
	}
	public int getX() {return xTopLeft;}
	public int getY() {return yTopLeft;}
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	
	//others methods
	public void getAttributes()
	{
		String input;
		input= JOptionPane.showInputDialog(null,
				"Please Enter an Integer: ",
				"Top Left X Corner of Rectangle",
				JOptionPane.QUESTION_MESSAGE);
		
		xTopLeft=Integer.parseInt(input);
		
		input= JOptionPane.showInputDialog(null,
				"Please Enter an Integer: ",
				"Top Left Y Corner of Rectangle",
				JOptionPane.QUESTION_MESSAGE);
		
		yTopLeft=Integer.parseInt(input);
		
		input= JOptionPane.showInputDialog(null,
				"Please Enter an Integer: ",
				"Width of the Rectangle",
				JOptionPane.QUESTION_MESSAGE);
		
		width=Integer.parseInt(input);
		
		input= JOptionPane.showInputDialog(null,
				"Please Enter an Integer: ",
				"Height of the Rectangle",
				JOptionPane.QUESTION_MESSAGE);
		
		height=Integer.parseInt(input);
	}
	//method to calculate secondary attributes
	public int getPerimeter() {return 2*(width+height);}
	public int getArea() {return width*height;}
	
	public String toString()
	{
		return  "     Rectangle Properties "+"\n"+
				"______________________________"+"\n"+
				"    TopLeft Corner = ( "+xTopLeft+","+yTopLeft+")"+"\n"+
				"              Width ="+width+"\n"+
				"              Width ="+height+"\n"+
				"            Perimeter ="+getPerimeter()+"\n"+
				"                Area ="+getArea()+"\n"
				;
				
				
	}
}
