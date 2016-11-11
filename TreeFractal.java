import java.applet.Applet;
import java.awt.*;

/**
 * Created by ignacioojanguren on 10/11/16.
 */
public class TreeFractal extends Applet {

    private Graphics graphic;
    private Image drawImage;

    /**
     * This class initialize the AWT applet
     * Also it initialize the recursive method RandomTree()
     */
    public void init(){
        int height = getSize().height;
        int width = getSize().width;
        drawImage = createImage(width,height);
        graphic = drawImage.getGraphics();

        randomTree(10, width/2,0, 90, graphic);
    }

    /**
     * This is a recursive method, this method will print the branches of the Fractal tree.
     * It creates per each branch 2 subranches.
     * @param branch
     *  Is the number of subranches we want in the Fractal tree, when highest the number, the number of branches will
     *  increase
     * @param bottomx
     * @param bottomy
     *  Bottomx and Bottomy are the two points from the bottom of the line
     * @param angle
     *  Angle is the distance between the subranches we want to see.
     * @param graphic
     *  Passing the initialization of the java awk window, this will allow the method to draw in the window.
     *
     * @postcondition
     *  This method will draw the proper fractal tree.
     *
     */
    public void randomTree(int branch, int bottomx, int bottomy, double angle, Graphics graphic){
        int topx, topy;
        if (branch == 0){
            return;
        }
        topx = bottomx + (int)(Math.cos(Math.toRadians(angle)) * branch * 9.0);
        topy = bottomy + (int)(Math.sin(Math.toRadians(angle)) * branch * 9.0);

        graphic.drawLine(bottomx, bottomy, topx, topy);

        randomTree(branch-1, topx,topy, angle - 20, graphic);
        randomTree(branch-1, topx,topy, angle + 20, graphic);
    }
    @Override
    public void paint(Graphics graphic){graphic.drawImage(drawImage,0,0,null);}
}
