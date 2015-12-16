
import java.awt.Color;









import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author lalim9800
 */


public class Face extends JComponent{

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
        Color green= new Color(32,201,60);
        
        //make top of hair 
        g.setColor(green); //set custom color
        g.fillOval(115, 90, 150, 150);
        g.fillOval(165, 60, 150, 150);
        g.fillOval(200, 40, 150, 150);
        g.fillOval(250,30 ,150 ,150 );   
        g.fillOval(300,30 ,150 ,150 );   
        g.fillOval(355,40 ,150 ,150 );   
        g.fillOval(425,85 ,150 ,150 );  
       
         
        
        
        
        
        
        
        //make right side of hair 
         g.setColor(green); //set custom color
         g.fillOval(485, 150, 150, 150);
         g.fillOval(520, 240, 150,150);
         g.fillOval(530, 325, 150,150);
        
        
        //make left side of hair 
        g.setColor(green); //set custom color 
        g.fillOval(70, 150, 150, 150);
        g.fillOval(35, 250, 150,150);
        g.fillOval(20, 350, 150, 150);
       
        g.setColor(Color.WHITE);
        //make main head shape 
        g.fillOval(100, 75,500, 500);
        
        //make eyes 
        g.setColor(Color.BLACK);
        g.fillOval(260, 230, 60, 80);
        g.fillOval(360, 230, 60, 80);
        
        //make eye outline 
        g.setColor(Color.BLACK);
        g.drawOval(250, 215, 100, 100);
        g.drawOval(350, 215, 100, 100);
        
        //draw nose 
         g.setColor(Color.red);
        g.fillOval(275,280 ,150 ,150 );   
        
        //make smile 
        g.fillArc(215,300, 270, 270, 177, 190);
        
        
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
