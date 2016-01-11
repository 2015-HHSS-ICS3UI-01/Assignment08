/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import static java.awt.image.ImageObserver.ERROR;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author agott2059
 */


public class Graphics1 extends JComponent{

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000)/desiredFPS;
    
    int x = 20;
    int move = 1;
    
    int delay = 0;

    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        // GAME DRAWING GOES HERE 
        //create ne color
        Color brown = new Color(107, 94, 44);
        //draw hair
        g.setColor(brown);
        g.fillOval(230, 195, 100, 100);
        g.fillOval(440, 195, 100, 100);
        g.fillOval(230, 180, 40, 40);
        g.fillOval(495, 180, 40, 40);   
        //draw face shape
        Color skin = new Color(255,242,191);
        g.setColor(skin);
        g.fillOval(260, 165, 250, 300);
        //draw hat
        g.setColor(Color.BLACK);
        g.fillRect(224, 128, 320, 75);     
        g.setColor(Color.BLACK);
        g.fillRect(300, 50, 180, 150);
        //draw eyes
        g.setColor(Color.white);
        g.fillOval(305, 240, 65, 50);
        g.fillOval(390, 240, 65, 50);
        //eyeballs         
        g.setColor(Color.black);
        g.fillOval(320, 258, 15, 15);
        g.fillOval(405, 258, 15, 15);
        //draw eyelids
        g.setColor(skin);
        g.fillRect(300, 230, 160, x);      
        //eyebrows 
        g.setColor(brown);
        g.fillRect(300, 225, 60, 10);
        g.fillRect(385, 225, 60, 10);
        //draw nose
        g.fillOval(340, 310, 60, 35);
        g.setColor(Color.red);
        g.fillArc(325, 340, 85, 80, 180, 180);

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
            
           //if x > 70 low, set move to -1 so eyelids go back up 
           if(x > 70 ){
               move = -1;
           }
           //if x < 20, move is 1, start 60 frame delay, add 1 to x
           if(x < 20 ){
               move = 1;
               delay = 60; 
               x++;
           }
           //if counter is expired move eylids down
           if(delay <= 0){
               x=x+move;
           //if not decrease delay by 1
           }else{
               delay--;
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
        Graphics1 game = new Graphics1();
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