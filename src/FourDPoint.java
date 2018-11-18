import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int w;

    public FourDPoint (int x, int y, int z, int w){
        super (x, y);
        this.z = z;
        this.w = w;
    }

    public static void main(String[] args) {
        FourDPoint fourDPoint = new FourDPoint(1,2,3,4);
        System.out.println("X wynosi: " + fourDPoint.x);
        System.out.println("Y wynosi: " + fourDPoint.y);
        System.out.println("Z wynosi: " + fourDPoint.z);
        System.out.println("W wynosi: " + fourDPoint.w);

    }
}