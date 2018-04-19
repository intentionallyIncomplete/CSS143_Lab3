
public class CharList {

	private char[] charList = new char[100];
	private int charCount;
	
	public CharList(){
		System.out.println("a" + " is ");
		this.charCount = 0;
	}
	
	public CharList(String startStr){
		this.charList = startStr.toCharArray();
	}
	
	public CharList(CharList other){
		this.charList = other.charList;
	}
	
	public void add(char next){
		char[] newCharList = new char[charList.length+1];
		System.arraycopy(charList, 0, newCharList, 0, charList.length);
	}
}
