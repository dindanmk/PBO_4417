public class GamePlayer {
    double width, height;
    int positionX;
    int positionY;

    GamePlayer() {
    }

    GamePlayer(double width, double height) {
        this.width = width;
        this.height = height;
    }

    GamePlayer(double width, double height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setDimension(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setPosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getX() {
        return positionX;
    }

    public int getY() {
        return positionY;
    }

    void Run() {
        System.out.println("Player is running");
    }

    void Run(int incrementX) {
        positionX = positionX + incrementX;
        System.out.println("Player still running... current X position= " + positionX);
    }

}