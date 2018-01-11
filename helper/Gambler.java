package helper;

public class Gambler extends Helper {

private double _luck;   //the amount of luck the lottery is increased by
private final int _glevel;

public Gambler(){
        super();
        _luck = 0;
        _glevel = _level;
}

public Gambler(String name, int cost){ //overloaded consturctor that gives naming functionality
        super(name, cost);
        _luck = 0;
        _glevel = _level;
}

public int level(){ //overwritten accessor for level
        return _glevel;
}

public void changeLuck( double amt ){ //modify the luck
        _luck += amt;
}

public double luck(){ //accessor for luck
        return _luck;
}

}//end class Gambler
