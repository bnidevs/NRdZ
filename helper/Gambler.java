package helper;

public class Gambler extends Helper {

private double _luck = 0.0005;

public static void main(String[] args){
};

public Gambler(){
        super();
}

public Gambler(String name, int cost){ //overloaded consturctor that gives naming functionality
        super(name, cost, 0);
}

public double luck(){ //accessor for luck
        return _luck;
}

/* For upgrades for Workers:
 * - All upgrades modify the luck variable by 0.0005 for that particular Gambler, and is incremented by 0.0005
 * - The luck maxes out at 0.002
 */
public void upgradeEffect(){
        _luck += 0.0005;
        upgradeUp();
}

}//end class Gambler
