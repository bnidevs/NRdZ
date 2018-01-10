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

/***
   public void buyMiner(DataStorage d){ //creates new Miner object and appends it to the Datastorage Array
        Miner bill = new Miner("bill");
        d.addMiner("bill");
   }

   public void buyEngineer(DataStorage d){ //creates a new Engineer object and appends to Datastorage array
        Engineer bill = new Engineer("bill");
        d.addEngineer("bill");
   }

   public void buyGambler(){

   }
 ***/

public static void main(String[] args) {

}
}//end class Store
