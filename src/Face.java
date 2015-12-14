/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author pircn0556
 */
// make sure you rename this class if you are doing a copy/paste
public class Face extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    //Custom colours
    Color skin = new Color(240, 206, 168);
    Color nose = new Color(207, 178, 145);
    Color mouth = new Color(245, 105, 105);
    Color hat = new Color(71, 63, 212);
    //arrays for the eyelids
    int[] xpoints = {205, 205, 278, 278};
    int[] ypoints = {260, 260, 250, 200};
    int[] xpointstwo = {325, 325, 398, 398};
    int[] ypointstwo = {250, 200, 260, 260};
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)

    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE 
        //hair
        g.setColor(Color.black);
        g.fillOval(130, 245, 70, 70);
        g.fillOval(395, 245, 70, 70);
        g.fillOval(125, 270, 100, 100);
        g.fillOval(374, 270, 100, 100);
        //skin
        g.setColor(skin);
        g.fillOval(150, 150, 300, 300);
        //nose
        g.setColor(nose);
        g.fillOval(280, 335, 45, 15);
        //mouth
        g.setColor(mouth);
        g.fillArc(271, 375, 60, 65, 0, 180);
        //eyes
        g.setColor(Color.WHITE);
        g.fillOval(205, 260, 73, 73);
        g.fillOval(325, 260, 73, 73);
        //pupils
        g.setColor(Color.BLACK);
        g.fillOval(235, 290, 25, 25);
        g.fillOval(345, 290, 25, 25);
        //eyelid
        g.setColor(skin);
        g.fillPolygon(xpoints, ypoints, 4);
        g.fillPolygon(xpointstwo, ypointstwo, 4);
        //hat
        g.setColor(hat);
        g.fillArc(145, 130, 310, 250, 0, 180);
        g.fillRoundRect(50, 235, 150, 20, 10, 10);



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
            if(ypoints[3]<300){
                ypoints[3]++;
                ypointstwo[1]++;
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
        JFrame frame = new JFrame("Assignment 8 - Face");

        // creates an instance of my game
        Face game = new Face();
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
