import helper.*;

public class Store {

/*
 *  pre-conditions: - A Keyboard.readString() has been stored in a String var
 *                  - DataStorage has been instantiated
 * Note that "bill" is a placeholder
 */
public void buy(String input, DataStorage data){
        //For purchasing Miners
        if ( input.equals("1") ) {
                Miner bill;
                bill = new Miner("bill");
                data.addMiner(bill);
        }
        //For purchasing Engineers
        else if( input.equals("2") ) {
                Engineer bill;
                bill = new Engineer("bill");
                data.addEngineer(bill);
        }
        //For purchasing Gamblers
        else{
                Gambler bill;
                bill = new Gambler("bill");
                data.addGambler(bill);
        }
}

public void levelMiner( Miner m ){
        m.levelUp(); //indicates the Miner has leveled
        m.addMutate(5); //increases the rate
}

public void levelEngineer( Engineer e ){
        e.levelUp(); //indicates the Engineer has leveled
        e.addMutate(5); //increases the rate
}


public static void main(String[] args) {

}
}//end class Store
