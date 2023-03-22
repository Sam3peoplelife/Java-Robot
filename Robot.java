package classes;

public class Robot{
    private int x;
    private int y;
    public int course = 0;
    Robot(){
        x = 0;
        y = 0;
        course = 0;
    }
    public void dosmth(){
        System.out.println("Course => " + course + ". X => " + x + ". Y => "+y);
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public int getCourse(){return course;}
    public void setX(int x1){x = x1;}
    public void setY(int y1){y = y1;}
    public void setCourse(int course1){
        course = course1;
        if (Math.abs(course) == 360) course = 0;
        if (course > 360) course-=360;
        if(course < 0) course += 360;
    }
}