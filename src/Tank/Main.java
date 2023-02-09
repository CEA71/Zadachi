package Tank;

public class Main {
    public static void main(String[] args) {
/*
Make a Tank(add code to class Tank),
which can move forward and backward
*/
        // создаем танк At (0;0) fuel=100
        Tank justTank = new Tank();
//        justTank.goForward(10);
//        justTank.printPosition();
//        justTank.turnRight();
//        justTank.goForward(50);
//        justTank.printPosition();
//        justTank.turnLeft();
//        justTank.goBackward(100);
//        justTank.printPosition();
        // создаем танк At (10;10) fuel=100
        Tank anywareTank = new Tank(10, 10);
        // создаем танк At (20;30) fuel=200
        Tank customTank = new Tank(20, 30, 200);

        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
