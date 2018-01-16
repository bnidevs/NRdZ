package helper;

//A Helper that porduces gold upon key press
public class Engineer extends Worker {

private int _additionGoldPKP;   //addition bonus received from upgrades
private double _multiGoldPKP;   //multiplier bonus received from upgrades

public Engineer(){   //set level to 1 and upgrade to 0
        super();
        _additionGoldPKP = _level * base;
        _multiGoldPKP = 0;
}

public Engineer(String name, int cost, int level){ //overloaded consturctor that gives naming functionality
        super(name, cost, level);
        _additionGoldPKP = level * base;
        _multiGoldPKP = 0;
}

public int additionGold(){ //accessor the addition variable
        return _additionGoldPKP;
}

public double multiGold(){ //accessor for the multiplier variable
        return _multiGoldPKP;
}

public void addMutate( int addend ){ //modifies the addition variable
        _additionGoldPKP += addend;
}

public void multiMutate( int multi){ //modifies the multi variable
        _multiGoldPKP += multi;
}

/* For upgrades for Workers:
 * - All upgrades for addition start off at 1, and are incremented by 2 for a maximum of 5
 * - All upgrades for multi start off at 0.05, and are incremented bt 0.05 for a max of 0.15
 */

//Determines the initial upgrades based on the String input
public void initialUpgrade(String str){
        if ( str.equals("add") ) {
                _additionGoldPKP += 1;
        }
        if ( str.equals("multi") ) {
                _multiGoldPKP = 0.05;
        }
        upgradeUp();
}

public void upgradeEffect(){
        if ( _upgradeType.equals("add") )
                _additionGoldPKP += 2;
        if ( _upgradeType.equals("multi") )
                _multiGoldPKP += 0.05;
        upgradeUp();
}

}//end class Engineer
