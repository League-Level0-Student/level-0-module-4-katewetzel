package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What was your test score?");
	int x = Integer.parseInt(score);
	if(x<=70) {
		JOptionPane.showMessageDialog(null,"Better luck next time!");
	} else if(x>=70&&x<=90) {
		JOptionPane.showMessageDialog(null,"That is an ok score");
	}else {
		JOptionPane.showMessageDialog(null,"That is great!");
	}
}
}
