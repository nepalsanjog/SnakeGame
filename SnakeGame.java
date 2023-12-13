
import javax.swing.*;

public class SnakeGame extends JFrame{

    SnakeGame(){
        super("Snake game");
        add(new Board());
        pack();

        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}
