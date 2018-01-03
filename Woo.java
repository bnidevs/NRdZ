import cs1.Keyboard;
import terminalTxt.TerminalTxtProcessing;
import java.util.ArrayList;

public class Woo {
	public int _gold = 0;

	public static void main(String[] args) {
		System.out.println(TerminalTxtProcessing.terminalCenter("                 WELCOME TO\n /¯\\  /¯\\ |    |¯\\ |¯¯¯ | |\\  | /¯\\ |¯¯ |¯¯\\\n|  _ |   ||    |  ||--  | | \\ ||  _ |-- |--/\n \\_/  \\_/ |___ |_/ |    | |  \\| \\_/ |__ |  \\\n\n\n\n        Tap SPACE + ENTER to start"));
		Keyboard.readString();

		ArrayList<String> testtxtarr = new ArrayList<String>();

		String testtxt1 = "";
		String testtxt2 = "";
		String testtxt3 = "";
		String testtxt4 = "";
		String testtxt5 = "";
		String testtxt6 = "";

		testtxt1 += TerminalTxtProcessing.terminalCenter("------------------\n|                |\n|                |\n------------------\n");

		testtxt2 += TerminalTxtProcessing.terminalCenter("  ------------\n /\\           \\ \n/  \\           \\ \n----------------\n");

		testtxt3 += TerminalTxtProcessing.terminalCenter("  --------\n / \\     \\\n/   \\     \\\n------------\n");

		testtxt4 += TerminalTxtProcessing.terminalCenter("  --\n /  \\\n/    \\\n------\n");

		testtxt5 += TerminalTxtProcessing.terminalCenter("  --------\n /      / \\\n/      /   \\\n------------\n");

		testtxt6 += TerminalTxtProcessing.terminalCenter("  ------------\n /           /\\\n/           /  \\\n----------------\n");

		testtxtarr.add(testtxt1);
		testtxtarr.add(testtxt2);
		testtxtarr.add(testtxt3);
		testtxtarr.add(testtxt4);
		testtxtarr.add(testtxt5);
		testtxtarr.add(testtxt6);

		TerminalTxtProcessing.sleeperPrinter(testtxtarr, 250, 1);

		for(int i = 0; i < testtxtarr.size(); i++){
			testtxtarr.set(i,testtxtarr.get(i).substring(0,10) + ("                                YOUR FIRST GOLD!\n") + testtxtarr.get(i).substring(10));
		}

		TerminalTxtProcessing.sleeperPrinter(testtxtarr, 250, 5);
	}

	public static void tapMech(){
		if(Keyboard.readString().equals(" "));
	}

}
