
public class TheSun {
		//Define the circle of the sun
	public TheSun(){};
	public void theSunDraw(double x,double y){
	Ellipse theSunCircle = new Ellipse(x,y,200,200);
	// Draw the sun
	theSunCircle.draw();
	theSunCircle.setColor(new Color(255,0,0));
	theSunCircle.fill();
	
	}
}
