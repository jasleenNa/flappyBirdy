import javax.swing.*;


public class App
{
    public static void main(String[] args) throws Exception {
        int boardWidth=360;
        int boardHeight=640;


        JFrame frame = new JFrame("Flappy Bird");
        //frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


        FlappyBird flappyBird = new FlappyBird(); //error
        frame.add(flappyBird);
        frame.pack();
        frame.setVisible(true);




    }
}

