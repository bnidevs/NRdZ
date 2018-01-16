package helper;

// Helper that produces gold per second
public class Miner extends Worker {

private int _additionGoldPS;   //addition bonus received from upgrades
private double _multiGoldPS;   //multiplier bonus received from upgrades

public Miner(){
        super();
        _additionGoldPS = _level * base;
        _multiGoldPS = 0;
}

public Miner(String name, int cost, int level){ //overloaded consturctor that gives naming functionality
        super(name, cost, level);
        _additionGoldPS = level * base;
        _multiGoldPS = 0;
}

public int additionGold(){ //accessor the addition variable
        return _additionGoldPS;
}

public double multiGold(){ //accessor for the multiplier variable
        return _multiGoldPS;
}

public void addMutate( int addend ){ //modifies the addition variable
        _additionGoldPS += addend;
}

public void multiMutate( int multi){ //modifies the multi variable
        _multiGoldPS += multi;
}

/* For upgrades for Workers:
 * - All upgrades for addition start off at 1, and are incremented by 2 for a maximum of 5
 * - All upgrades for multi start off at 0.05, and are incremented bt 0.05 for a max of 0.15
 */

//Determines the initial upgrades based on the String input
public void initialUpgrade(String str){
        if ( str.equals("add") ) {
                _additionGoldPS += 1;
                _upgradeType = str;
        }
        if ( str.equals("multi") ) {
                _multiGoldPS = 0.05;
                _upgradeType = "multi";
        }
        upgradeUp();
}

public void upgradeEffect(){
        if ( _upgradeType.equals("add") )
                _additionGoldPS += 2;
        if ( _upgradeType.equals("multi") )
                _multiGoldPS += 0.05;
        upgradeUp();
}

public static void main(String[] args) {
        /* test code ---------------------------
         * Miner maggie = new Miner("maggie");
         * System.out.println( maggie.level() );
         */

}
}//end class Miner
