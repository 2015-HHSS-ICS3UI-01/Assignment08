/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

// make sure you rename this class if you are doing a copy/paste
public class A8Q1 extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    int x2 = WIDTH / 2;
    int y2 = HEIGHT / 2;
    double angle2 = 0;
    int glassesX = 80;
    int glassesY = 96;
    // The y coordinate of the glasses only alters the y position vertically
    int Y = 0;
    // a font customized and made for printing the DEAL WITH IT later on
    Font myFont = new Font("Arial", Font.BOLD, 50);
    int six = 16;

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        // always clear the screen first!
        //g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE, (x,y,Negative horizontal,Negative vertical)

        //All colors used in this piece of art
        Color DBrown = new Color(113, 83, 55);
        Color SKIN = new Color(196, 154, 60);
        Color LIGHT = new Color(213, 167, 78);
        Color BROWN = new Color(166, 112, 27);




        // Dog's chin set to light color 
        g.setColor(LIGHT);
        g.fillRect(96, 18 * 16, 18 * 16, 96);
        g.fillRect(24 * 16, 18 * 16, 14 * 16, 64);
        g.fillRect(24 * 16, 22 * 16, 32, 32);
        g.fillRect(33 * 16, 16 * 16, 96, 48);



        // Dog's cheeks and portion of his mouth
        g.setColor(SKIN);
        g.fillRect(32, 16 * 16, 64, 7 * 16);
        g.fillRect(80, 23 * 16, 32, 16);
        g.fillRect(80, 19 * 16, 32, 16);
        g.fillRect(25 * 16, 17 * 16, 48, 16);
        g.fillRect(28 * 16, 18 * 16, 80, 16);
        g.fillRect(33 * 16, 17 * 16, 32, 16);
        g.fillRect(35 * 16, 160, 32, 64);
        g.fillRect(36 * 16, 208, 32, 48);
        g.fillRect(35 * 16, 16 * 16, 16, 16);
        g.fillRect(38 * 16, 16 * 16, 16, 32);


        // tops of his head, and his ears. Also minor face details
        g.setColor(BROWN);
        g.fillRect(192, 16, 160, 16);
        g.fillRect(144, 32, 64, 16);
        g.fillRect(80, 48, 80, 16);
        g.fillRect(48, 64, 48, 16);
        g.fillRect(18 * 16, 48, 16, 48);
        g.fillRect(304, 96, 16, 16);
        g.fillRect(26 * 16, 96, 16, 32);
        g.fillRect(22 * 16, 128, 48, 16);
        g.fillRect(208, 144, 64, 16);
        g.fillRect(48, 80, 32, 16);
        g.fillRect(32, 96, 32, 16);
        g.fillRect(16, 112, 48, 144);
        g.fillRect(64, 13 * 16, 16, 48);
        g.fillRect(32, 16 * 16, 32, 16);
        g.fillRect(6 * 16, 11 * 16, 32, 16);
        g.fillRect(31 * 16, 112, 16, 16);
        g.fillRect(32 * 16, 128, 32, 16);
        g.fillRect(34 * 16, 144, 32, 16);
        g.fillRect(36 * 16, 160, 16, 16);
        g.fillRect(37 * 16, 176, 16, 32);
        g.fillRect(38 * 16, 208, 16, 48);
        g.fillRect(39 * 16, 256, 16, 48);
        g.fillRect(38 * 16, 19 * 16, 16, 32);
        g.fillRect(28 * 16, 8 * 16, 32, 16);
        g.fillRect(336, 96, 16, 16);
        g.fillRect(32 * 16, 176, 32, 16);
        g.fillRect(16, 18 * 16, 16, 32);
        g.fillRect(32, 19 * 16, 16, 64);
        g.fillRect(48, 22 * 16, 16, 32);
        g.fillRect(64, 23 * 16, 16, 16);
        g.fillRect(80, 24 * 16, 96, 16);
        g.fillRect(26 * 16, 22 * 16, 48, 16);
        g.fillRect(26 * 16, 23 * 16, 16, 16);
        g.fillRect(32 * 16, 21 * 16, 64, 16);

        // Dog's face (most parts of it)
        g.setColor(SKIN);
        g.fillRect(208, 32, 192, 16);
        g.fillRect(160, 48, 128, 16);
        g.fillRect(19 * 16, 48, 128, 32);
        g.fillRect(27 * 16, 64, 32, 32);
        g.fillRect(304, 80, 128, 16);
        g.fillRect(320, 96, 16, 16);
        g.fillRect(96, 64, 12 * 16, 16);
        g.fillRect(80, 80, 13 * 16, 16);
        g.fillRect(22 * 16, 96, 64, 16);
        g.fillRect(18 * 16, 112, 128, 16);
        g.fillRect(80, 128, 17 * 16, 16);
        g.fillRect(80, 96, 96, 16);
        g.fillRect(80, 112, 112, 16);
        g.fillRect(80, 144, 64, 32);
        g.fillRect(80, 176, 16, 16);
        g.fillRect(144, 144, 64, 96);
        g.fillRect(17 * 16, 144, 17 * 16, 16);
        g.fillRect(25 * 16, 128, 48, 16);
        g.fillRect(30 * 16, 128, 32, 16);
        g.fillRect(36 * 16, 21 * 16, 32, 16);
        g.fillRect(13 * 16, 160, 22 * 16, 7 * 16);
        g.fillRect(10 * 16, 15 * 16, 48, 32);
        g.fillRect(15 * 16, 17 * 16, 112, 48);
        g.fillRect(6 * 16, 12 * 16, 48, 112);
        g.fillRect(9 * 16, 16 * 16, 48, 32);
        g.fillRect(11 * 16, 18 * 16, 64, 16);
        g.fillRect(11 * 16, 24 * 16, 14 * 16, 16);
        g.fillRect(25 * 16, 23 * 16, 16, 32);
        g.fillRect(29 * 16, 22 * 16, 48, 16);

        // The details of his face (Whiskers and side details)
        g.setColor(BROWN);
        g.fillRect(30 * 16, 160, 32, 16);
        g.fillRect(18 * 16, 13 * 16, 16, 16);
        g.fillRect(14 * 16, 13 * 16, 16, 16);
        g.fillRect(16 * 16, 15 * 16, 16, 16);


        // Dog's mouth and side portion of his head
        g.setColor(DBrown);
        g.fillRect(352, 16, 96, 16);
        g.fillRect(400, 32, 64, 16);
        g.fillRect(432, 48, 32, 16);
        g.fillRect(464, 64, 16, 32);
        g.fillRect(432, 96, 64, 16);
        g.fillRect(32, 80, 16, 16);
        g.fillRect(16, 96, 16, 16);
        g.fillRect(0, 112, 16, 144);
        g.fillRect(176, 96, 128, 16);
        g.fillRect(64, 96, 16, 112);
        g.fillRect(80, 192, 16, 64);
        g.fillRect(16, 16 * 16, 16, 16);
        g.fillRect(64, 16 * 16, 16, 16);
        g.fillRect(32, 17 * 16, 32, 16);
        g.fillRect(8 * 16, 11 * 16, 16, 64);
        g.fillRect(144, 15 * 16, 16, 16);
        g.fillRect(160, 16 * 16, 32, 16);
        g.fillRect(192, 17 * 16, 48, 16);
        g.fillRect(15 * 16, 18 * 16, 7 * 16, 16);
        g.fillRect(22 * 16, 17 * 16, 48, 16);
        g.fillRect(25 * 16, 16 * 16, 16, 16);
        g.fillRect(26 * 16, 15 * 16, 16, 16);
        g.fillRect(27 * 16, 16 * 16, 16, 16);
        g.fillRect(28 * 16, 17 * 16, 80, 16);
        g.fillRect(33 * 16, 16 * 16, 32, 16);
        g.fillRect(35 * 16, 14 * 16, 16, 32);

        // his pupil and nose
        g.setColor(Color.BLACK);
        g.fillRect(24 * 16, 12 * 16, 80, 16);
        g.fillRect(25 * 16, 13 * 16, 48, 16);
        g.fillRect(26 * 16, 14 * 16, 16, 16);
        g.fillRect(28 * 16, 112, 32, 16);
        g.fillRect(14 * 16, 112, 48, 16);

        //Draws the "DEAL WITH IT" right when the glasses reach his eyes
        g.setFont(myFont);
        if (Y > 96) {
            g.drawString("DEAL WITH IT", 10 * 16, 30 * 16);
        }


        //Dog's glasses
        g.setColor(Color.BLACK);
        g.fillRect(80, Y, 26 * 16, 16);
        g.fillRect(48, Y + 16, 32, 16);
        g.fillRect(192, Y + 16, 10 * 16, 16);
        g.fillRect(24 * 16, Y + 16, 7 * 16, 16);
        g.fillRect(400, Y + 32, 80, 16);
        g.fillRect(202, Y + 32, 128, 16);


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
            
            // A constant vertical translation down by 1, only stops when it reaches dog's eyes
            if (Y <= 96) {
                Y = Y + 1;
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
        JFrame frame = new JFrame("Wait for it..");

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