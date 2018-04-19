import java.awt.Color;
import java.awt.Graphics;

public class Shape {
	/****************************************/
	/* 					Invariants			*/
	/* 1) the area cannot be negative		*/
	/* 2) no two points can be the same 	*/
	/* value. 								*/
	/* 3) coordinates cannot be negative	*/
	/* 4) some shapes require side lengths	*/
	/* be equal, such as a square or 		*/
	/* equalateral triangle					*/
	/****************************************/
	
	
	private int x;
	private int y;
	Color color;
	
	public Shape(){
		this.x = 0;
		this.y = 0;
	}
	
	public Shape(int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public Shape(Shape other){
		this.x = other.x;
		this.y = other.y;
	}
	
	public double getArea(){
		//getting the area of the shape object
		return -1;
	}
	
	public String toString(){
		return "X-coord: "+this.x+"\nY-coord: "+this.y+"\nColor: "+this.color;
	}
	
	public void Draw(Graphics g){
		
	}
	
	//getters
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Color getColor(){
		return color;
	}
	
	//setters
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
}
