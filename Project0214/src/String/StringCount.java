package String;

public class StringCount {

	private int count;
	private String source = "";
	
	public StringCount(String source) {
		this.source = source;
	}
	
	public int StringCount(String s) {
		return StringCount(s,0);
	}
	
	public int StringCount(String s, int pos) {
		int index = 0;
		if(s==null || s.length() == 0)
			return 0;
		if((index=source.indexOf(s, pos)) != -1){
			count ++;
			StringCount(s, index + s.length());
		}
		
		return count;
	}
}
