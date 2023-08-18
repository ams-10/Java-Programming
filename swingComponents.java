import javax.swing.*;
public class swingComponents{
	public static void main(String args[]){
		JFrame frame = new JFrame("My components Box");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		
		JLabel label = new JLabel("this is my label");
		frame.add(label);
		
		/*ImageIcon icon = new ImageIcon("path to image icon");
		JLabel icon = new JLabel(icon);
		frame.add(icon)*/
		
		JTextField textfield = new JTextField("my text field");
		frame.add(textfield);
		
		JButton button= new JButton("Click me");
		frame.add(button);
		
		String[] listdata = {"banana", "cherry", "apple"};
		JList<String> list = new JList<>(listdata);
		
		JScrollPane scroll = new JScrollPane(list);
		frame.add(scroll);
		
		String[] combodata = {"hello","world","JavaCodebaseComponent"};
		JComboBox<String> combo = new JComboBox<>(combodata);
		frame.add(combo);
		
		frame.setVisible(true);
	}
}