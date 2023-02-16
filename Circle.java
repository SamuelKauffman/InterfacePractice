
public class Circle implements ShapeInterface {
	private int mRadius;
	
	public Circle() {
		mRadius = 0;
	}
	public int getRadius() {
		return mRadius;
	}
	public void setRadius(int radius) {
		mRadius = radius;
	}
	@Override
	public double calcArea() {
		double area = Math.PI*Math.pow(mRadius, 2);
		return area;
	}
	
}
