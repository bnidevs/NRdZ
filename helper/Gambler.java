package helper;

public class Gambler extends Helper {

private final double _luck = 0.0005;

public static void main(String[] args){};

public Gambler(){
        super();
}

public Gambler(String name, int cost){ //overloaded consturctor that gives naming functionality
        super(name, cost, 0);
}

public double luck(){ //accessor for luck
        return _luck;
}

}//end class Gambler
