import java.awt.Graphics;
import java.awt.Point;

public class Stage {
    private final Grid grid;


    public Stage(){
        grid = new Grid();
    }


    public void paint(Graphics g, Point mousePosition) {
        grid.paint(g, mousePosition);
    }
}
