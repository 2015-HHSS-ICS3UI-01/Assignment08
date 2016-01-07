
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author snowc4636
 */
public class A8 extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    int y = 25;
    int move = -1;

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE 

        // draw an oval (x, y, width, height)
        g.setColor(Color.BLACK);
        g.drawOval(220, 100, 400, 475);
        g.setColor(Color.blue);
        g.fillOval(220, 100, 400, 475);

        // draw the eyes (x, y, width, height)
        g.setColor(Color.white);
        g.drawOval(300, 200, 50, 75);
        g.fillOval(300, 200, 50, 75);
        g.drawOval(475, 200, 50, 75);
        g.fillOval(475, 200, 50, 75);

        // draw the pupil (x, y, width, height)
        g.setColor(Color.BLACK);
        g.drawOval(330, 230, 15, 15);
        g.fillOval(330, 230, 15, 15);
        g.drawOval(505, 230, 15, 15);
        g.fillOval(505, 230, 15, 15);

        // draw mouth
        g.drawArc(315, 300, 220, 220, 180, 180);
        g.fillArc(315, 300, 220, 220, 180, 180);

        // draw a hat
        g.drawRect(320, y, 200, 75);
        g.fillRect(320, y, 200, 75);
        g.setColor(Color.red);
        g.drawRect(298, y + 75, 250, 5);
        g.fillRect(298, y + 75, 250, 5);
        g.setColor(Color.black);
        g.drawRect(275, y + 80, 300, 15);
        g.fillRect(275, y + 80, 300, 15);


        // GAME DRAWING ENDS HERE
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 


            y = y + move;

            if (y == -100) {
                move = 1;
                           

            }

if (y > 25) {
                    move = -1;
                }










            // GAME LOGIC ENDS HERE 

            // update the drawing (calls paintComponent)
            repaint();



            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            if (deltaTime > desiredTime) {
                //took too much time, don't wait
            } else {
                try {
                    Thread.sleep(desiredTime - deltaTime);
                } catch (Exception e) {
                };
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a windows to show my game
        JFrame frame = new JFrame("My Game");

        // creates an instance of my game
        A8 game = new A8();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(game);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // starts my game loop
        game.run();
    }
}
