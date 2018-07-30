package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday=false, isVacation=false;
 
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
 int x =  JOptionPane.showConfirmDialog(null, "Is it a weekday?","Sleepy Head", JOptionPane.YES_NO_OPTION);
if(x==0) {
	isWeekday=true;
} else if(x==1) {
	isWeekday=false;
}
int y = JOptionPane.showConfirmDialog(null, "Is it a vacation?","Sleepy Head", JOptionPane.YES_NO_OPTION);
if(y==0) {
	isVacation=true;
}else if(y==1) {
	isVacation=false;
}

 

 if(isWeekday==true&&isVacation==false) {
	 JOptionPane.showMessageDialog(null, "Get up lazybones");
 } else if(isWeekday==true&&isVacation==true) {
	 JOptionPane.showMessageDialog(null, "sleep in");
 } else if(isWeekday==false) {
	 JOptionPane.showMessageDialog(null, "Sleep in");
 }else if(isVacation==true) {
	 JOptionPane.showMessageDialog(null, "Sleep in");
 }

        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
