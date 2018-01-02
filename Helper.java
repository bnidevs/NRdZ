public class Helper {

protected String _name;
protected int _level;
protected String _upgrade; //upgrades cap at tier III

public Helper(){//default constructor
        _level = 1;
        _upgrade = "0";
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

public void upgradeUp(){ //level up for upgrade tiers
        if ( upgrade().equals("0") ) { //if there are no upgrades, add one I
                _upgrade = "I";
                return;
        }
        _upgrade += "I"; //add another I at the end
}

public Object[] stats(){ //returns the stats of a Helper
        Object[] stats = {name(), level(), upgrade()};
        return stats;
}

public static void main(String[] args) {
        //testing code
        Helper max = new Helper();
        max.upgradeUp();
        max.upgradeUp();
        max.stats(); //for checking to see if the stats actually works
}

}
