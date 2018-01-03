public class Helper {

protected String _name;
protected int _level;
protected String _upgrade; //upgrades cap at tier III

protected int _baseGold; //base value of the gold
protected int _additionGold = 0; //addition bonus recieved from upgrades
protected int _multiGold = 1; //multiplier bonus recieved from upgrades
protected int _totalGold = 0; //overall gold collected by this Helper in this cycle

public Helper(){ //initialize everything
        _level = 1;
        _upgrade = "0";
        _baseGold = 1;
        _additionGold = 0;
        _multiGold = 1;
        _totalGold = 0;
}

public String name(){ //accessor for name
        return _name;
}

public int level(){ //accessor for level
        return _level;
}

public String upgrade(){ //accessor for upgrade tier
        return _upgrade;
}

public void levelUp(){ //level up
        _level++;
}

//Note: Individual gold increases will be handled in the subclasses
public void upgradeUp(){ //level up for upgrade tiers
        if ( upgrade().equals("0") ) { //if there are no upgrades, add one I
                _upgrade = "I";
                return;
        }
        _upgrade += "I"; //add another I at the end
}

public Object[] stats(){ //returns the stats of a Helper in a 1-D array
        Object[] stats = {name(), level(), upgrade()};
        return stats;
}

public void produceGold(){ //the Helper produces gold
//to be coded --> dependent on BN's implementation
//will it be called immediately after the appropriate key is pushed?
}

public static void main(String[] args) {
        //testing code
        Helper max = new Helper();
        max.upgradeUp();
        max.upgradeUp();
        max.stats(); //for checking to see if the stats actually works
}

}
