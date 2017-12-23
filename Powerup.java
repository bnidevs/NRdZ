public interface Powerup {

public String asciiIcon = "[]";
public String name;
public int multiplier;
public String symbol;
public int refreshTime;
public int timer;

public abstract void modifier();

public Powerup(String n){
								name = n;
								symbol = name.substring(0,1);
								asciiIcon = asciiIcon.substring(0,1) + symbol + asciiIcon.substring(1);
}
}
