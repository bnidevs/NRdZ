// Helper that produces gold per second
public class Miner extends Helper {

private int _baseGoldPS;   //base value of the gold
private int _additionGoldPS;   //addition bonus recieved from upgrades
private int _multiGoldPS;   //multiplier bonus recieved from upgrades

public Miner(){
        super();
        _baseGoldPS = 1;
        _additionGoldPS = 0;
        _multiGoldPS = 1;
}

public Miner(String name){ //overloaded consturctor that gives naming functionality
        this();
        _name = name;
}

}//end class Miner
