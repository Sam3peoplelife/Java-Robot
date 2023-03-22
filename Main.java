package classes;

public class Main{
	public static void main(String[] args) {
		
		ShiftRobot sr = new ShiftRobot();
		sr.getstart();
		sr.setend(10);
		sr.move();
		
		RotRobot rr = new RotRobot();
		rr.setCourse(90);
		rr.setstartangle();
		rr.setendangle(720);
		rr.move();
		
		WalkRobot wr = new WalkRobot();
		wr.setX(-2);
		wr.setY(2);
		wr.setActionList();
		wr.viewactionlist();
		wr.move();
	}
}
