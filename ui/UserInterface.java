package ui;

import java.util.ArrayList;
import terminalTxt.TerminalTxtProcessing;
import helper.Helper;
import helper.Miner;
import helper.Worker;
import helper.Engineer;
import helper.Gambler;

public class UserInterface {

public static void main(String[] args){
}

public static void introUI(){
								System.out.println(TerminalTxtProcessing.terminalCenter("                 WELCOME TO\n /¯\\  /¯\\ |    |¯\\ |¯¯¯ | |\\  | /¯\\ |¯¯ |¯¯\\\n|  _ |   ||    |  ||--  | | \\ ||  _ |-- |--/\n \\_/  \\_/ |___ |_/ |    | |  \\| \\_/ |__ |  \\\n\n\n\n        Tap SPACE + ENTER to start"));
}

public static void firstGold(){
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

								for(int i = 0; i < testtxtarr.size(); i++) {
																testtxtarr.set(i,testtxtarr.get(i).substring(0,10) + ("                                YOUR FIRST GOLD!\n") + testtxtarr.get(i).substring(10));
								}

								TerminalTxtProcessing.sleeperPrinter(testtxtarr, 250, 3);

								for(int i = 0; i < testtxtarr.size(); i++) {
																testtxtarr.set(i,testtxtarr.get(i).substring(0,10) + ("                    Keep pressing SPACE + ENTER to make more\n") + testtxtarr.get(i).substring(59));
								}

								TerminalTxtProcessing.sleeperPrinter(testtxtarr, 250, 1);

								testtxtarr.add("\n\n\n\n\n              ------\n             /     /\\\n             --------" + TerminalTxtProcessing.textRepeater("\n", 17));
								testtxtarr.add("   \n1 [GOLD]" + TerminalTxtProcessing.textRepeater("\n", 23));

								TerminalTxtProcessing.sleeperPrinter(testtxtarr, 250, 1);
}

public static void mainUIpreTut(int printGold){
								System.out.println(printGold + " [GOLD]" + TerminalTxtProcessing.textRepeater("\n", 22));
}

public static void mainUIpostTut(int printGold, int pkp, int ps){
								System.out.println(printGold + " [GOLD]  " + pkp + " gold per press  " + ps + " gold per second\n\n [S]hop\n\n [H]elp\n\n [I]nventory\n\n [Q]uit" + TerminalTxtProcessing.textRepeater("\n", 14));
}

//main screen with powerups expired
public static void mainUIpostTutPow(int printGold, int pkp, int ps){
								System.out.println(printGold + " [GOLD]  " + pkp + " gold per press  " + ps + " gold per second\n\n [S]hop\n\n [H]elp\n\n [I]nventory\n\n [Q]uit" + TerminalTxtProcessing.textRepeater("\n", 14)+
																											"Your Powerup has expired.");
}

public static void tutorial(){
								ArrayList<String> testtxtarr = new ArrayList<String>();

								testtxtarr.add(TerminalTxtProcessing.terminalCenter("You can use gold to buy miners\n\n          ,-¯¯¯¯¯¯¯¯¯-_\n         / /\\ \\¯¯¯¯¯¯¯\n        / /  \\ \\\n       / /    \\ \\\n       ¯¯      \\ \\\n                \\ \\\n                 ¯¯\n"));
								testtxtarr.add(TerminalTxtProcessing.terminalCenter("You can use gold to buy engineers\n\n              /| |\\\n              \\¯¯¯/\n               | |\n               | |\n               | |\n               | |\n               | |\n               | |\n              /___\\\n              \\| |/"));
								testtxtarr.add(TerminalTxtProcessing.terminalCenter("You can also use gold to buy gamblers\n\n            /\\¯¯¯¯¯¯¯\\\n           /  \\  .    \\\n          /    \\    .  \\\n         /  .   \\       \\\n         \\      /¯¯¯----------\n          \\    /   |  .    .  |\n           \\  / .  |          |\n            \\/_____|  .    .  |\n                   |          |\n                    ----------"));
								testtxtarr.add(TerminalTxtProcessing.terminalCenter("And powerups!\n       ____\n      |    |\n      |    |\n      |    |\n \\¯¯¯¯     |\n  \\        |\n   \\    |¯¯\n    \\   |\n     \\  |\n      \\ |\n       \\|"));
								testtxtarr.add(TerminalTxtProcessing.terminalCenter("Press S + ENTER to see what the Shop has"));

								TerminalTxtProcessing.sleeperPrinter(testtxtarr, 3000, 1);
}

public static void helpUI(){
								System.out.println("[R]eturn\n\nMiners produce gold based on time.\n\nEngineers give your SPACE + ENTERs more gold.\n\nGamblers increase your chance of winning the lottery.\nYou have a 1/2000 base chance of winning the lottery every second.\n\nEarthquakes, thunderstorms and bankruptcies are also random events.\nEach has a 1/1000 chance per second of occuring.\n\nEarthquakes kill 1/4 of your miners at random.\nThunderstorms kill 1/4 of your engineers at random.\nBankruptcies kill 1/4 of your gamblers at random.\n\nA robbery has a 1/10000 chance of occuring per second.\nA robbery empties the bank of all your gold.\n\nHelpers can also be upgraded or leveled, increasing their gold output.\nGamblers cannot be leveled.\nThe cost of leveling a Worker is its level ^ 3.\nThe cost of upgrading is 10,000 gold.");
}

public static void storeUI(String minerStr, String engineerStr, String gamblerStr){
								System.out.println("[R]eturn\n\n[1] Buy a miner : " + minerStr +
																											"\n\n[2] Buy an engineer : " + engineerStr +
																											"\n\n[3] Buy a gambler : " + gamblerStr +
																											"\n\n[4] Dynamite (doubles miner production) : 400 gold\n\t30 sec duration : 1 min cooldown"+
																											"\n\n[5] Power Surge (doubles engineer production) : 400 gold\n\t30 sec duration : 1 min cooldown" +
																											"\n\n[6] Extra Chips (doubles gambler odds)  : 400 gold\n\t30 sec duration : 1 min cooldown" +
																											"\n\n[7] QAFee (doubles everything) : 2500 gold\n\t30 sec duration : 5 min cooldown" +
																											"\n\n[8] Level or Upgrade Helpers\n\n");
}

public static String inventoryUIM(int type, ArrayList<Miner> inArr){
								String x = "";
								int amtNL = 12;
								x = "[R]eturn\n\n[M]iners\n\n[E]ngineers\n\n[G]amblers\n\n" + "Name                    Level                    Gold Per Second         Upgrade\n\n";
								for (Miner h : inArr) {
																if (h.bought()) {
																								String[] lineArr = {h.name(), h.level() + "", (h.level() * 3) + "", h.upgrade() + "(" + h.upgradeType() + ")"};
																								x += TerminalTxtProcessing.lineCenter(1, lineArr);
																								x += "\n";
																								amtNL -= 1;
																}
								}
								x += TerminalTxtProcessing.textRepeater("\n", amtNL);
								return x;
}

public static String inventoryUIE(int type, ArrayList<Engineer> inArr){
								String x = "";
								int amtNL = 12;
								x = "[R]eturn\n\n[M]iners\n\n[E]ngineers\n\n[G]amblers\n\n" + "Name                    Level                    Gold Per Click          Upgrade\n\n";
								for (Engineer h : inArr) {
																if (h.bought()) {
																								String[] lineArr = {h.name(), h.level() + "", (h.level() * 3) + "", h.upgrade() + "(" + h.upgradeType() + ")"};
																								x += TerminalTxtProcessing.lineCenter(1, lineArr);
																								x += "\n";
																								amtNL -= 1;
																}
								}
								x += TerminalTxtProcessing.textRepeater("\n", amtNL);
								return x;
}

public static String inventoryUIG(int type, ArrayList<Gambler> inArr){
								String x = "";
								int amtNL = 12;
								x = "[R]eturn\n\n[M]iners\n\n[E]ngineers\n\n[G]amblers\n\n" + "Name                                                                     Upgrade\n\n";
								for (Helper h : inArr) {
																if (h.bought()) {
																								String[] lineArr = {h.name(), h.upgrade()};
																								x += TerminalTxtProcessing.lineCenter(2, lineArr);
																								x += "\n";
																								amtNL -= 1;
																}
								}
								x += TerminalTxtProcessing.textRepeater("\n", amtNL);
								return x;
}

public static void noGold(String minerStr, String engineerStr, String gamblerStr){
								storeUIMsg(minerStr, engineerStr, gamblerStr, "You do not have enough gold for that");
}

public static void storeUIMsg(String minerStr, String engineerStr, String gamblerStr, String msg){
								System.out.println("[R]eturn\n[1] Buy a miner : " + minerStr + "\n\n[2] Buy an engineer : " + engineerStr + "\n\n[3] Buy a gambler : " + gamblerStr + "\n\n[4] Dynamite (doubles miner production) : 400 gold\n\t30 sec duration : 1 min cooldown\n\n[5] Power Surge (doubles engineer production) : 400 gold\n\t30 sec duration : 1 min cooldown\n\n[6] Extra Chips (doubles gambler odds)  : 400 gold\n\t30 sec duration : 1 min cooldown\n\n[7] QAFee (doubles everything) : 2500 gold\n\t30 sec duration : 5 min cooldown\n\n[8] Level or Upgrade Helpers\n\n" + msg + "\n");
}

public static String improveUIM(ArrayList<Miner> inArr){
								String x = "";
								int amtNL = 12;
								x = "[R]eturn\n\n[M]iners\n\n[E]ngineers\n\n[G]amblers\n\n" + "Name                    Level\t              Upgrade\n\n";
								int n = 0; //use to keep track ofwhat keys to push
								for (Miner h : inArr) {
																if (h.bought()) {
																								String[] lineArr = {h.name(), "[" + n + "] " + h.level(), "[" + (n+1) + "] " + h.upgrade(), ""};
																								x += TerminalTxtProcessing.lineCenter(1, lineArr);
																								x += "\n";
																								amtNL -= 1;
																								n += 2;
																}
								}
								x += TerminalTxtProcessing.textRepeater("\n", amtNL);
								return x;
}

public static String improveUIE(ArrayList<Engineer> inArr){
								String x = "";
								int amtNL = 12;
								x = "[R]eturn\n\n[M]iners\n\n[E]ngineers\n\n[G]amblers\n\n" + "Name                    Level\t              Upgrade\n\n";
								int n = 0; //use to keep track ofwhat keys to push
								for (Engineer h : inArr) {
																if (h.bought()) {
																								String[] lineArr = {h.name(), "[" + n + "] " + h.level(), "[" + (n+1) + "] " + h.upgrade(), ""};
																								x += TerminalTxtProcessing.lineCenter(1, lineArr);
																								x += "\n";
																								amtNL -= 1;
																								n += 2;
																}
								}
								x += TerminalTxtProcessing.textRepeater("\n", amtNL);
								return x;
}

public static String improveUIG(ArrayList<Gambler> inArr){
								String x = "";
								int n = 1; // denote what the user is pressing
								int amtNL = 12;
								x = "[R]eturn\n\n[M]iners\n\n[E]ngineers\n\n[G]amblers\n\n" + "Name                                                                     Upgrade\n\n";
								for (Helper h : inArr) {
																if (h.bought()) {
																								String[] lineArr = {h.name(), "[" + n + "] " + h.upgrade()};
																								x += TerminalTxtProcessing.lineCenter(2, lineArr);
																								x += "\n";
																								amtNL -= 1;
																								n += 2;
																}
								}
								x += TerminalTxtProcessing.textRepeater("\n", amtNL);
								return x;
}
}//end class UserInterface
