// Helper that produces gold per second
public class Miner extends Helper {

private int _additionGoldPS;   //addition bonus received from upgrades
private double _multiGoldPS;   //multiplier bonus received from upgrades

public Miner(){
        super();
        _additionGoldPS = 0;
        _multiGoldPS = 1;
}

public Miner(String name){ //overloaded consturctor that gives naming functionality
        this();
        _name = name;
}

public int additionGold(){ //accessor the addition variable
        return _additionGoldPS;
}

public double multiGold(){ //accessor for the multiplier variable
        return _multiGoldPS;
}

}//end class Miner
