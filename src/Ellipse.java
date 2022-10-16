import javax.swing.JOptionPane;

public class Ellipse
{
	//data members
		private int Xr;
		private int Yr;
		private int width;
		private int height;
		
		//Constructors
		public Ellipse()  //no arguments
		{
			int xTopLeft = 0;
			int yTopLeft = 0;
			int width = 0;
			int height = 0;
		}
		
		public Ellipse(int x, int y, int w, int h)  //arguments
		{
			Xr = x;
			Yr = y;
			width = w;
			height = h;
		}
		public double getX() {return Xr;}
		public double getY() {return Yr;}
		public int getWidth() {return width;}
		public int getHeight() {return height;}
		
		//others methods
		public void getAttributes()
		{
			String input;
			input= JOptionPane.showInputDialog(null,
					"Please Enter an Integer: ",
					"Top Left X Corner of Ellipse",
					JOptionPane.QUESTION_MESSAGE);
			
			Xr=Integer.parseInt(input);
			
			input= JOptionPane.showInputDialog(null,
					"Please Enter an Integer: ",
					"Top Left Y Corner of Ellipse",
					JOptionPane.QUESTION_MESSAGE);
			
			Yr=Integer.parseInt(input);
			
			input= JOptionPane.showInputDialog(null,
					"Please Enter an Integer: ",
					"Width of the Ellipse",
					JOptionPane.QUESTION_MESSAGE);
			
			width=Integer.parseInt(input);
			
			input= JOptionPane.showInputDialog(null,
					"Please Enter an Integer: ",
					"Height of the Ellipse",
					JOptionPane.QUESTION_MESSAGE);
			
			height=Integer.parseInt(input);
		}
		//method to calculate secondary attributes
		public double getPerimeter() {return (int) (Math.PI*3*(width+height)- (Math.sqrt((3*width+height)*(width+height*3))));}
		public double getArea() {return (int) Math.PI*(width*height);}
		
		
		public String toString()
		{
			return  "     Ellipse Properties "+"\n"+
					"______________________________"+"\n"+
					"    TopLeft Corner = ( "+Xr+","+Yr+")"+"\n"+
					"              Width ="+width+"\n"+
					"              Width ="+height+"\n"+
					"            Perimeter ="+getPerimeter()+"\n"+
					"                 Area ="+getArea()+"\n"
					;
					
		} 			
		
}
