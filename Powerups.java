public class Powerups {
//log the start times for the powerups
private static long startD;
private static long startPS;
private static long startEC;
private static long startQAF;

//log the end times for each powerup
private static long endD;
private static long endPS;
private static long endEC;
private static long endQAF;

//log the cooldown times for each powerup
private static long coolD;
private static long coolPS;
private static long coolEC;
private static long coolQAF;

//activates the Dynamite PowerUp
public static void activateDynamite(){
        startD = System.currentTimeMillis();
        endD = startD + 30000; //set the end time to 30 seconds after the current time
        coolD = endD + 100000; //set the cooldown time to 1 minute after the end time
}

//activates the PowerSurge powerup
public static void activatePower(){
        startPS = System.currentTimeMillis();
        endPS = startPS + 30000; //set the end time to 30 seconds after the current time
        coolPS = endPS + 100000; //set the cooldown time to 1 minute after the end time
}

//activates Extra Chips
public static void activateExtra(){
        startEC = System.currentTimeMillis();
        endEC = startEC + 30000; //set the end time to 30 seconds after the current time
        coolEC = endEC + 100000; //set the cooldown time to 1 minute after the end time
}

public static void activateQAF(){
        startQAF = System.currentTimeMillis();
        endQAF = startQAF + 30000; //set the end time to 30 seconds after the current time
        coolQAF = endQAF + 500000; //set the cooldown time to 5 minutes after the end time
}

//chacks to see if a certain powerup is active
public static boolean isActive( String name ){
        if ( name.equals("D") ) { //for checking dynamite
                if( endD > startD)
                        return true;
        }
        else if ( name.equals("Pow") ) { //for checking Power Surge
                if( endPS > startPS)
                        return true;
        }
        else if ( name.equals("EC") ) { //for checking Extra Chips
                if( endEC > startEC)
                        return true;
        }
        else if ( name.equals("QAF") ) { //for checking QAFee
                if( endQAF > startQAF)
                        return true;
        }
        return false; //if the event in question fails, then return false
}

public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        activateQAF();
        System.out.println(startQAF);
        System.out.println(endQAF);
        System.out.println(coolQAF);
}


}
