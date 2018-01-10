public abstract class Worker extends Helper {
public Worker(){
        super();
}

public Worker(String name){ //calls the overloaded constructor of Helper
        super(name);
}

//Note: Individual gold increases will be handled in the subclasses
public void levelUp(){ //level up
        _level++;
}

public abstract int additionGold(); //accessor for the addition variable

public abstract double multiGold(); //accessor for the multiplier variable

public abstract void addMutate( int addend ); //modifies the addition variable

public abstract void multiMutate( int multi); //modifies the multi variable
}
