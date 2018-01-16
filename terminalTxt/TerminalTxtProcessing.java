package terminalTxt;

import java.util.ArrayList;

public class TerminalTxtProcessing{
	public static void main(String[] args){}

	public static void sleeperPrinter(ArrayList<String> inStrArr, int time, int rptns){ //prints all strings in [inStrArr] with a delay of [time] milliseconds [rptns] number of times
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

	public static String textRepeater(String rptStr, int rptns){ //repeats a string a certain amt of times
		String rtrnStr = new String();
		for(int i = 0; i < rptns; i++){
			rtrnStr += rptStr;
		}
		return rtrnStr;
	}

	public static String terminalCenter(String input){ // centers text in a 80*24 default terminal window
		String rtrnStr = "";
		String[] inputArr = stringSplitter(input);
		int nLCount = 0;
		int spaceCt;
		for(String el : inputArr){
			if(el.equals("\n")){     //counts newlines and centers vertically
				nLCount += 1;
			}
		}
		rtrnStr += textRepeater("\n",(24 - nLCount) / 2);
		inputArr = input.split("\n", 0);
		spaceCt = inputArr[0].length();
		for(String el : inputArr){
			if(el.length() > spaceCt){
				spaceCt = el.length();    //counts width and centers horizontally
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

	public static String lineCenter(int type, String[] inArr){
		String rtrn = "";
		if (type == 1){
			rtrn += inArr[0] + textRepeater(" ", (24 - inArr[0].length())) + inArr[1] + textRepeater(" ", (25 - inArr[1].length())) + inArr[2] + textRepeater(" ", (24 - inArr[2].length())) + inArr[3];
		}else{
			rtrn += inArr[0] + textRepeater(" ", (73 - inArr[0].length())) + inArr[1];
		}
		return rtrn;
	}
}