import cs1.Keyboard;
import terminalTxt.TerminalTxtProcessing;
import java.util.ArrayList;

public class Woo {
	public static int _gold = 0;

	public static final int _baseGoldPKP = 1;
	public static int _additiveGoldPKP = 0;
	public static double _multiGoldPKP = 1.0;
	public static int _totalGoldPKP = (int)((_baseGoldPKP + _additiveGoldPKP) * _multiGoldPKP);

	public static int _additiveGoldPS = 0;
	public static double _multiGoldPS = 1.0;
	public static int _totalGoldPS = (int)(_additiveGoldPS * _multiGoldPS);

	public static String keyPress;

	public static boolean gameMainScreen;

	public static void main(String[] args) {
		System.out.println(TerminalTxtProcessing.terminalCenter("                 WELCOME TO\n /¯\\  /¯\\ |    |¯\\ |¯¯¯ | |\\  | /¯\\ |¯¯ |¯¯\\\n|  _ |   ||    |  ||--  | | \\ ||  _ |-- |--/\n \\_/  \\_/ |___ |_/ |    | |  \\| \\_/ |__ |  \\\n\n\n\n        Tap SPACE + ENTER to start"));
		tapMech();

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

		TerminalTxtProcessing.sleeperPrinter(testtxtarr, 250, 3);

		for(int i = 0; i < testtxtarr.size(); i++){
			testtxtarr.set(i,testtxtarr.get(i).substring(0,10) + ("                    Keep pressing SPACE + ENTER to make more\n") + testtxtarr.get(i).substring(59));
		}

		TerminalTxtProcessing.sleeperPrinter(testtxtarr, 250, 1);

		for(int i = 0; i < 5; i++){
			testtxtarr.remove(0);
		}
		testtxtarr.add("\n\n\n\n\n              ------\n             /     /\\\n             --------" + TerminalTxtProcessing.textRepeater("\n", 17));
		testtxtarr.add("   \n" + _gold + " [GOLD]" + TerminalTxtProcessing.textRepeater("\n", 23));

		TerminalTxtProcessing.sleeperPrinter(testtxtarr, 250, 1);

		testtxtarr.remove(0);
		testtxtarr.remove(0);

		gameMainScreen = true;

		while(gameMainScreen = true){
			if(_gold == 30){
				testtxtarr.remove(0);

				
			}else{
				tapMech();
				testtxtarr.set(0, testtxtarr.get(0).substring(4) + _gold + " [GOLD]" + TerminalTxtProcessing.textRepeater("\n", 22));
				System.out.println(testtxtarr.get(0));
			}
		}
	}

	public static void tapMech(){
		_totalGoldPKP = (int)((_baseGoldPKP + _additiveGoldPKP) * _multiGoldPKP);
		keyPress = Keyboard.readString();
		if (keyPress.equals(" ")){
			_gold += _totalGoldPKP;
		}else if (keyPress.equals("Q")){
			gameMainScreen = false;
			System.exit(0);
		}
	}

}
