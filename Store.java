import helper.*;

public class Store {

/*
 *  pre-conditions: - A Keyboard.readString() has been stored in a String var
 *                  - DataStorage has been instantiated
 * Note that "bill" is a placeholder
 */

public void levelMiner( Miner m ){
        m.levelUp(); //indicates the Miner has leveled
        m.addMutate(5); //increases the rate
}

public void levelEngineer( Engineer e ){
        e.levelUp(); //indicates the Engineer has leveled
        e.addMutate(5); //increases the rate
}

/*
 *  pre-conditions: - A Keyboard.readString() has been stored in a String var
 *                  - DataStorage has been instantiated
 *
 */
public void upgradeMiner( String input, Miner m ){ //one of two paths: multi or add
        //addition path
        if ( input.equals("add") ) {

        }
        //multi path
}

public void upgradeEngineer( String input, Engineer e ){

}

public void upgradeGambler( String input, Gambler g ){

}

public static void main(String[] args) {
        //testing code
        Store store = new Store();
}
}//end class Store
