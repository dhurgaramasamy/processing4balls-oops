import processing.core.PApplet;

public class TryProcessing extends PApplet{
    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;
    @Override
    public void settings() {
        super.settings();
        size(600,400);
    }

    @Override
    public void setup() {
        super.setup();
        ball1=new Ball(1,0,70);
        ball2=new Ball(2,0,140);
        ball3=new Ball(3,0,210);
        ball4=new Ball(4,0,280);
    }

    @Override
    public void draw() {
        ellipse(ball1.getBallX(), ball1.getBallY(),ball1.getBallHeight(),ball1.getBallWidth());
        ellipse(ball2.getBallX(), ball2.getBallY(),ball2.getBallHeight(),ball2.getBallWidth());
        ellipse(ball3.getBallX(), ball3.getBallY(),ball3.getBallHeight(),ball3.getBallWidth());
        ellipse(ball4.getBallX(), ball4.getBallY(),ball4.getBallHeight(),ball4.getBallWidth());
        ball1.accelerate();
        ball2.accelerate();
        ball3.accelerate();
        ball4.accelerate();
    }
}