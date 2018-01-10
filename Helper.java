public abstract class Helper {

protected String _name;
protected int _level;
protected String _upgrade; //upgrades cap at tier III

public Helper(){ //initialize everything
        _level = 1;
        _upgrade = "0";
}

public Helper(String name){
        this();
        _name = name;
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

public void upgradeUp(){ //level up for upgrade tiers
        if ( upgrade().equals("0") ) { //if there are no upgrades, add one I
                _upgrade = "I";
                return;
        }
        _upgrade += "I"; //add another I at the end
}

public String[] stats(){ //returns the stats of a Helper in a 1-D array
        String[] stats = {name(), Integer.toString( level() ), upgrade()};
        return stats;
}

public static void main(String[] args) {
        //testing code
        //Helper max = new Helper();
        //max.upgradeUp();
        //max.upgradeUp();
        //max.stats(); //for checking to see if the stats actually works
}

}//end class Helper
