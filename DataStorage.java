public class DataStorage {

    // 2-D array with a list of helpers of that type, detailing their names, levels, upgrades, and upgrade type

    private String[][] _miners;
    private String[][] _engineers;
    private String[][] _gamblers;

    
    public DataStorage(){
	_miners = new String[1][4];
	_engineers = new String[1][4];
	_gamblers = new String[1][4];
    }
    
    // METHODS =============================================

    public String toString(String[][] s) {
	String foo = " | Name \t Level \t Upgrade Tier \t Gold |";
	for (int i = 0; i < s.length; i ++ ) {
	    foo += " | ";
	    for (int j = 0; j < s[i].length; j++ ) {
		foo += s[i][j] + "\t";
	    }
	    foo += "|\n";
	}
	return foo;

    }
    public String minerList() {
	return toString(_miners);
    }


    public String engineerList() {
	return toString(_engineers);
    }

    public String gamblerList(){
	return toString(_gamblers); 
    }

    public void expand(String[][] s) {
	String[][] temp = new String[s.length + 1] [4];
	for ( int row = 0; row < s.length ; row ++) {
            for ( int col = 0; col < s[row].length; col++)
                temp[row][col]= s[row][col];
	}
	s = temp; 
    }
    public void addMiner(Miner m) {
	expand(_miners);
	String[] lastrow =  {m._name, m._level + "", m._upgrade, 1 * m.multiGold() + m.additionGold() + ""};
	_miners[_miners.length - 1] = lastrow;
	
    }

    public void addEngineer(Engineer e) {
	expand(_engineers);
	String[] lastrow = {e._name, e._level + "", e._upgrade, 1 * e.multiGold() + e.additionGold() + ""};
	_engineers[_engineers.length - 1] = lastrow;
    }

    public void addGambler(Gambler g) {
	expand(_gamblers);
        String[] lastrow = {g._name, g._level + "", g._upgrade, 0 + ""} ;
        _gamblers[_gamblers.length - 1] = lastrow;
    }

    public String sortList(String[][] helper, int col) {
	String[][] names = new String[helper.length][2];
	for (int x = 0; x < helper.length; x ++ ) {
	    names[x][0] = x + "";
	    names[x][1] = helper[x][col];
	}
	insertionSortV(names); 
	String[][]temp = new String[helper.length][helper[0].length];
	for (int y = 0; y < temp.length; y++) {
	    int spot = Integer.parseInt(names[y][0]);
	    temp[y] = helper[spot];
	}
	return toString(helper);
    }

    public static void insertionSortV( String[][] data )
    {
	for( int partition = 1; partition < data.length; partition++ ) {
	    for( int i = partition; i > 0; i-- ) {
		if (( data[i][1]).compareTo( data[i-1][1] ) < 0 ) {
		    String[] temp = data[i];
		    data[i] = data[i-1];
		    data[i-1] = temp;
		}
		
		else
		    break;
            }
	}
    }//end insertionSortV           
} //end class DataStorage
