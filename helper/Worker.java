package helper;

public abstract class Worker extends Helper {

protected final int base = 3;

protected String upgradeType;

public Worker(){
        super();
}

public Worker(String name, int cost, int level){ //calls the overloaded constructor of Helper
        super(name, cost, level);
}

//Note: Individual gold increases will be handled in the subclasses
public void levelUp(){ //level up
        _level++;
}

public abstract int additionGold(); //accessor for the addition variable

public abstract double multiGold(); //accessor for the multiplier variable

public abstract void addMutate( int addend ); //modifies the addition variable

public abstract void multiMutate( int multi); //modifies the multi variable

//details the actual upgrade for the class
public void upgradeEffect(){
}
}
