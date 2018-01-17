import java.util.ArrayList;
import helper.Helper;
import helper.Miner;
import helper.Worker;
import helper.Engineer;
import helper.Gambler;
public class Events {

    public static DataStorage data = new DataStorage();
    
    public static boolean isUnfortunate( double curse) {
	if (Math.random() < (1.0 * curse )/100 )
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
		
		System.out.println("Take cover! An earthquake is happening! The fault lines have split apart, and an unlucky miner " + data.minerList().get(remove).name() +" has fallen in, never to be seen again. He no longer produces gold for you. If you would like to regain " + data.minerList().get(remove).name() + ", buy him again from the store. (Type [S] + [enter].)");
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
	    
	    System.out.println("Thunder and lightning, very very frightening! \n Due to the lack of lightning rods, a stray lightning bolt has struck down " + data.engineerList().get(remove).name() + ". He no longer produces gold for you. If you would like to regain " + data.engineerList().get(remove).name() + ", buy him again from the store. (Type [S] + [enter].)");
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
	
		System.out.println("Gamblers beware! Your casino, owned by Konald Strump, has been foreclosed. Many casino-goers are unhappy, including " + data.gamblerList().get(remove).name() +  ", who has sworn off your casino. If you would like to regain " + data.gamblerList().get(remove).name() + ", buy him again from the store. (Type [S] + [enter].)");
	    }
	}

    }

    public static void robbed() {
	if ( isUnfortunate(1) && isUnfortunate(1)) {
	    //if ( ( Math.random() < 1.0/1000) && ( Math.random() < 1.0/1000) ) {
	    Woo._gold = 0;

	    System.out.println("Uh-oh! A careless intern left your Swiss vaults open, and your rival company, Doofenshmirtz Evil Incorporated, has stolen your company secrets. Fortunately, all of your helpers have stayed with you despite the hardships. Your only solution is to continue accruing your gold, until you can get revenge on Mr. Doofenshmirtz...");
	}
    }

    public static void jackpot(double luck) {
	int won = 0;
	if ( isFortunate(luck) ) {
	    double lucky1 = Math.random() * 10;
	    int lucky2 = (int) (Math.random() * 1000);
	    won =  (int) ((Woo._gold * lucky1) + lucky2);
	    Woo._gold += won;
	

	System.out.println("I'm up all night to get lucky. \n It's your lucky day! Your great uncle, on your mother's side, has died with no relatives to pass his inheritance to. The rest of his money, "+ won + " gold, was left to \"His favorite relative\" in his will.");
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

