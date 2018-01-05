//A Helper that porduces gold upon key press
public class Engineer extends Helper {

private int _additionGoldPKP;   //addition bonus received from upgrades
private double _multiGoldPKP;   //multiplier bonus received from upgrades

public Engineer(){   //set level to 1 and upgrade to 0
        super();
        _additionGoldPKP = 0;
        _multiGoldPKP = 1;
}

public Engineer(String name){ //overloaded consturctor that gives naming functionality
        this();
        _name = name;
}

public int additionGold(){ //accessor the addition variable
        return _additionGoldPKP;
}

public double multiGold(){ //accessor for the multiplier variable
        return _multiGoldPKP;
}

}//end class Engineer
