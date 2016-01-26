

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author preej0747
 */


public class question1 extends JComponent{

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000)/desiredFPS;
    
    //make variable to animate eyes
    

    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        // GAME DRAWING GOES HERE
    
        //make background
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 800, 600);
        
        //make grid
        g.setColor(Color.black);
        for(int x = 0; x <  WIDTH; x = x + 50){
            g.drawLine(x, 0, x, HEIGHT);
        }
        for(int y = 0; y < HEIGHT; y = y + 50){
            g.drawLine(0, y, WIDTH, y);
        }
      
        //make face shape and fill it in with color
        Color skin = new Color(237, 228, 185);
        g.setColor(skin);
        g.fillOval (150, 100, 450, 500);
        
        //draw triangles for hair
        //make a different color for hair
        Color brown = new Color(125, 68, 32);
        g.setColor(brown);
        
        //make arrays to store the x coordinates
        int[] xpoints = {200, 150, 250};
        int[] ypoints = {200, 100, 150, 150, 50, 100};
        
        //draw polygon with arrays that have the coordinates stored in them
        g.fillPolygon(xpoints, ypoints, 3);
        
        int[] xp2 = {250, 250, 350};
        int[] yp2 = {150, 50, 100};
        g.fillPolygon(xp2, yp2, 3);
          
        int[] xp3 = {200, 50, 150};
        int[] yp3 = {200, 150, 300};
        g.fillPolygon(xp3, yp3, 3);
        
        int[] xp4 = {350, 415, 450};
        int[] yp4 = {100, 0, 117};
        g.fillPolygon(xp4, yp4, 3);
        
        int[] xp5 = {450, 600, 550};
        int[] yp5 = {117, 50, 200};
        g.fillPolygon(xp5, yp5, 3);
                
        int[] xp6 = {550, 700, 600};
        int[] yp6 = {200, 150, 300};
        g.fillPolygon(xp6, yp6, 3);
        
        //make mouth
        Color red = new Color(250, 10, 42);
        g.setColor(red);
        int[] xp8 = {250, 300, 450, 500, 550};
        int[] yp8 = {450, 500, 500, 450, 400};
        g.drawPolyline(xp8, yp8, 4);
        
        //make eyes
        Color white = new Color(252, 252, 252);
        g.setColor(white);
        g.fillOval(200, 300, 100, 100);
        g.fillOval(450, 300, 100, 100);
        
        //make pupils
        g.setColor(Color.BLACK);
        g.fillOval(225, 350, 50, 50);
        g.fillOval(475, 350, 50, 50);
        
        //make nose
        int[] xp9 = {375, 325, 375};
        int[] yp9 = {375, 425, 425};
        g.drawPolyline(xp9, yp9, 3);
        
        //make eyebrows
        g.setColor(brown);
        g.fillArc(200, 250, 100, 50, 0, 180);
        g.fillArc(450, 250, 100, 50, 0, 180);
              
        //make eyes move
                 
        
        
        // GAME DRAWING ENDS HERE}
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
        question1 game = new question1();
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