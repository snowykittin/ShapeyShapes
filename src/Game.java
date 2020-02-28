import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;


public class Game extends JFrame implements MouseMotionListener {
    Board board;
    int positionX,positionY;
    long moment;
    boolean mouseClicked = false;

    public Game(){

        setTitle("ShapeyShape");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        board = new Board(this);
        add(board);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                setCursor(getToolkit().createCustomCursor(new BufferedImage(3,3,2),new Point(0,0),"null"));
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                positionX =e.getX();
                positionY=e.getY();
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseEntered(e);
                mouseClicked = true;
                moment = System.currentTimeMillis();
            }
        });

        pack();
        board.setup();
        setLocationRelativeTo(null);

    }



    public static void main(String[] args){
        Game game = new Game();
        game.board.setup();
    }


    public boolean getIsClicked(){return mouseClicked;}
    public void notClicked(){mouseClicked = false;}
    public long getMoment(){return moment;}


    public int getPositionX() {
        return positionX;
    }


    public int getPositionY() {
        return positionY;
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}