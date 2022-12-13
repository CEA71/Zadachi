package Listing_3_13;

public class ParaByRef {
    int x, y;

    public ParaByRef(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void callByRef(ParaByRef o){
        o.x += this.x;
        o.y += this.y;
    }

}
