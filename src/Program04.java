import javax.swing.JOptionPane;

public class Program04 
{
	public static void main(String[] arg)
	
	{
		menu();
	}

	public static void menu() 
	{
		String input;
		int option = 0;
		while (option !=7)//7 end the program
		{
			input=JOptionPane.showInputDialog(null,
					"         CSC 229 -Project04 (math Series)"+"\n"+
					"                Geometric Shapes         "+"\n"+
					"_________________________________________"+"\n"+
					"          "+"Select a Shape by Entering "+"\n"+
					"      "+"the Number Associated with Shape "+"\n"+
					"          "+"Press 7 to Exit the program "+"\n"+
					"__________________________________________"+"\n"+
					"            Two-Dimensional Shapes "+"\n"+
					"__________________________________________"+"\n"+
					"                 "+"             1) Line     "+"\n"+
					"                 "+"             2) Rectangle  "+"\n"+
					"                 "+"             3) Ellipse     "+"\n"+
					"                 "+"             4) Regular Polygon  "+"\n"+
					"__________________________________________"+"\n"+
					"            Three-Dimensional Shapes "+"\n"+
					"                 "+"             5)Sphere"+"\n"+
					"                 "+"             6)Cube"+"\n"+
					"__________________________________________"+"\n"+
					"                 "+"              7) EXIT   "+"\n"+
					"__________________________________________"
					,"CSC 229 - Project04 - Shapes",JOptionPane.QUESTION_MESSAGE
					);
			option = Integer.parseInt(input);
			switch(option)
			{
			case 1:
			{
				Line r = new Line();
				r.getAttributes();
				System.out.println(r.toString());
				displayResult(option, r.toString());
				break;
			}//end case 1
			case 2:
			{
				Rectangle r = new Rectangle();
				r.getAttributes();
				System.out.println(r.toString());
				displayResult(option, r.toString());
				break;
			}//end case 2
			case 3:
			{
				Ellipse r = new Ellipse();
				r.getAttributes();
				System.out.println(r.toString());
				displayResult(option, r.toString());
				break;
			}//end case 3
			case 4:
			{
				RegPolygon r = new RegPolygon();
				r.getAttributes();
				System.out.println(r.toString());
				displayResult(option, r.toString());
				break;
			}//end case 4
			case 7:
			{
				JOptionPane.showMessageDialog(null,
						"             Good Bye  ",
						"Thank You for Using Geometric Shapes ",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}//end case 7
			//case if inputed number that are`not from 1 to 7
			default:
			{
				JOptionPane.showMessageDialog(null,
						"Incorrect input Value, Please Enter Numbers Between 1 and 7",
						"Error",
						JOptionPane.ERROR_MESSAGE);
			}
			}//end of switch
		}//end while
	}
	public static void displayResult(int option, String label )
	{
		switch(option)
		{
		case 1:
		{
			JOptionPane.showMessageDialog(null,
					label,
					"Geometric Shapes",
					JOptionPane.QUESTION_MESSAGE
					);
			
			break;
		}
		case 2:
		{
			JOptionPane.showMessageDialog(null,
					label,
					"Geometric Shapes",
					JOptionPane.QUESTION_MESSAGE
					);
			
			break;
		
		}
		case 3:
		{
			JOptionPane.showMessageDialog(null,
					label,
					"Geometric Shapes",
					JOptionPane.QUESTION_MESSAGE
					);
			
			break;
		
		}
		case 4:
		{
			JOptionPane.showMessageDialog(null,
					label,
					"Geometric Shapes",
					JOptionPane.QUESTION_MESSAGE
					);
			
			break;
		
		}
		}
	}
}

//jimenez1201 //Jime&america001 //2527