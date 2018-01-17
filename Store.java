import helper.Miner;
import helper.Engineer;
import helper.Gambler;
import cs1.Keyboard;

public class Store {

/*
 *  pre-conditions: - A Keyboard.readString() has been stored in a String var
 *                  - DataStorage has been instantiated
 * Note that "bill" is a placeholder
 */

public static void levelMiner( Miner m ){
        Woo._gold -= Math.pow(m.level(), 3); //deduct the current level ^ 3 from gold
        m.levelUp(); //indicates the Miner has leveled
        m.addMutate(5); //increases the rate
}

public static void levelEngineer( Engineer e ){
        Woo._gold -= Math.pow(e.level(), 3); //deduct the current level ^ 3 from gold
        e.levelUp(); //indicates the Engineer has leveled
        e.addMutate(5); //increases the rate
}

/*  pre-conditions: - DataStorage has been instantiated
 *                  - The user knows what Upgrades are
 *
 *  post-conditions: - The Helper entered now has an Upgrade
 */
public static void upgradeMiner( Miner m ){
        if ( m.upgrade().equals("0") ) {
                System.out.print("Choose what upgrade path ");
                System.out.print( m.name() + " " );
                System.out.println("will take!");
                System.out.println( "To select one, type either \"add\" or \"multi\"!");
                String input = Keyboard.readString();
                Woo._gold -= 10000; //flat rate of 10000 gold deducted
                m.initialUpgrade(input);
                return;
        }
        Woo._gold -= 10000;
        m.upgradeEffect();
}

public static void upgradeEngineer( Engineer e ){
        if ( e.upgrade().equals("0") ) {
                System.out.print("Choose what upgrade path ");
                System.out.print( e.name() + " " );
                System.out.println("will take!");
                System.out.println( "To select one, type either \"add\" or \"multi\"!");
                String input = Keyboard.readString();
                Woo._gold -= 10000;
                e.initialUpgrade(input);
                return;
        }
        Woo._gold -= 10000;
        e.upgradeEffect();
}

//no input is needed, since the Gambler is not producing
public static void upgradeGambler( Gambler g ){
        Woo._gold -= 10000;
        g.upgradeEffect();
}

public static void main(String[] args) {
        //testing code
        Store store = new Store();
}
}//end class Store
