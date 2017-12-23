import java.util.ArrayList;

public class Animation{
	public static void main(String[] args){
		ArrayList<String> testtxtarr = new ArrayList<String>();
		String testtxt1 = "";
		String testtxt2 = "";
		String testtxt3 = "";
		String testtxt4 = "";
		String testtxt5 = "";
		String testtxt6 = "";

		testtxt1 += terminalCenter("------------------\n|                |\n|                |\n------------------\n");

		testtxt2 += terminalCenter("  ------------\n /\\           \\ \n/  \\           \\ \n----------------\n");

		testtxt3 += terminalCenter("  --------\n / \\     \\\n/   \\     \\\n------------\n");

		testtxt4 += terminalCenter("  --\n /  \\\n/    \\\n------\n");

		testtxt5 += terminalCenter("  --------\n /      / \\\n/      /   \\\n------------\n");

		testtxt6 += terminalCenter("  ------------\n /           /\\\n/           /  \\\n----------------\n");

		testtxtarr.add(testtxt1);
		testtxtarr.add(testtxt2);
		testtxtarr.add(testtxt3);
		testtxtarr.add(testtxt4);
		testtxtarr.add(testtxt5);
		testtxtarr.add(testtxt6);

		sleeperPrinter(testtxtarr, 250, 20);
	}

	public static void sleeperPrinter(ArrayList<String> inStrArr, int time, int rptns){
		for(int i = 0; i < rptns; i++){
			for(String el : inStrArr){
				System.out.print(el);
				try{
					Thread.sleep(time);
				}catch(InterruptedException ex){
					Thread.currentThread().interrupt();
				}
			}
		}
	}

	public static String textRepeater(String rptStr, int rptns){
		String rtrnStr = new String();
		for(int i = 0; i < rptns; i++){
			rtrnStr += rptStr;
		}
		return rtrnStr;
	}

	public static String terminalCenter(String input){
		String rtrnStr = "";
		String[] inputArr = stringSplitter(input);
		int nLCount = 0;
		int spaceCt;
		for(String el : inputArr){
			if(el.equals("\n")){
				nLCount += 1;
			}
		}
		rtrnStr += textRepeater("\n",(24 - nLCount) / 2);
		inputArr = input.split("\n", 0);
		spaceCt = inputArr[0].length();
		for(String el : inputArr){
			if(el.length() > spaceCt){
				spaceCt = el.length();
			}
		}
		spaceCt = (80 - spaceCt) / 2;
		for(int i = 0; i < inputArr.length; i++){
			rtrnStr += textRepeater(" ", spaceCt);
			rtrnStr += inputArr[i];
			rtrnStr += "\n";
		}
		rtrnStr += textRepeater("\n",(24 - nLCount) / 2);
		return rtrnStr;
	}

	public static String[] stringSplitter(String inStr){ //splits into chars in an array
		String[] rtrnArr = new String[inStr.length()];
		for(int i = 0; i < inStr.length(); i++){
			rtrnArr[i] = inStr.substring(i,i+1);
		}
		return rtrnArr;
	}
}