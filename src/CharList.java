import java.util.Arrays;

public class CharList {

	private char[] charList = new char[100];
	private int charCount;

	public CharList(){
		System.out.println("a" + " is ");
		this.charCount = 0;
	}

	public CharList(String startStr){
		this.charList = startStr.toCharArray();
		this.charCount = charList.length;
	}

	public CharList(CharList other){
		this.charList = other.charList;
	}

	public void add(char next){
		char[] newCharList = new char[charList.length+1];
		System.arraycopy(charList, 0, newCharList, 0, charList.length);
		charList = newCharList;
	}

	public char get(int index){
		return charList[index];
	}

	public String toString(){
		return Arrays.toString(charList) + " with a count of " + this.charCount;
	}

	public boolean equals(CharList that){
		if(that == null || this.charCount != that.charCount){
			return false;
		}else {
			return true;
		}
	}
}
