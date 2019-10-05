package Found;

public class Found {
	

	public void find (String msg, String lookfor) {
		int count=0;
		String alpha;
		int i;
		for(i=0;i<msg.length();i++); {
			alpha=msg.substring(i,i+1);
			if(alpha.contentEquals(lookfor.substring(0,1))) {
				if(msg.substring(i,i+lookfor.length()).contentEquals(lookfor)) {
					count++;
					i+=lookfor.length()-1;
			
				}
			}
		}
		System.out.println(count);
	}
	
}
class Found1 {
    public static void main(String[] args) {
        Found str = new Found();
        str.find("Hello London,I am going to London","London");
    }
}


