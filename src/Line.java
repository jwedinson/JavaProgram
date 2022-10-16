import javax.swing.JOptionPane;

public class Line
{
	//data members
		private int X;
		private int Y;
		private int x2;
		private int y2;
		
		//Constructors
		public Line()  //no arguments
		{
			int X = 0;
			int Y = 0;
			int x2 = 100;
			int y2 = 100;
			double dis;
		}
		
		public Line(int x, int y, int fir, int sec)  //arguments
		{
			X = x;
			Y = y;
			x2 = fir;
			y2 = sec;
		}
		public int getX() {return X;}
		public int getY() {return Y;}
		public int getfir() {return x2;}
		public int getsec() {return y2;}
		
		//others methods
		public void getAttributes()
		{
			String input;
			input= JOptionPane.showInputDialog(null,
					"Please Enter the X-Coordinate of the First Point(INTEGER) ",
					"X(Start Point of Line",
					JOptionPane.QUESTION_MESSAGE);
			
			X=Integer.parseInt(input);
			
			input= JOptionPane.showInputDialog(null,
					"Please Enter the Y-Coordinate of the First Point(INTEGER) ",
					"Y(Start Point of Line",
					JOptionPane.QUESTION_MESSAGE);
			
			Y=Integer.parseInt(input);
			
			input= JOptionPane.showInputDialog(null,
					"Please Enter the X-Coordinate of the Second Point(INTEGER) ",
					"X(End Point of Line",
					JOptionPane.QUESTION_MESSAGE);
			
			x2=Integer.parseInt(input);
			
			input= JOptionPane.showInputDialog(null,
					"Please Enter the X-Coordinate of the Second Point(INTEGER) ",
					"X(End Point of Line",
					JOptionPane.QUESTION_MESSAGE);
			
			y2=Integer.parseInt(input);
		}
		//method to calculate secondary attributes
		public int getDis() {return (int) Math.sqrt((x2-X)*(x2-X) + (y2-Y)*(y2-Y));}
		
		
		public String toString()
		{
			return  "           Line Properties "+"\n"+
					"______________________________"+"\n"+
					"          First Point = ( "+X+","+Y+")"+"\n"+
					"        Second Point = ( "+x2+","+y2+")"+"\n"+
					"              Length ="+getDis()+"\n"+
					"______________________________"
					;
					
					
		}
}
