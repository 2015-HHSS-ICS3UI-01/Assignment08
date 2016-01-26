

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author preej0747
 */


public class GraphicsExample extends JComponent{

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000)/desiredFPS;
    

    int pacmanx = 200;
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        // GAME DRAWING GOES HERE 
        //draw line (x1, y1, x2, y2)
        g.drawLine(100, 50, 600, 400);
        
        //draw Rect (x, y, width, height)
        g.fillRect(300, 100, 100, 75);
        
        //filled in rectangle
        Color purple = new Color(101, 16, 204);
        g.setColor(purple);
        g.fillRect(410, 100, 100, 75);
        
        //draw an oval (x, y, width, height)
        g.setColor(Color.ORANGE);
        g.fillOval (50, 400, 100, 150);
        
        //draw and arc (x, y, width, height, start angle, angle of rotation)
        g.setColor(Color.yellow);
        g.fillArc(pacmanx, 80, 125, 125, 45, 270);
        
        //draw a polygon
        int[] xpoints = {400, 500, 300};
        int[] ypoints = {400, 550, 550};
        g.setColor(Color.RED);
        g.fillPolygon(xpoints, ypoints, 3);
        
        g.setColor(Color.black);
        for(int x = 0; x <  WIDTH; x = x + 50){
            g.drawLine(x, 0, x, HEIGHT);
        }
        for(int y = 0; y < HEIGHT; y = y + 50){
            g.drawLine(0, y, WIDTH, y);
        }
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
        GraphicsExample game = new GraphicsExample();
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
