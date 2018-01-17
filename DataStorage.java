import java.util.ArrayList;
import helper.Helper;
import helper.Miner;
import helper.Worker;
import helper.Engineer;
import helper.Gambler;

public class DataStorage {
    
    // 2-D array with a list of helpers of that type, detailing their names, levels, upgrades, and upgrade type

    private ArrayList<Helper> _miners;
    private ArrayList<Helper> _engineers;
    private ArrayList<Helper> _gamblers;

  
    public DataStorage(){
	_miners  = new ArrayList<Miner>();

	Miner s = new Miner("Steve", 50, 1);
	Miner y = new Miner("Yosemite Sam", 183, 10);
	Miner i = new Miner("Indiana Jones", 2020, 20);
	Miner w = new Miner("Waluigi", 1000, 30);
	Miner t = new Miner("Thorin Oakenshield", 9999, 50);

	_miners.add(s);
	_miners.add(y);
	_miners.add(i);
	_miners.add(w);
	_miners.add(t);

	_engineers = new ArrayList<Engineer>();

	Engineer b = new Engineer("Bob the Builder", 30, 1);
	Engineer to = new Engineer("Torbjörn", 75, 10);
	Engineer d = new Engineer("Dell Conagher", 150, 20);
	Engineer l = new Engineer("Lucius Fox", 300, 30);
	Engineer ts = new Engineer("Tony Stark", 750, 50);

	_engineers.add(b);
	_engineers.add(to);
	_engineers.add(d);
	_engineers.add(l);
	_engineers.add(ts);

	_gamblers = new ArrayList<Gambler>();

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
    // ACCESSORS =============================================      
    public ArrayList<Helper> minerList(){
	   return _miners;
    }

    public ArrayList<Helper> engineerList(){
        return _engineers;
    }
    
    public ArrayList<Helper> gamblerList(){
        return _gamblers;
    }

    public void minerEdit(ArrayList<Miner> m){
        _miners = m;
    }

    public void engineerEdit(ArrayList<Engineer> e){
        _engineers = e;
    }

    public void gamblerEdit(ArrayList<Gambler> g){
        _gamblers = g;
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

	public Helper firstUnbought(int helperType){
    	if(helperType == 1){
    		for(int i = 0; i < _miners.size(); i++){
    			if(!_miners.get(i).bought()){
    				return _miners.get(i);
    			}
    		}
    	}else if(helperType == 2){
    		for(int i = 0; i < _engineers.size(); i++){
    			if(!_engineers.get(i).bought()){
    				return _engineers.get(i);
    			}
    		}
    	}else{
    		for(int i = 0; i < _gamblers.size(); i++){
    			if(!_gamblers.get(i).bought()){
    				return _gamblers.get(i);
    			}
    		}
    	}
    	return null;
    }

    public static String strCreate(int type, Helper x){
    	if(x instanceof Miner || x instanceof Engineer){
    		return (x.name() + " ; Cost: " + x.cost() + " ; Level: " + x.level());
    	}else if(x instanceof Gambler){
    		return (x.name() + " ; Cost: " + x.cost() + " ; Level: " + (x.level() + 1));
    	}else{
            if (type == 1){
                return "All miners have been bought";
            }else if (type == 2){
                return "All engineers have been bought";
            }else{
                return "All gamblers have been bought";
            }
        }
    }

    public int firstUnboughtCost(int helperType){
    	if(firstUnbought(helperType) == null){
    		return -1;
    	}else{
    		return (firstUnbought(helperType).cost());
    	}
    }

    public int buy(int helperType){
    	int x;
    	if(helperType == 1){
    		if(firstUnbought(1) != null){
    			x = firstUnbought(1).cost();
    			firstUnbought(1).buy();
    		}else{
    			x = -1;
    		}
    		return x;
    	}else if(helperType == 2){
    		if(firstUnbought(2) != null){
    			x = firstUnbought(2).cost();
    			firstUnbought(2).buy();
    		}else{
    			x = -1;
    		}
    	}else{
    		if(firstUnbought(3) != null){
    			x = firstUnbought(3).cost();
    			firstUnbought(3).buy();
    		}else{
    			x = -1;
    		}
    	}
    	return x;
    }

    public ArrayList<Double> goldProductionUpdate(){
    	ArrayList<Double> rtrnArr = new ArrayList<Double>();
    	for(int i = 0; i < 5; i++){
    		rtrnArr.add(0.0);
    	}
    	for(int i = 0; i < _miners.size(); i++){
    		if(_miners.get(i).bought()){
    			rtrnArr.set(0,rtrnArr.get(0) + _miners.get(i).additionGold());
    			rtrnArr.set(1,rtrnArr.get(1) + _miners.get(i).multiGold());
    		}
    	}
    	for(int i = 0; i < _engineers.size(); i++){
    		if(_engineers.get(i).bought()){
    			rtrnArr.set(2,rtrnArr.get(2) + _engineers.get(i).additionGold());
    			rtrnArr.set(3,rtrnArr.get(3) + _engineers.get(i).multiGold());
    		}
    	}
    	for(int i = 0; i < _gamblers.size(); i++){
    		if(_gamblers.get(i).bought()){
    			rtrnArr.set(4,rtrnArr.get(4) + _gamblers.get(i).luck());
    		}
    	}
    	return rtrnArr;
    }
    
    public static ArrayList<Miner> sortListM(ArrayList<Miner> minerArr, int col) {
    	String[][] store = new String[minerArr.size()][2];
    	for (int x = 0; x < minerArr.size(); x ++ ) {
    	    store[x][0] = x + "";
    	    store[x][1] = minerArr.get(x).stats()[col];
    	}
	   insertionSortV(store); 
	   ArrayList<Miner>temp = new ArrayList<Miner>(minerArr.size());
    	for (int y = 0; y < minerArr.size(); y++) {
    	    int spot = Integer.parseInt(store[y][0]);
    	    temp.add(y, minerArr.get(spot));
    	}
        return temp;
    }

    public static ArrayList<Engineer> sortListE(ArrayList<Engineer> engArr, int col) {
        String[][] store = new String[engArr.size()][2];
        for (int x = 0; x < engArr.size(); x ++ ) {
            store[x][0] = x + "";
            store[x][1] = engArr.get(x).stats()[col];
        }
       insertionSortV(store); 
       ArrayList<Engineer>temp = new ArrayList<Engineer>(engArr.size());
        for (int y = 0; y < engArr.size(); y++) {
            int spot = Integer.parseInt(store[y][0]);
            temp.add(y, engArr.get(spot));
        }
        return temp;
    }

    public static ArrayList<Gambler> sortListG(ArrayList<Gambler> gamArr, int col) {
        String[][] store = new String[gamArr.size()][2];
        for (int x = 0; x < gamArr.size(); x ++ ) {
            store[x][0] = x + "";
            store[x][1] = gamArr.get(x).stats()[col];
        }
       insertionSortV(store); 
       ArrayList<Gambler>temp = new ArrayList<Gambler>(gamArr.size());
        for (int y = 0; y < gamArr.size(); y++) {
            int spot = Integer.parseInt(store[y][0]);
            temp.add(y, gamArr.get(spot));
        }
        return temp;
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
    /**
    public static void insertionSortV( ArrayList<Helper> data)
    {
	for (int partition = 1; partition < data.size() ; partition ++ ) {
	    for (int i = partition; i > 0; i --) {
		if (Character.isDigit( data.get(i)[1].charAt(0))) {
		    int first = Integer.parseInt(data.get(i-1)[1]);
		    int second = Integer.parseInt(data.get(i)[1]);
		    if (second < first) {
			data.set(i,data.set( i-1, data.get(i)));
		    }
		    else
			break;
		}

		else {
		    
		    String first = data.get(i)[1];
		    String second = data.get(i)[1];
		    if ( (second).compareTo(first) < 0) {
			data.set(i,data.set( i-1, data.get(i)));
		    }
		    else
			break;
		}
	    }
	}
    }//end insertionSortV
    **/
    public static void main(String[] args) {}
    
} //end class DataStorage
