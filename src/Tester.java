
public class Tester {
	    public Tester(){
	    	double x;
	    	double y;
	    }
		public void Huy(double x,double y){
			Line huy1 = new Line(x,y,200,300);
			huy1.draw();
			Line huy2 = new Line(x,23,200,y);
			huy2.draw();
		}
		
}
