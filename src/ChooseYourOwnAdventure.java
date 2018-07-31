import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
	int one = JOptionPane.showOptionDialog(null, "It was the summer before Lucas started college and he was bored. He decided to go to...", "number1" , 0,  JOptionPane.INFORMATION_MESSAGE, null,
			 new String[] { "the beach", "the pool", "the mall" }, null);
	if(one==2) {
		int two = JOptionPane.showOptionDialog(null, "He drove down to a mall in La Jolla and decided to go into...", "number2", 0, JOptionPane.INFORMATION_MESSAGE,null,
				 new String[] {"Hollister","Abercrombie and Fitch", "Macy's"},null);
		int three = JOptionPane.showOptionDialog(null, "He tried on many shirts, hats, pants, and more, but in the end he decided to only buy...", "number3", 0, JOptionPane.INFORMATION_MESSAGE,null,
				 new String[] {"A navy blue hat","A pair of jeans","A maroon t-shirt"},null);
	} else if(one==1) {
		int four = JOptionPane.showOptionDialog(null, "He put on his trunks, put on lots of sunscreen, and brought with him to the pool...", "number4", 0, JOptionPane.INFORMATION_MESSAGE,null,
				 new String[] {"His floatie","His goggles","towel"},null);
		int five = JOptionPane.showOptionDialog(null, "He had a fun time at the pool and afterwards he decided to grab something to eat. On the way home he decided to stop at...", "number5", 0, JOptionPane.INFORMATION_MESSAGE,null,
				 new String[] {"McDonalds","Baskin Robins","Panera"},null);
	} else if(one==0) {
		int six = JOptionPane.showOptionDialog(null, "He put on his trunks, gathered his things, and drove down to...", "number6", 0, JOptionPane.INFORMATION_MESSAGE,null,
				 new String[] {"Del Mar","Fletcher's","Table Tops"},null);
		int seven = JOptionPane.showOptionDialog(null, "He had a fun time at the beach. He swam, he relaxed, and he...", "number7", 0, JOptionPane.INFORMATION_MESSAGE,null,
				 new String[] {"bodysurfed","surfed","made sandcastles"},null);
	}
}
}
