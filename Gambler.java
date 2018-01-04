public class Gambler extends Helper {

private int _luck;   //the amount of luck the lottery is increased by
private final int _glevel;

public Gambler(){
        super();
        _luck = 0;
        _glevel = _level;
}

public Gambler(String name){ //overloaded consturctor that gives naming functionality
        this();
        _name = name;
}

public int level(){ //overwritten accessor for level
        return _glevel;
}

}//end class Gambler
