package Tank;

public class Tank {
    int position;

    public void goForward(int position){
        this.position += position;
    }
    public void printPosition(){
        System.out.println("The Tank is at " + position + " now");
    }
    public void goBackward(int position){
        this.position -= position;
    }
}
