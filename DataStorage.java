import java.util.ArrayList;
import helper.*;

public class DataStorage {
    
    // 2-D array with a list of helpers of that type, detailing their names, levels, upgrades, and upgrade type

    private ArrayList<String[]>  _miners;
    private ArrayList<String[]>  _engineers;
    private ArrayList<String[]>  _gamblers;

  
    public DataStorage(){
	_miners  = new ArrayList<String[]>();

	Miner s = new Miner("Steve", 30);
	Miner y = new Miner("Yosemite Sam", 75);
	Miner i = new Miner("Indiana Jones", 150);
	Miner w = new Miner("Waluigi", 300);
	Miner t = new Miner("Thorin Oakenshield", 750);

	this.addMiner(s);
	this.addMiner(y);
	this.addMiner(i);
	this.addMiner(w);
	this.addMiner(t);

	_engineers = new ArrayList<String[]>();

	Engineer b = new Engineer("Bob the Builder", 30);
	Engineer to = new Engineer("Torbjorn", 75);
	Engineer d = new Engineer("Dell Conagher", 150);
	Engineer l = new Engineer("Lucius Fox", 300);
	Engineer ts = new Engineer("Tony Stark", 750);

	this.addEngineer(b);
	this.addEngineer(to);
	this.addEngineer(d);
	this.addEngineer(l);
	this.addEngineer(ts);

	_gamblers = new ArrayList<String[]>();
    }
    
    // METHODS =============================================

    public static String toString(ArrayList<String[]> s) {
	String foo = " | Name \t Level \t Upgrade \t Gold |\n";
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
    /**
    public void expand(String[][] s) {
	String[][] temp = new String[s.length + 1] [4];
	for ( int row = 0; row < s.length ; row ++) {
            for ( int col = 0; col < s[row].length; col++)
                temp[row][col]= s[row][col];
	}
	s = temp; 
    }
    
    **/    
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
    
    public static String sortList(ArrayList<String[]> helper, int col) {
	String[][] names = new String[helper.size()][2];
	for (int x = 0; x < helper.size(); x ++ ) {
	    names[x][0] = x + "";
	    names[x][1] = helper.get(x)[col];
	}
	insertionSortV(names); 
	ArrayList<String[]>temp = new ArrayList<String[]>(helper.size());
	for (int y = 0; y < helper.size(); y++) {
	    int spot = Integer.parseInt(names[y][0]);
	    temp.add(y, helper.get(spot));
	}
	helper = temp;
	return toString(helper);
    }

    public static void insertionSortV( String[][] data )
    {
	for( int partition = 1; partition < data.length; partition++ ) {
	    for( int i = partition; i > 0; i-- ) {
		if (Character.isDigit(data[i][1].charAt(0))){
                    int first = Integer.parseInt(data[i-1][1]);
                    int second = Integer.parseInt(data[i][1]);
		    if ( second < first) {
			String[] temp = data[i];
			data[i] = data[i-1];
			data[i-1] = temp;
		    }
		    
		    else
			break;
		}
		
                else {
                    String first = data[i-1][1];
                    String second = data[i][1];
		    if (( second).compareTo( first ) < 0 ) {
			String[] temp = data[i];
			data[i] = data[i-1];
			data[i-1] = temp;
		    }

		    else
			break;
		}
		
            }
	}
    }//end insertionSortV

    public static void main(String[] args) {}
    
} //end class DataStorage
