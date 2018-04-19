
public class Fraction {
	
	public final int numerator = 0;
	
	public final int denominator = 1;
	
	public Fraction(int newNumerator, int newDenominator){
		numerator = newNumerator;
		denominator = newDemoninator;
	}
	
	public Fraction(Fraction other){
		this.numerator = other.numerator;
		this.denominator = other.denominator;
	}
	
	public String toString(){
		return this.numerator+"/"+this.denominator;
	}
	
	public Fraction add(Fraction that){
		
	}
}
