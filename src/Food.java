import java.awt.*;

public class Food extends Sprite {
    public Food(Color color, int x, int y, int width, int height, Board board) {
        super(color, x, y, width, height, board);
    }
    public void setPosition(int x, int y){
        this.x = x - width/2;
        this.y = y - height/2;
    }

    @Override
    public void paint(Graphics g){
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }
}