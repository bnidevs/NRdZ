public abstract class Helper {

protected String _name;
protected int _level;
protected String _upgrade;
protected final String[] tier = { "I", "II", "III"}; //list of tiers



public String name(){ //accessor for name
        return _name;
}

public int level(){ //accessor for level
        return _level;
}

public String upgradeLevel(){ //accessor for upgrade tier
        return _upgrade;
}

public void levelUp(){ //level up
        _level++;
}

}
