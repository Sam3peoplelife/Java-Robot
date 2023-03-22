package classes;
import interfaces.*;
import java.util.Scanner;
import classes.Action.ActionType;

public class WalkRobot extends Robot implements Rotatable, Shiftable{
    public static Action actionlist[];
    public void move(){
        int length = this.actionlist.length;
        for(int i = 0; i<length; i++){
            int act = actionlist[i].getAction(actionlist[i].getAction());
            int step = actionlist[i].getSteps();
            switch(act){
                case 1:{
                    while(step != 0){
                        rotateforward();
                        step -=90;
                    }
                    super.dosmth();
                    break;
                }
                case 2:{
                    while(step != 0){
                        rotatebackward();
                        step -=90;
                    }
                    super.dosmth();
                    break;
                }
                case 3:{
                    while(step != 0){
                        rotateforward();
                        step--;
                    }
                    super.dosmth();
                    break;
                }
                case 4:{
                    while(step != 0){
                        rotatebackward();
                        step--;
                    }
                    super.dosmth();
                    break;
                }
                default: System.out.println("ERROR");
            }
        }
    }
    public void shiftforward(){
        switch(getCourse()){
            case 0: {this.setX(this.getX() + step_shift); break;}
            case 90: {this.setY(this.getY() + step_shift); break;}
            case 180: {this.setX(this.getX() + step_shift); break;}
            case 270: {this.setY(this.getY() + step_shift); break;}
        }
    }
    public void shiftbackward(){
        switch(getCourse()){
            case 0: {this.setX(this.getX() - step_shift); break;}
            case 90: {this.setY(this.getY() - step_shift); break;}
            case 180: {this.setX(this.getX() - step_shift); break;}
            case 270: {this.setY(this.getY() - step_shift); break;}
        }
    }
    public void rotateforward(){
        setCourse(getCourse()+step_angle);
    }
    public void rotatebackward(){
        setCourse(getCourse()-step_angle);
    }
    public void setActionList(){
        ActionType Type;
        System.out.println("Input amount of act: ");
        Scanner in = new Scanner(System.in);
        int actions = in.nextInt();
        this.actionlist = new Action[actions];
        int length = this.actionlist.length;
        for(int i = 0; i < length; i++){
            System.out.println("Input " + (i+1) + " action: ");
            int input = in.nextInt();
            int amount = in.nextInt();
            switch(input){
                case 1:{
                    Type = ActionType.RotF;
                    break;
                }
                case 2:{
                    Type = ActionType.RotB;
                    break;
                }
                case 3:{
                    Type = ActionType.ShiftF;
                    break;
                }
                case 4:{
                    Type = ActionType.ShiftB;
                    break;
                }
                default: Type = ActionType.DoSmth;
            }
            this.actionlist[i] = new Action(Type, amount);
        }
        in.close();
    }
    public void viewactionlist(){
        int length = this.actionlist.length;
        for(int i = 0; i < length; i++){
            System.out.println(actionlist[i].getAction()+" "+actionlist[i].getSteps());
        }
    }
}