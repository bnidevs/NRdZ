package terminalTxt;

public class TerminalTxtProcessing{
	public static void main(String[] args){}

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

	public static String textRepeater(String rptStr, int rptns){ //repeats a string a certain amt of times
		String rtrnStr = new String();
		for(int i = 0; i < rptns; i++){
			rtrnStr += rptStr;
		}
		return rtrnStr;
	}
}