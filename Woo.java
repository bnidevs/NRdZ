import cs1.Keyboard;
import terminalTxt.TerminalTxtProcessing;
import java.util.ArrayList;
import ui.UserInterface;

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
		keyPress = Keyboard.readString();
		if (keyPress.equals(" ")){
			_gold += _totalGoldPKP;
		}else if (keyPress.equals("Q") || keyPress.equals("q")){
			status = false;
			System.exit(0);
		}else if (keyPress.equals("H") || keyPress.equals("h")){
			gameScreen = "help";
		}else if (keyPress.equals("R") || keyPress.equals("r")){
			gameScreen = "main";
		}
	}

}
