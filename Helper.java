public class Helper {

protected String _name;
protected int _level;
protected String _upgrade; //upgrades cap at tier III

public Helper(){//default constructor
        _level = 1;
        _upgrade = "0";
}

public String toString(){
        return upgrade();
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

/*==============TEST CODE========
   public static void main(String[] args) {
          Helper max = new Helper();
          max.upgradeUp();
          max.upgradeUp();
          System.out.println(max);
   }
   =========================*/
}
