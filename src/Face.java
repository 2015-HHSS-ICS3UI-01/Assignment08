

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author malcr1272
 */


public class Face extends
        JComponent{
    
    //set variable for right pupil
    int x = 475;
    //set speed to move at
    int moveX = 1;
    
    //set variable for left pupil
    int x2 = 285;
    //set speed to move at
    int moveX2 = 1;

    // Height and Width of our game
    static final int WIDTH = 800;
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
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        // GAME DRAWING GOES HERE 
        //create graph in background
        for(int i = 0; i <= 30; i++){
        g.drawLine(i * 50, 0, i * 50, HEIGHT);
        g.drawLine(0, i * 50, WIDTH, i * 50);
        }
        //make hair
        Color brown = new Color(130,74,23);
        g.setColor(brown);
        g.fillOval(200, 75, 400, 400);
        
        //create face
        Color beige = new Color(250,207,172);
        g.setColor(beige);
        g.fillOval(200, 150, 400, 400);
        
        //make left eye and black borderline
        g.setColor(Color.WHITE);
        g.fillOval(240, 225, 150, 150);
        
        g.setColor(Color.BLACK);
        g.drawOval(240, 225, 150, 150);
        
        //create left pupil
        g.fillOval(x2, 285, 35, 35);
        
        //make right eye and back borderline
        g.setColor(Color.WHITE);
        g.fillOval(415, 225, 150, 150);
        
        g.setColor(Color.BLACK);
        g.drawOval(415, 225, 150, 150);
        
        //make right pupil
        g.fillOval(x, 285, 35, 35);
        
        //make nose
        g.drawArc(375, 350, 125, 50, ABORT, ABORT);
      
        //make the mouth and black borderline
        g.setColor(Color.RED);
        g.fillOval(315, 425, 185, 60);
        
        g.setColor(Color.BLACK);
        g.drawOval(315, 425, 185, 60);
        
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
            
            //make right pupil move back and forth in the eye
            x = x + moveX;
         
            if (x > 530){
            moveX = -1;
            }
            if (x < 415){
            moveX = + 1;
            }
            //make left pupil move back and forth in the eye
            x2 = x2 + moveX2;
            
            if (x2 > 355){
            moveX2 = - 1;
            }
            
            if (x2 < 240){
            moveX2 = + 1;
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
        Face game = new Face();
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