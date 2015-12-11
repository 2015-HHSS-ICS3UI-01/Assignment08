/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;

/**
 *
 * @author richj0985
 */
public class ClownFace extends JComponent{

    // Height and Width of our game
    static final int WIDTH = 1024;
    static final int HEIGHT = 600;
    
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000)/desiredFPS;
    

    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        BufferedImage img = null;

        //  Load the background picture
        try {
            img = ImageIO.read( new File("SpongeBackground.jpg") );
        } catch (IOException e) {
        }
        
        g.drawImage(img, 0, 0, null);

        // GAME DRAWING GOES HERE 
        
        // head outline
        g.setColor(Color.YELLOW);
        g.fillRect(150, 20, 500, 450);
        
        // shirt
        g.setColor(Color.WHITE);
        g.fillRect(150, 470, 500, 70);
        
        // pants
        Color brown = new Color(207,136,80);
        g.setColor(brown);
        g.fillRect(150, 540, 500, 70);
        
        // left arm
        g.setColor(Color.WHITE);
        g.fillRoundRect(650, 450, 50, 80, 30, 30);
        g.setColor(Color.YELLOW);
        g.fillRect(650, 525, 50, 100);
        
        // right arm
        g.setColor(Color.WHITE);
        g.fillRoundRect(100, 450, 50, 80, 30, 30);
        g.setColor(Color.YELLOW);
        g.fillRect(100, 525, 50, 100);
        
        // outline of eyes
        g.setColor(Color.WHITE);
        g.fillOval(200, 120, 200, 180);
        g.fillOval(400, 120, 200, 180);
        
        // 2nd outline of eyes
        g.setColor(Color.BLACK);
        g.fillOval(300, 175, 80, 80);
        g.fillOval(425, 175, 80, 80);
        
        // 3rd outline of eyes
        Color lightBlue = new Color(10,186,209);
        g.setColor(lightBlue);
        g.fillOval(435, 184, 60, 60);
        g.fillOval(310, 184, 60, 60);
        
        // 4th outline of eyes
        g.setColor(Color.BLACK);
        g.fillOval(325, 200, 30, 30);
        g.fillOval(450, 200, 30, 30);
        
        g.setColor(Color.BLACK);
        g.fillRect(290, 80, 20, 40);
        g.fillRect(225, 100, 20, 40);
        g.fillRect(355, 100, 20, 40);
        
        g.fillRect(490, 80, 20, 40);
        g.fillRect(425, 100, 20, 40);
        g.fillRect(555, 100, 20, 40);
        
        // mouth
        Color darkRed = new Color(145, 36, 3);
        g.setColor(darkRed);
        g.fillArc(200, 250, 400, 200, 180, 180);
        
        // teeth
        g.setColor(Color.WHITE);
        g.fillRect(345, 350, 45, 45);
        g.fillRect(415, 350, 45, 45);
        
        // tongue
        Color lightPink = new Color(255, 167, 140);
        g.setColor(lightPink);
        g.fillRoundRect(360, 400, 80, 50, 30, 30);
        
        // dimples 
        g.setColor(Color.BLACK);
        g.drawArc(180, 325, 45, 45, 20, 200);
        g.drawArc(570, 325, 45, 45, 340, 160);
        
        // nose
        g.drawArc(380, 285, 40, 80, 0, 180);
        
        // part of pants
        g.setColor(Color.BLACK);
        g.fillRect(170, 555, 90, 30);
        g.fillRect(290, 555, 90, 30);
        g.fillRect(415, 555, 90, 30);
        g.fillRect(535, 555, 90, 30);
        
        g.setColor(Color.RED);
        g.fillArc(375, 445, 50, 50, 180, 180);
        int[] kiteX = {375+25+0, 375+25+40/2, 375+25+0, 375+25-40/2};
        int[] kiteY = {445+50+0-10, 445+50+40/2, 445+50+40+10, 445+50+40/2};
        g.fillPolygon(kiteX, kiteY, 4);
        // GAME DRAWING ENDS HERE
    }
    
    
    // The main game loop
    // In here is where all the logic for my game will go
    public void run()
    {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;
        
        // the main game loop section
        // game will end if you set done = false;
        boolean done = false; 
        while(!done)
        {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();
            
            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            
            

            // GAME LOGIC ENDS HERE 
            
            // update the drawing (calls paintComponent)
            repaint();
            
            
            
            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            if(deltaTime > desiredTime)
            {
                //took too much time, don't wait
            }else
            {
                try
                {
                    Thread.sleep(desiredTime - deltaTime);
                }catch(Exception e){};
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
        ClownFace game = new ClownFace();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH,HEIGHT));
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