import java.util.ArrayList;
import helper.*;

public class DataStorage {
    
    // 2-D array with a list of helpers of that type, detailing their names, levels, upgrades, and upgrade type

    private ArrayList<String[]>  _miners;
    private ArrayList<String[]>  _engineers;
    private ArrayList<String[]>  _gamblers;

  
    public DataStorage(){
	_miners  = new ArrayList<String[]>(1 );
	_engineers = new ArrayList<String[]>(1);
	_gamblers = new ArrayList<String[]>(1);
    }
    
    // METHODS =============================================

    public String toString(ArrayList<String[]> s) {
	String foo = " | Name \t Level \t Upgrade Tier \t Gold |";
	for (int i = 0; i < s.size(); i ++ ) {
	    foo += " | ";
	    for (int j = 0; j < s.get(i).length; j++ ) {
		foo += s.get(i)[j] + "\t";
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
	String[] lastrow =  {m.name(), m.level() + "", m.upgrade(), 1 * m.multiGold() + m.additionGold() + ""};
	_miners.add(lastrow);
	
    }

    public void addEngineer(Engineer e) {
	String[] lastrow = {e.name(), e.level() + "", e.upgrade(), 1 * e.multiGold() + e.additionGold() + ""};
	_engineers.add(lastrow);
    }

    public void addGambler(Gambler g) {
        String[] lastrow = {g.name(), g.level() + "", g.upgrade(), 0 + ""} ;
        _gamblers.add(lastrow);
    }

    public String sortList(ArrayList<String[]> helper, int col) {
	String[][] names = new String[helper.size()][2];
	for (int x = 0; x < helper.size(); x ++ ) {
	    names[x][0] = x + "";
	    names[x][1] = helper.get(x)[col];
	}
	insertionSortV(names); 
	ArrayList<String[]>temp = new ArrayList<String[]>(helper.size());
	for (int y = 0; y < temp.size(); y++) {
	    int spot = Integer.parseInt(names[y][0]);
	    temp.set(y,  helper.get(spot));
	}
	helper = temp;
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

    public static void main(String[] args) {
	


    }
    
} //end class DataStorage
