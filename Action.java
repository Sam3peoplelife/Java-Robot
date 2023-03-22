package classes;

public class Action{
    public static enum ActionType{
        RotF, RotB, ShiftF, ShiftB, DoSmth
    }
    protected int steps_count;
    protected ActionType action;
    Action(){
        steps_count = 0;
    }
    Action(ActionType act, int amount){
        action = act;
        steps_count = amount;
    }
    public static Action setAction(ActionType act, int amount){
        Action action = new Action(act, amount);
        return action;
    }
    public int getSteps(){
        return steps_count;
    }
    public ActionType getAction(){
        return this.action;
    }
    public static int getAction(ActionType act){
        switch(act){
            case RotF: return 1;
            case RotB: return 2;
            case ShiftF: return 3;
            case ShiftB: return 4;
            default: return 0;
        }
    }
    public ActionType getAction(int act){
        switch(act){
            case 1: action = ActionType.RotF;
            case 2: action = ActionType.RotB;
            case 3: action = ActionType.ShiftF;
            case 4: action = ActionType.ShiftB;
        }
        return action;
    }
}