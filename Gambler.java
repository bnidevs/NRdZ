public class Gambler extends Helper {

private int _luck;   //the amount of luck the lottery is increased by
private final int _glevel;

public Gambler(){
        super();
        _glevel = _level;
}

public int level(){ //overwritten accessor for level
        return _glevel;
}

}//end class Gambler
