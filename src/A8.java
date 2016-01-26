/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Peter
 */


public class A8 extends JComponent{

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (8500)/desiredFPS;
    
    int frameCount = 0;

    Rectangle leftEye = new Rectangle(285, 315, 15, 15);
    Rectangle rightEye = new Rectangle(390, 315, 15, 15);
    
    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        // GAME DRAWING GOES HERE 
        // Background
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        // Hair
        //Color hair = new Color(94, 52, 25);
        g.setColor(Color.RED);
        g.fillOval(175, 200, 150, 150);
        g.fillOval(150, 250, 150, 150);
        g.fillOval(375, 200, 150, 150);
        g.fillOval(400, 250, 150, 150);
        g.fillOval(200, 150, 300, 300);
        g.fillOval(425, 300, 150, 150);
        g.fillOval(125, 300, 150, 150);
        g.fillOval(450, 350, 150, 150);
        g.fillOval(100, 350, 150, 150);
        g.fillOval(200, 300, 300, 300);
        g.fillOval(475, 400, 150, 150);
        g.fillOval(75, 400, 150, 150);
        g.fillOval(500, 450, 150, 150);
        g.fillOval(50, 450, 150, 150);
        g.fillOval(400, 450, 150, 150);
        g.fillOval(150, 450, 150, 150);
        
        // Head
        Color skin = new Color(255, 226, 201);
        g.setColor(skin);
        g.fillOval(200, 200, 300, 300);
        
        // Eyebrows
        g.setColor(Color.RED);
        g.fillOval(273, 280, 50, 50);
        g.fillOval(380, 280, 50, 50);
        
        g.setColor(skin);
        g.fillOval(273, 285, 50, 50);
        g.fillRect(273, 295, 50, 50);
        g.fillOval(380, 285, 50, 50);
        g.fillRect(380, 295, 50, 50);
        
        // Hair
        g.setColor(Color.RED);
        g.fillArc(200, 130, 150, 150, 200, 180);
        g.fillArc(350, 130, 150, 150, 150, 180);
        g.fillArc(170, 210, 100, 100, 200, 180);
        g.fillArc(435, 210, 100, 100, 150, 180);
        
        // Eyes
        g.setColor(Color.WHITE);
        g.fillOval(275, 295, 45, 45);
        g.fillOval(380, 295, 45, 45);
        g.setColor(Color.BLUE);
        g.fillOval(280, 300, 35, 35);
        g.fillOval(385, 300, 35, 35);
        g.setColor(Color.BLACK);
        g.fillOval(leftEye.x, leftEye.y, leftEye.width, leftEye.height);
        g.fillOval(rightEye.x, rightEye.y, rightEye.width, rightEye.height);
        
        // Nose
        Color shade = new Color(240, 205, 175);
        g.setColor(shade);
        g.fillRect(340, 350, 20, 20);
        
        // Mouth
        Color mouth = new Color(255, 92, 89);
        g.setColor(mouth);
        g.fillArc(310, 360, 75, 75, 180, 180);
        
        
        
        
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
            frameCount++;

            if (frameCount >= 1) {
                 leftEye.x = leftEye.x + 1;
                 if (leftEye.x > 290) {
                            leftEye.x = 285;
                        }
                 rightEye.x = rightEye.x + 1;
                 if (rightEye.x > 395) {
                            rightEye.x = 390;
                        }
            }            
            

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
        A8 game = new A8();
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