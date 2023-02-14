package Tank;

public class Tank {
    int position_x = 0;
    int position_y = 0;
    int fuel = 100;
    // задаем начальное направление. Танк смотрит от центра по оси Х в плюсовые значения
    int xy = 1;
    //конструктор 1
    public Tank() {
    }
    //конструктор 2
    public Tank(int position_x, int position_y, int fuel) {
        //ограничиваем поле боя размером поля по оси X
        if (position_x > MAX_POSITION_X)
            position_x = MAX_POSITION_X;
        if (position_x < MIX_POSITION_X)
            position_x = MIX_POSITION_X;
        this.position_x = position_x;
        if (position_y > MAX_POSITION_Y)
            position_y = MAX_POSITION_Y;
        if (position_y < MIX_POSITION_Y)
            position_y = MIX_POSITION_Y;
        this.position_y = position_y;
        this.fuel = fuel;
    }
    //конструктор 3
    public Tank(int position_x, int position_y) {
        if (position_x > MAX_POSITION_X)
            position_x = MAX_POSITION_X;
        if (position_x < MIX_POSITION_X)
            position_x = MIX_POSITION_X;
        this.position_x = position_x;
        if (position_y > MAX_POSITION_Y)
            position_y = MAX_POSITION_Y;
        if (position_y < MIX_POSITION_Y)
            position_y = MIX_POSITION_Y;
        this.position_y = position_y;
    }
    // направление 3 - это в минусовые значения по оси Х
    // направление 2 - это в плюсовые значения по оси Y
    // направление 4 - это в минусовые значения по оси Y

    public final int MAX_POSITION_X = 300;
    public final int MAX_POSITION_Y = 400;
    public final int MIX_POSITION_X = -300;
    public final int MIX_POSITION_Y = -400;

    //движение вперёд
    public void goForward(int position){
        // проверка: достаточно ли топлива для совершения манёвра
        if (fuel - position >= 0){
            position = position;
        } else
            position = fuel;

        switch (xy) {
            case 1:
                this.position_x = position_x + position;
                fuel -= position;
                break;
            case 3:
                this.position_x = position_x - position;
                fuel -= position;
                break;
            case 2:
                this.position_y = position_y + position;
                fuel -= position;
                break;
            case 4:
                this.position_y = position_y - position;
                fuel -= position;
                break;
            default:
        }
    }

    //движение назад
    public void goBackward(int position){
        // проверка: достаточно ли топлива для совершения манёвра
        if (fuel - position >= 0){
            position = position;
        } else
            position = fuel;

        switch (xy) {
            case 1:
                this.position_x = position_x - position;
                fuel -= position;
                break;
            case 3:
                this.position_x = position_x + position;
                fuel -= position;
                break;
            case 2:
                this.position_y = position_y - position;
                fuel -= position;
                break;
            case 4:
                this.position_y = position_y + position;
                fuel -= position;
                break;
            default:
        }
    }
    // реализация поворота направо
    public void turnRight(){
        if (xy == 1){
            xy = 2;
        } else if (xy == 2){
            xy = 3;
        } else if (xy == 3){
            xy = 4;
        } else if (xy == 4){
            xy = 1;
        }
    }
    //реализация поворота налево
    public void turnLeft(){
        if (xy == 1){
            xy = 4;
        } else if (xy == 2){
            xy = 1;
        } else if (xy == 3){
            xy = 2;
        } else if (xy == 4){
            xy = 3;
        }
    }
    public void printPosition(){
        System.out.println("The Tank is at " + position_x + ", " + position_y + " now");
    }

    public int getPosition_x() {
        return position_x;
    }

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public int getPosition_y() {
        return position_y;
    }

    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getXy() {
        return xy;
    }

    public void setXy(int xy) {
        this.xy = xy;
    }
}
