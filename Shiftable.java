package interfaces;

public interface Shiftable extends Movable{
    static int step_shift = 1;
    public void shiftforward();
    public void shiftbackward();
}