package Tank;

public class Main {
    public static void main(String[] args) {
/*
Make a Tank(add code to class Tank),
which can move forward and backward
*/

        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();


    }
}
