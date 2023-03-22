package classes;
import interfaces.*;

public class RotRobot extends Robot implements Rotatable{
    private int start_angle;
    private int end_angle;
    public RotRobot(){
        start_angle = 0;
        end_angle = 0;
    }
    public void setstartangle(){start_angle = getCourse();}
    public int getendangle(){return end_angle;}
    public int getstartangle(){return start_angle;}
    public void setendangle(int end){end_angle = end;}
    public void rotateforward(){
        setCourse(getCourse() + step_angle);
    };
    public void rotatebackward(){
        setCourse(getCourse() - step_angle);
    };
    public void move(){
        dosmth();
        if(Math.abs(end_angle) > 360) end_angle%=360;
        while(this.getCourse()!=end_angle){
            if(end_angle<start_angle) rotateforward();
            if(end_angle>start_angle) rotatebackward();
            dosmth();
        }
        System.out.println("Going to the start position");
        int temp = end_angle;
        end_angle = start_angle;
        start_angle = temp;
        dosmth();
        while(this.getCourse()!= end_angle){
            if(end_angle<start_angle) rotateforward();
            if(end_angle>start_angle) rotatebackward();
            dosmth();
        }
    };
}