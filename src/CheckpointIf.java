import javax.swing.JOptionPane;

public class CheckpointIf {
	public static void main(String[] args) {
		String a = "yes";

		if (a.equalsIgnoreCase("yes")) {

			System.out.print("happy");

		} else {
			System.out.println("sad");

		}
		System.out.println(" wednesday");
		int i = 13;
		if (i < 21) {

			System.out.println(" Its so great being young");

		} else {

			System.out.println(" dont you wish you were young");

		}

		String ani;
		ani = JOptionPane.showInputDialog("What is your favorite animal");

		if (ani.equalsIgnoreCase("cat")) {

			System.out.println("cats go meow");

		}

		else if (ani.equalsIgnoreCase("dog")) {

			System.out.println("dogs go wooooooooooooooooooooooooof");

		} else if (ani.equalsIgnoreCase("jake paul")) {

			System.out.println("its every day broo");

		} else {

			System.out.println("I dont know that one");

		}
	}
}
