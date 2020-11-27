package brickBreaker;

import javax.swing.JOptionPane;

public class input {
	public int inp(char ch) {
		int num;
		String num1;
		
		num1 = JOptionPane.showInputDialog(ch);
		num=Integer.parseInt(num1);
		
		return(num);

}
}
