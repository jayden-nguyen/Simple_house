
public class House {
		public House(){};
		public void HouseDraw(double x, double y){
			//Define lines to draw a house
			Line line1 = new Line(x,y+150,x+100,y);
			Line line2 = new Line(x+100,y,x+250,y);
			Line line3 = new Line(x,y+150,x+300,y+150);
			Line line4 = new Line(x+250,y,x+150,y+150);
			Line line5 = new Line(x+250,y,x+300,y+150);
			Line line6 = new Line(x,y+150,x,y+300);
			Line line7 = new Line(x,y+300,x+300,y+300);
			Line line8 = new Line(x+150,y+150,x+150,y+300);
			Line line9 = new Line(x+300,y+150,x+300,y+300);
			
			// Define Door and windows
			Rectangle door = new Rectangle(x+60,y+240,30,60);
			Rectangle windows1 = new Rectangle(x+15,y+180,30,30);
			Rectangle windows2 = new Rectangle(x+105,y+180,30,30);
			
			// Draw the house lines
			line1.draw();
			line2.draw();
			line3.draw();
			line4.draw();
			line5.draw();
			line6.draw();
			line7.draw();
			line8.draw();
			line9.draw();
			//Draw the door and windows
			door.draw();
			windows1.draw();
			windows2.draw();
			
		}
}
