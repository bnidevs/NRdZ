import cs1.Keyboard;
import terminalTxt.TerminalTxtProcessing;
import java.util.ArrayList;
import ui.UserInterface;
import helper.*;

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

	public static String gameScreen;
	public static boolean status = true;

	public static long prevTime;
	public static long currTime;

	public static void main(String[] args) {
		UserInterface.introUI();
		tapMech();

		UserInterface.firstGold();

		gameScreen = "main";

		while(status){
			if(gameScreen.equals("main")){
				if(_gold == 30){
					UserInterface.tutorial();
					tapMech();
				}else if(_gold < 30){
					UserInterface.mainUIpreTut(_gold);
					tapMech();
				}else{
					UserInterface.mainUIpostTut(_gold);
					tapMech();
				}
			}else if(gameScreen.equals("help")){
				UserInterface.helpUI();
				tapMech();
			}
		}
	}

	public static void tapMech(){
		_totalGoldPKP = (int)((_baseGoldPKP + _additiveGoldPKP) * _multiGoldPKP);
		_totalGoldPS = (int)(_additiveGoldPS * _multiGoldPS);
		keyPress = Keyboard.readString();
		if (keyPress.equals(" ")){
			currTime = System.currentTimeMillis();
			_gold += _totalGoldPKP + (int)((currTime - prevTime) / 1000) * _totalGoldPS;
			prevTime = currTime;
		}else if (keyPress.equals("Q") || keyPress.equals("q")){
			status = false;
			System.exit(0);
		}else if (keyPress.equals("H") || keyPress.equals("h")){
			gameScreen = "help";
		}else if (keyPress.equals("R") || keyPress.equals("r")){
			gameScreen = "main";
		}else if (keyPress.equals("S") || keyPress.equals("s")){
			gameScreen = "store";
		}else if (keyPress.equals("I") || keyPress.equals("i")){
			gameScreen = "inventory";
		}else if (keyPress.equals("N") || keyPress.equals("n")){

		}else if (keyPress.equals("V") || keyPress.equals("v")){

		}else if (keyPress.equals("L") || keyPress.equals("l")){

		}else if (keyPress.equals("U") || keyPress.equals("u")){
			
		}else if (keyPress.equals("E") || keyPress.equals("e")){

		}else if (keyPress.equals("M") || keyPress.equals("m")){

		}else if (keyPress.equals("G") || keyPress.equals("g")){

		}
	}

}
