import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
	int i = 0;
	String j;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
j=JOptionPane.showInputDialog("Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(j.equalsIgnoreCase("man")){
		// 5. Otherwise, say "wrong" and tell them the answer
JOptionPane.showMessageDialog(null, "correct");
		// 6. Add some more riddles
i++;
}	
else {
	
	
	JOptionPane.showMessageDialog(null, "wrong!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	

}
// 2. Make a pop up to show the score.\
String u;
u=JOptionPane.showInputDialog("If I drink, I die. If i eat, I am fine. What am I?");
		JOptionPane.showMessageDialog(null, "Score:" +i);
	}
}


