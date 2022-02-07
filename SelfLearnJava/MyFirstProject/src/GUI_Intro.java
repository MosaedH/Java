import javax.swing.JOptionPane;


public class GUI_Intro {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name: ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age: ")); 	// NOTE: The parseInt mouthed will convert String to integer
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you height: "));
		JOptionPane.showMessageDialog(null, "Hello "+name+"\nYou are "+age+" years old "+"\nYou height is "+height);


	}
}	