
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author iorgs3184
 */


public class FACE extends JComponent{

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000)/desiredFPS;

    //eye brow moving
    int Y = 260;
    int browchange = -1;
    
    //ears moving
    int X1 = 455;
    int X2 = 250;
    int rightEar = -1;
    int leftEar = -1;
            
            
            
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        // GAME DRAWING GOES HERE 
        //face
        Color skin = new Color(217,165,93);
        g.setColor(skin);
        g.fillOval(275, 200, 225, 250);
        
        //eyes
        g.setColor(Color.WHITE);
        g.fillOval(320, 277, 42, 35);
        g.fillOval(410, 277, 42, 35);
        
        //pupils
        Color pupils = new Color(50, 185, 230);
        g.setColor(pupils);
        g.fillOval(333, 288, 15, 15);
        g.fillOval(423, 288, 15, 15);
        
        //mouth
        g.setColor(Color.BLACK);
        g.fillArc(350, 335, 75, 75, 180, 180);
        
        //teeth
        g.setColor(Color.WHITE);
        g.fillRect(375, 373, 25, 18);
        g.setColor(Color.BLACK);
        g.drawRect(375, 373, 25, 18);
        g.drawLine(387, 373, 387, 391);
        
        //ears
        g.setColor(skin);
        g.fillOval(X1, 275, 65, 100);
        g.fillOval(X2, 275, 65, 100);
        
        //nose
        int[] xpoints = {390, 390, 360};
        int[] ypoints = {310, 350, 350};
        Color nose  = new Color(196, 122, 73);
        g.setColor(nose);
        g.fillPolygon(xpoints, ypoints, 3);
        
        //EYE BROW
        g.setColor(Color.BLACK);
        g.fillRect(300, Y, 175, 8);
        
        //hair
        g.drawArc(310, 153, 100, 100, 360, 50);
        g.drawArc(300, 150, 100, 100, 360, 50);
        g.drawArc(290, 150, 100, 100, 360, 50);
        g.drawArc(280, 150, 100, 100, 360, 50);
        g.drawArc(270, 152, 100, 100, 360, 50);
        

        
        
        
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
            
            //brow moving
            if(Y < 220){
                browchange = +1;
            }
            if(Y > 260){
                browchange = -1;
            }           
            Y = Y + browchange;
            
            // right ear moving
            if(X1 < 470){
                rightEar = +1;
            }
            if(X1 > 455){
                rightEar = -1;
            }
            X1 = X1 + rightEar;
            
            
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
        FACE game = new FACE();
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