//A Helper that porduces gold upon key press
public class Engineer extends Helper {

private int _baseGoldPKP;   //base value of the gold
private int _additionGoldPKP;   //addition bonus recieved from upgrades
private int _multiGoldPKP;   //multiplier bonus recieved from upgrades

public Engineer(){   //set level to 1 and upgrade to 0
        super();
        _baseGoldPKP = 1;
        _additionGoldPKP = 0;
        _multiGoldPKP = 1;
}

public Engineer(String name){ //overloaded consturctor that gives naming functionality
        this();
        _name = name;
}

}//end class Engineer
