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

}//end class Engineer
