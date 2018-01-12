package helper;

public class Gambler extends Helper {

private final double _luck = 0.0005;

public Gambler(){
        super();
        _luck = 0;
}

public Gambler(String name, int cost){ //overloaded consturctor that gives naming functionality
        super(name, cost, 0);
}

public double luck(){ //accessor for luck
        return _luck;
}

}//end class Gambler
