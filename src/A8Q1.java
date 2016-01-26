import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author eadil1765
 */


public class A8Q1 extends JComponent{

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
  g.setColor(Color.BLACK);
  for(int x = 0; x < WIDTH; x = x +50){
      g.drawLine(x,0,x, HEIGHT);
  }
  for (int y = 0; y < HEIGHT; y = y +50){
      g.drawLine(0, y, WIDTH, y);
  }
 //face circle
  Color skincolor = new Color(227,220,177);
  g.setColor (skincolor);
  g.fillOval(150, 100, 450, 500);
  
  //eyes
  g.setColor(Color.WHITE);
  g.fillOval(200, 230, 130, 130);
  
  g.setColor(Color.WHITE);
  g.fillOval(410, 230, 130, 130);
  
  g.setColor(Color.BLACK);
  g.fillOval(450, 270, 50, 50);
  
  g.setColor(Color.BLACK);
  g.fillOval(240, 270, 50, 50);
  
  //Make the mouth
  g.setColor(Color.BLACK);
  g.fillOval(400,420,100,100); 
  
  //eyebrows
  g.setColor(Color.GRAY);
  g.fillRect(200, 200, 100, 30);
  
  g.setColor(Color.GRAY);
  g.fillRect(450, 200, 100, 30);
  
 
  
  
  
  
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
        A8Q1 game = new A8Q1();
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