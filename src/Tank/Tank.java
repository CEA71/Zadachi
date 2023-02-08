package Tank;

public class Tank {
    int position_x = 0;
    int position_y = 0;
    // задаем начальное направление. Танк смотрит от центра по оси Х в плюсовые значения
    int xy = 1;
    // направление 3 - это в минусовые значения по оси Х
    // направление 2 - это в плюсовые значения по оси Y
    // направление 4 - это в минусовые значения по оси Y

    public void goForward(int position){
        switch (xy) {
            case 1:
                this.position_x = position_x + position;
                break;
            case 3:
                this.position_x = position_x - position;
                break;
            case 2:
                this.position_y = position_y + position;
                break;
            case 4:
                this.position_y = position_y - position;
                break;
            default:
        }
    }
    public void goBackward(int position){
        switch (xy) {
            case 1:
                this.position_x = position_x - position;
                break;
            case 3:
                this.position_x = position_x + position;
                break;
            case 2:
                this.position_y = position_y - position;
                break;
            case 4:
                this.position_y = position_y + position;
                break;
            default:
        }
    }
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
//    public void goBackward(int position){
//        this.position -= position;
//    }
}
