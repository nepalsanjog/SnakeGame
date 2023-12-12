
import javax.swing.*;

public class SnakeGame extends JFrame{

    SnakeGame(){
        super("Snake game");
        add(new Board());
        pack();

        setLocation(300,300);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    

    public static void main(String[] args){

        new SnakeGame();


    }
}
