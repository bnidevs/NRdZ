import java.util.ArrayList;
import helper.*;

public class DataStorage {
    
    // 2-D array with a list of helpers of that type, detailing their names, levels, upgrades, and upgrade type

    private ArrayList _miners;
    private ArrayList _engineers;
    private ArrayList _gamblers;

  
    public DataStorage(){
	_miners  = new ArrayList();

	Miner s = new Miner("Steve", 30, 1);
	Miner y = new Miner("Yosemite Sam", 75, 10);
	Miner i = new Miner("Indiana Jones", 150, 20);
	Miner w = new Miner("Waluigi", 300, 30);
	Miner t = new Miner("Thorin Oakenshield", 750, 50);

	_miners.add(s);
	_miners.add(y);
	_miners.add(i);
	_miners.add(w);
	_miners.add(t);

	_engineers = new ArrayList();

	Engineer b = new Engineer("Bob the Builder", 30, 1);
	Engineer to = new Engineer("Torbjorn", 75, 10);
	Engineer d = new Engineer("Dell Conagher", 150, 20);
	Engineer l = new Engineer("Lucius Fox", 300, 30);
	Engineer ts = new Engineer("Tony Stark", 750, 50);

	_engineers.add(b);
	_engineers.add(to);
	_engineers.add(d);
	_engineers.add(l);
	_engineers.add(ts);

	_gamblers = new ArrayList<String[]>();

	Gambler m = new Gambler("Mr. Monopoly", 30);
	Gambler a = new Gambler("Alan Garner", 75);
	Gambler j = new Gambler("James Bond", 150);
	Gambler da = new Gambler("Danny Ocean", 300);
	Gambler li = new Gambler("Libratus", 750);

	_gamblers.add(m);
	_gamblers.add(a);
	_gamblers.add(j);
	_gamblers.add(da);
	_gamblers.add(li);

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
