package StringChar1;

class StringProcessing1 {
	public void printVertical(String msg) {
		int i = 0;
		for (i = 0; i < msg.length(); i++) {
			System.out.println(msg.substring(i, i + 1));
		}
	}

	public void wordCount(String msg) {
		int spacecount = 0;
		int i = 0;
		String alpha;
		for (i = 0; i < msg.length(); i++) {
			alpha = msg.substring(i, i + 1);
			if (alpha.equals(" ")) {
				spacecount++;
			}
		}
		System.out.println("We have " + (spacecount + 1) + " words");
	}

	public void printVertical2(String msg) {
		String word = "", alpha;
		int i = msg.length();
		for (; i > 0; i--) {
			alpha = msg.substring(i -1,i);
			if (alpha.equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word=alpha+word;
			}
		}
		System.out.println(word);
	}
public void find(String msg) {
	String word = "", alpha;
	int i = 0;
	int counter =0;
	for (; i < msg.length(); i++) {
		alpha = msg.substring(i,i+1);
		if (alpha.equals(" ")) {
			System.out.println(word);
			word = "";
		} else {
			word+=alpha;
			if(alpha.contentEquals("am")) {
				counter+=1;
			}
		}
	}
	System.out.println(word);
}
}
class ReadStrings1 {
	public static void main(String[] args) {
		StringProcessing1 str = new StringProcessing1();
//		str.printVertical("Hello my friends");
//		str.wordCount("Hello my friends");
//		str.printVertical2("Hello my friends");
		str.find("I am,am going am,am");
		System.out.print(counter);
	}
}