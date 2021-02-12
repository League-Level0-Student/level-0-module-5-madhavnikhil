import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class Exercise_1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw 
  
 Robot Fred = new Robot();
   
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
Fred.setPenWidth(10);
 
   	 // 2. set the pen width to 10
String Ginny = JOptionPane.showInputDialog("What color would you like to draw your robot?");
   	 // 1. Make a new Robot and make the Robot draw a shape
if (Ginny.equalsIgnoreCase("red")){
 } Fred.setPenColor(Color.red);
	
{Ginny.equalsIgnoreCase("red");
}	Fred.setPenColor(Color.getColor(Ginny));
    }
    {
    }
	}
    


    

