import java.util.ArrayList;
import helper.Helper;
import helper.Miner;
import helper.Worker;
import helper.Engineer;
import helper.Gambler;
import terminalTxt.TerminalTxtProcessing;

public class Events {

    public static DataStorage data = new DataStorage();
    
    public static boolean isUnfortunate( double curse) {
	if (Math.random() < (1.0 * curse )/50 )
	    return true;
	return false;
    }
    
    public static boolean isFortunate( double luck ) {
	if (Math.random() < luck)
	    return true;
	return false;
    }

    public static void earthquake() {
	ArrayList<Miner> have = new ArrayList<Miner>();
	for (int i = 0; i < data.minerList().size(); i++ ) {
	    if (data.minerList().get(i).bought())
		have.add(data.minerList().get(i));
	}
	if (have.size() > 0 ) {
	    int remove = (int) (Math.random() * have.size());
	    if ( isUnfortunate (data.minerList().size() ) ) {
		//if ( ( Math.random() < (1.0 * data.minerList().size() ) /1000) ) {
		data.minerList().get(remove).kill();
		
		System.out.println("An earthquake shakes the planet to its very core.\nAlthough you have geared your miners to the brim, " + data.minerList().get(remove).name() + " has died.\nYou can buy " + data.minerList().get(remove).name() + " again." + TerminalTxtProcessing.textRepeater("\n", 20));
	    }
	}
    }

    public static void thunderstorm() {
	ArrayList<Engineer> have = new ArrayList<Engineer>();
        for (int i = 0; i < data.engineerList().size(); i++ ) {
            if (data.engineerList().get(i).bought())
                have.add(data.engineerList().get(i));
	}

	if (have.size() > 0 ) {
	    int remove = (int) (Math.random() * have.size());
	    if ( isUnfortunate ( 1) ) {
		//if ( Math.random() < 1.0/1000 ) {
            data.engineerList().get(remove).kill();
	    
	    System.out.println("A cold front becomes the bearer of bad news for your engineers.\n Lightning arcs through the sky and strikes " + data.engineerList().get(remove).name() + ".\nYou can buy " + data.engineerList().get(remove).name() + " again." + TerminalTxtProcessing.textRepeater("\n", 20));
	    }
	}
    }

    public static void bankruptcy() {
	
	ArrayList<Gambler> have = new ArrayList<Gambler>();
        for (int i = 0; i < data.gamblerList().size(); i++ ) {
            if (data.gamblerList().get(i).bought())
                have.add(data.gamblerList().get(i));
        }

	if (have.size() > 0 ) {
	    int remove = (int) (Math.random() * have.size());
	    if ( isUnfortunate (1)) {
	    //if (Math.random() < 1.0/1000 ) {
		data.gamblerList().get(remove).kill();
	
		System.out.println("Quite a serendipitous day.\n" + data.gamblerList().get(remove).name() +  " has been caught cheating at the local casino.\nHe is deprived of all his chips at the moment.\nYou can buy " + data.gamblerList().get(remove).name() + " again." + TerminalTxtProcessing.textRepeater("\n", 19));
	    }
	}

    }

    public static void robbed() {
	if ( isUnfortunate(1) && isUnfortunate(1)) {
	    //if ( ( Math.random() < 1.0/1000) && ( Math.random() < 1.0/1000) ) {
	    Woo._gold = 0;

	    System.out.println("Oh no! Your bank vault is empty!\nUntil the police find out who did it, you'll have to make do with nothing." + TerminalTxtProcessing.textRepeater("\n", 21));
	}
    }

    public static void jackpot(double luck) {
	int won = 0;
	if ( isFortunate(luck) ) {
	    double lucky1 = Math.random() * 10;
	    int lucky2 = (int) (Math.random() * 1000);
	    won =  (int) ((Woo._gold * lucky1) + lucky2);
	    Woo._gold += won;
	

	System.out.println("One of your gamblers actually won the lottery!\nDon't worry, it's just a hobby.\nBut he has decided to give you a large portion of it!\n" + won + " gold to be exact!" + TerminalTxtProcessing.textRepeater("\n", 19));
	}    
    }

    public static void allLuck( double luck) {
	jackpot(luck);
	bankruptcy();
	earthquake();
	thunderstorm();
	robbed(); 
    }
    
}//end class Events

