/*****************************************************/
/* 					Questions						 */
/* 1) A privacy leak is an improper practice of 	 */
/* encapsulation. Usually it is a publicly accessible*/
/* value that is important to remain private		 */
/* 2) The getters and setters are not private, so yes*/
/* they are subject to privacy leak attempts		 */
/* 3) A privacy leak can happen anywhere there is	 */
/* data not locked down that should be.*/
/*****************************************************/

public class LineSegment {

	private Point2D startPoint = new Point2D();
	private Point2D endPoint = new Point2D();
	
	public LineSegment(){
		this.startPoint.resetToOrigin();
	}
	
	public LineSegment(Point2D startPoint, Point2D endPoint){
		if(startPoint == null || endPoint == null){
			System.out.println("invalid coordinates, reset to origin executed");
			this.startPoint.resetToOrigin();
		}else{
			this.startPoint = startPoint;
			this.endPoint = endPoint;
		}
	}
	
	public LineSegment(LineSegment other){
		this.startPoint = other.startPoint;
		this.endPoint = other.endPoint;
	}
	
	public String toString(){
		return this.getStartPoint().toString()+","+this.getEndPoint().toString();
	}
	
	public boolean equals(Point2D that){
		if(this.getStartPoint().toString().equals(that)){
			return true;
		}else{
			return false;
		}
	}
	
	public Point2D getStartPoint(){
		return startPoint;
	}

	public Point2D getEndPoint(){
		return endPoint;
	}

	public void setStartPoint(Point2D startPoint){
		this.startPoint = startPoint;
	}

	public void setEndPoint(Point2D endPoint){
		this.endPoint = endPoint;
	}
}
