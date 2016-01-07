
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author moraj0721
 */
public class A8Q1 extends JComponent {

    //right eye x coordinate
    int x = 430;
    int moveX = 1;
    
    //left eye x coordinate
    int x1 = 340;
    int moveX1 = 1;
    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE 

        //face
        Color Skin = new Color(255, 237, 143);
        g.setColor(Skin);
        g.fillOval(150, 100, 500, 380);

        //hatrim
        g.setColor(Color.YELLOW);
        g.fillArc(150, 70, 500, 380, 0, 175);

        //hat top
        Color Hat = new Color(0, 184, 245);
        g.setColor(Hat);
        g.fillArc(150, 65, 500, 380, 0, 174);

        //hat puff ball
        g.setColor(Color.YELLOW);
        g.fillOval(400, 60, 50, 80);
        g.fillOval(410, 50, 50, 80);
        g.fillOval(420, 70, 50, 80);

        g2d.translate(390, 65);
        g2d.rotate(Math.toRadians(45));
        g.fillOval(0, 0, 50, 80);
        g2d.rotate(Math.toRadians(-45));
        g2d.translate(-390, -65);

        g.fillOval(370, 70, 50, 80);

        g.fillOval(340, 55, 50, 80);

        //eye whites
        g.setColor(Color.WHITE);
        g.fillOval(310, 260, 50, 100);
        g.fillOval(430, 260, 50, 100);

        //pupils
        g.setColor(Color.BLACK);
        g.fillOval(x, 310, 20, 20);
        
        //part of chin
        g.fillOval(x1, 310, 20, 20);

        //mouth
        g.setColor(Color.BLACK);
        g.fillArc(330, 330, 140, 100, 180, 180);
        g.drawLine(365, 455, 430, 455);

        //chin line
        g.drawLine(250, 430, 300, 460);
        g.drawLine(300, 460, 350, 470);
        g.drawLine(350, 470, 410, 470);
        g.drawLine(410, 470, 450, 467);
        g.drawLine(450, 467, 475, 460);
        g.drawLine(475, 460, 500, 455);
        g.drawLine(500, 455, 550, 425);
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

            //right eye
            x = x + moveX;

            if (x > 460) {
                moveX = -1;
            }

            if (x < 430) {
                moveX = 0;
            }

            //left eye          
            x1 = x1 - moveX1;

            if (x1 <= 310) {
                moveX1 = -1;
            }

            if (x1 >= 340) {
                moveX1 = 0;
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
        A8Q1 game = new A8Q1();
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