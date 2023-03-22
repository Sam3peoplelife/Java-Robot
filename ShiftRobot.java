package classes;
import interfaces.*;

public class ShiftRobot extends Robot implements Shiftable{
    private int start_shift;
    private int end_shift;
    public ShiftRobot(){
        start_shift = 0;
        end_shift = 0;
    }
    public void setstart(){
        start_shift = this.getX();
    }
    public void setend(int end){
        end_shift = end;
    }
    public int getstart(){
        return start_shift;
    }
    public int getend(){
        return end_shift;
    }
    public void move(){
        dosmth();
        while(this.getX()!=end_shift){
            if(end_shift > start_shift) this.shiftforward();
            if(end_shift<start_shift) this.shiftbackward();
            dosmth();
        }
        System.out.println("Going to the start position");
        int temp = end_shift;
        end_shift = start_shift;
        start_shift = temp;
        dosmth();
        while(this.getX()!=end_shift){
            if(end_shift > start_shift) this.shiftforward();
            if(end_shift<start_shift) this.shiftbackward();
            dosmth();
        }
    }
    public void shiftforward(){
        this.setX(this.getX() + step_shift);
    }
    public void shiftbackward(){
        this.setX(this.getX() - step_shift);
    }
}