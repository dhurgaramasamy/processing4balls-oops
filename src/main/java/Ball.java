public class Ball {
    private static int ballHeight=10;


    private static int ballWidth=10;
    private int movingSpeed;
    private int ballX;
    private int ballY;

    public Ball( int movingSpeed, int ballX, int ballY) {
        this.movingSpeed = movingSpeed;
        this.ballX = ballX;
        this.ballY = ballY;
    }

    public static int getBallHeight() {
        return ballHeight;
    }

    public static int getBallWidth() {
        return ballWidth;
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public void setMovingSpeed(int movingSpeed) {
        this.movingSpeed = movingSpeed;
    }

    public int getBallX() {
        return ballX;
    }

    public void setBallX(int ballX) {
        this.ballX= ballX;
    }

    public int getBallY() {
        return ballY;
    }

    public void setBallY(int ballY) {
        this.ballY = ballY;
    }

    public void accelerate()
    {
        ballX+=movingSpeed;
    }

}
