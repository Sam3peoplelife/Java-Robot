package interfaces;

public interface Rotatable extends Movable{
    static int step_angle = 90;
    public void rotateforward();
    public void rotatebackward();
}