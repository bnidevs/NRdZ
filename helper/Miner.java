package helper;

// Helper that produces gold per second
public class Miner extends Worker {

private int _additionGoldPS;   //addition bonus received from upgrades
private double _multiGoldPS;   //multiplier bonus received from upgrades

public Miner(){
        super();
        _additionGoldPS = 0;
        _multiGoldPS = 1;
}

public Miner(String name){ //overloaded consturctor that gives naming functionality
        super(name);
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

public static void main(String[] args) {
        /* test code ---------------------------
         * Miner maggie = new Miner("maggie");
         * System.out.println( maggie.level() );
         */

}
}//end class Miner