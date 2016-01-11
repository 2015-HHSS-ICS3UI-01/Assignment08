
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author kulla6503
 */


public class A8 extends JComponent{

    // Height and Width of our game
    static final int WIDTH = 1000;
    static final int HEIGHT = 1000;
    
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000)/desiredFPS;
    int mouth = 750; 
    int eye = 500;
    int moveMouth = +1;
    int moveEye = +1; 
  

    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        // GAME DRAWING GOES HERE 
       Color silver = new Color(111,118,120); 
        g.setColor(silver);
        g.fillRect(0,0,1000,1000);
        
          //draw rect (x,y,width,height) 
          //filled rect
          //Making the outline
        Color Red = new Color(242, 5, 5); 
        g.setColor(Red);
        g.fillRect(0,300,50,50);
        g.fillRect(50,250,50,50);
        g.fillRect(50,200,50,50);
        g.fillRect(100,150,50,50);
        g.fillRect(150,150,50,50);
        g.fillRect(200,100,50,50);
        g.fillRect(250,100,50,50);
        g.fillRect(300,50,50,50);
        g.fillRect(350,50,50,50);
        g.fillRect(400,0,50,50);
        g.fillRect(450,0,50,50);
        g.fillRect(500,0,50,50);
        g.fillRect(550,0,50,50);
        g.fillRect(600,50,50,50);
        g.fillRect(650,50,50,50);
        g.fillRect(700,100,50,50);
        g.fillRect(750,100,50,50);
        g.fillRect(800,150,50,50);
        g.fillRect(850,150,50,50);
        g.fillRect(900,200,50,50);
        g.fillRect(900,250,50,50);
        g.fillRect(950,300,50,50);
        g.fillRect(0,350,50,50);
        g.fillRect(50,350,50,50);
        g.fillRect(100,350,50,50);
        g.fillRect(150,350,50,50);
        g.fillRect(200,350,50,50);
        g.fillRect(250,350,50,50);
        g.fillRect(300,350,50,50);
        g.fillRect(350,350,50,50);
        g.fillRect(400,300,50,50);
        g.fillRect(450,300,50,50);
        g.fillRect(500,300,50,50);
        g.fillRect(550,300,50,50);
        g.fillRect(600,350,50,50);
        g.fillRect(650,350,50,50);
        g.fillRect(700,350,50,50);
        g.fillRect(750,350,50,50);
        g.fillRect(800,350,50,50);
        g.fillRect(850,350,50,50);
        g.fillRect(900,350,50,50);
        g.fillRect(950,350,50,50);
        
        //Making the hat 
        Red = new Color(242, 5, 5); 
        g.setColor(Red);
        g.fillRect(50,300,50,50);
        g.fillRect(100,250,50,50);
        g.fillRect(100,200,50,50);
        g.fillRect(100,300,50,50);
        g.fillRect(150,300,50,50);
        g.fillRect(150,250,50,50);
        g.fillRect(150,200,50,50);
        g.fillRect(200,200,50,50);
        g.fillRect(200,150,50,50);
        g.fillRect(200,250,50,50);
        g.fillRect(200,300,50,50);
        g.fillRect(250,200,50,50);
        g.fillRect(250,150,50,50);
        g.fillRect(250,250,50,50);
        g.fillRect(250,300,50,50);
        g.fillRect(300,200,50,50);
        g.fillRect(300,150,50,50);
        g.fillRect(300,250,50,50);
        g.fillRect(300,300,50,50);
        g.fillRect(300,100,50,50);
        g.fillRect(350,100,50,50);
        g.fillRect(350,150,50,50);
        g.fillRect(350,200,50,50);
        g.fillRect(350,250,50,50);
        g.fillRect(350,300,50,50);
        g.fillRect(400,250,50,50);
        g.fillRect(400,200,50,50);
        g.fillRect(400,250,50,50);
        g.fillRect(400,150,50,50);
        g.fillRect(400,100,50,50);
        g.fillRect(400,50,50,50);
        g.fillRect(450,250,50,50);
        g.fillRect(450,200,50,50);
        g.fillRect(450,150,50,50);
        g.fillRect(450,100,50,50);
        g.fillRect(450,50,50,50);
        g.fillRect(500,250,50,50);
        g.fillRect(500,200,50,50);
        g.fillRect(500,150,50,50);
        g.fillRect(500,100,50,50);
        g.fillRect(500,50,50,50);
        g.fillRect(550,250,50,50);
        g.fillRect(550,200,50,50);
        g.fillRect(550,150,50,50);
        g.fillRect(550,100,50,50);
        g.fillRect(550,50,50,50);
        g.fillRect(600,100,50,50);
        g.fillRect(600,150,50,50);
        g.fillRect(600,200,50,50);
        g.fillRect(600,250,50,50);
        g.fillRect(600,300,50,50);
        g.fillRect(650,100,50,50);
        g.fillRect(650,150,50,50);
        g.fillRect(650,200,50,50);
        g.fillRect(650,250,50,50);
        g.fillRect(650,300,50,50);
        g.fillRect(700,150,50,50);
        g.fillRect(700,200,50,50);
        g.fillRect(700,250,50,50);
        g.fillRect(700,300,50,50);
        g.fillRect(750,150,50,50);
        g.fillRect(750,200,50,50);
        g.fillRect(750,250,50,50);
        g.fillRect(750,300,50,50);
        g.fillRect(800,200,50,50);
        g.fillRect(800,250,50,50);
        g.fillRect(800,250,50,50);
        g.fillRect(850,200,50,50);
        g.fillRect(850,250,50,50);
        g.fillRect(850,250,50,50);
        g.fillRect(800,300,50,50);
        g.fillRect(850,300,50,50);
        g.fillRect(900,300,50,50);
        
       //Making the outline for the face 
        Color blue = new Color(26, 180, 232); 
        g.setColor(blue);
        g.fillRect(0,400,50,50);    
        g.fillRect(0,450,50,50); 
        g.fillRect(0,500,50,50); 
        g.fillRect(0,550,50,50); 
        g.fillRect(0,600,50,50); 
        g.fillRect(0,650,50,50); 
        g.fillRect(0,700,50,50); 
        g.fillRect(950,400,50,50); 
        g.fillRect(950,450,50,50); 
        g.fillRect(950,500,50,50); 
        g.fillRect(950,550,50,50); 
        g.fillRect(950,600,50,50); 
        g.fillRect(950,650,50,50); 
        g.fillRect(950,700,50,50); 
                
        //Making the beard
        Color white = new Color(255, 255, 255); 
        g.setColor(white);
        g.fillRect(50,600,50,50); 
        g.fillRect(50,650,50,50); 
        g.fillRect(50,700,50,50);
        g.fillRect(0,550,50,50);   
        g.fillRect(0,600,50,50); 
        g.fillRect(0,650,50,50); 
        g.fillRect(0,700,50,50);
        g.fillRect(100,700,50,50); 
        g.fillRect(100,750,50,50);
        g.fillRect(150,700,50,50); 
        g.fillRect(200,700,50,50); 
        g.fillRect(250,700,50,50); 
        g.fillRect(300,700,50,50); 
        g.fillRect(350,700,50,50); 
        g.fillRect(600,700,50,50); 
        g.fillRect(650,700,50,50); 
        g.fillRect(700,700,50,50); 
        g.fillRect(750,700,50,50); 
        g.fillRect(800,700,50,50); 
        g.fillRect(850,700,50,50); 
        g.fillRect(900,700,50,50); 
        g.fillRect(850,650,50,50); 
        g.fillRect(900,650,50,50); 
        g.fillRect(950,700,50,50); 
        g.fillRect(950,650,50,50); 
        g.fillRect(950,600,50,50); 
        g.fillRect(950,550,50,50); 
        g.fillRect(900,600,50,50); 
        g.fillRect(100,650,50,50); 
        g.fillRect(150,750,50,50);
        g.fillRect(200,750,50,50);
        g.fillRect(250,750,50,50);
        g.fillRect(300,750,50,50);
        g.fillRect(350,750,50,50);
        g.fillRect(600,750,50,50);
        g.fillRect(650,750,50,50);
        g.fillRect(700,750,50,50);
        g.fillRect(750,750,50,50);
        g.fillRect(800,750,50,50);
        g.fillRect(850,750,50,50);
        g.fillRect(800,800,50,50);
        g.fillRect(750,800,50,50);
        g.fillRect(700,800,50,50);
        g.fillRect(650,800,50,50);
        g.fillRect(600,800,50,50);
        g.fillRect(550,800,50,50);
        g.fillRect(500,800,50,50);
        g.fillRect(450,800,50,50);
        g.fillRect(400,800,50,50);
        g.fillRect(350,800,50,50);
        g.fillRect(300,800,50,50);
        g.fillRect(250,800,50,50); 
        g.fillRect(200,800,50,50);
        g.fillRect(150,800,50,50);
        g.fillRect(200,850,50,50);
        g.fillRect(250,850,50,50);
        g.fillRect(300,850,50,50);
        g.fillRect(350,850,50,50);
        g.fillRect(400,850,50,50);
        g.fillRect(450,850,50,50);
        g.fillRect(500,850,50,50);
        g.fillRect(550,850,50,50);
        g.fillRect(600,850,50,50);
        g.fillRect(650,850,50,50);
        g.fillRect(700,850,50,50);
        g.fillRect(750,850,50,50);
        g.fillRect(700,900,50,50);
        g.fillRect(650,900,50,50);
        g.fillRect(600,900,50,50);
        g.fillRect(550,900,50,50);
        g.fillRect(500,900,50,50);
        g.fillRect(450,900,50,50);
        g.fillRect(400,900,50,50);
        g.fillRect(350,900,50,50);
        g.fillRect(300,900,50,50);
        g.fillRect(250,900,50,50);
        g.fillRect(350,650,50,50);
        g.fillRect(400,650,50,50);
        g.fillRect(450,650,50,50);
        g.fillRect(500,650,50,50);
        g.fillRect(550,650,50,50);
        g.fillRect(600,650,50,50);
        
         // Making the Tongue
        Color pink = new Color(196,59,93); 
        g.setColor(pink); 
        g.fillRect(450,mouth,50,50);
        g.fillRect(500,mouth,50,50);
        
          // Making the skin 
        blue = new Color(26, 180, 232); 
        g.setColor(blue);
        g.fillRect(400,700,50,50);
        g.fillRect(450,700,50,50);
        g.fillRect(500,700,50,50);
        g.fillRect(550,700,50,50);
        g.fillRect(400,750,50,50);
        g.fillRect(550,750,50,50);
        g.fillRect(50,400,50,50);
        g.fillRect(50,450,50,50);
        g.fillRect(50,500,50,50);
        g.fillRect(50,550,50,50);
        g.fillRect(50,600,50,50);
        g.fillRect(100,400,50,50);
        g.fillRect(100,450,50,50);
        g.fillRect(100,500,50,50);
        g.fillRect(100,550,50,50);
        g.fillRect(100,600,50,50);
        g.fillRect(150,400,50,50);
        g.fillRect(150,450,50,50);
        g.fillRect(150,500,50,50);
        g.fillRect(150,550,50,50);
        g.fillRect(150,600,50,50);
        g.fillRect(150,650,50,50);
        g.fillRect(200,400,50,50);
        g.fillRect(200,450,50,50);
        g.fillRect(200,500,50,50);
        g.fillRect(200,550,50,50);
        g.fillRect(200,600,50,50);
        g.fillRect(200,650,50,50);       
        g.fillRect(250,400,50,50);
        g.fillRect(250,450,50,50);
        g.fillRect(250,500,50,50);
        g.fillRect(250,550,50,50);
        g.fillRect(250,600,50,50);
        g.fillRect(250,650,50,50);       
        g.fillRect(300,400,50,50);
        g.fillRect(300,450,50,50);
        g.fillRect(300,500,50,50);
        g.fillRect(300,550,50,50);
        g.fillRect(300,600,50,50);
        g.fillRect(300,650,50,50);
        g.fillRect(350,400,50,50);
        g.fillRect(350,450,50,50);
        g.fillRect(350,500,50,50);
        g.fillRect(350,550,50,50);
        g.fillRect(350,600,50,50); 
        g.fillRect(400,350,50,50);
        g.fillRect(400,400,50,50);
        g.fillRect(400,450,50,50);
        g.fillRect(400,500,50,50);
        g.fillRect(400,550,50,50);
        g.fillRect(400,600,50,50);  
        g.fillRect(450,350,50,50);
        g.fillRect(450,400,50,50);
        g.fillRect(450,450,50,50);
        g.fillRect(450,500,50,50);
        g.fillRect(450,550,50,50);
        g.fillRect(450,600,50,50);        
        g.fillRect(500,350,50,50);
        g.fillRect(500,400,50,50);
        g.fillRect(500,450,50,50);
        g.fillRect(500,500,50,50);
        g.fillRect(500,550,50,50);
        g.fillRect(500,600,50,50);              
        g.fillRect(550,350,50,50);
        g.fillRect(550,400,50,50);
        g.fillRect(550,450,50,50);
        g.fillRect(550,500,50,50);
        g.fillRect(550,550,50,50);
        g.fillRect(550,600,50,50);        
        g.fillRect(600,400,50,50);
        g.fillRect(600,450,50,50);
        g.fillRect(600,500,50,50);
        g.fillRect(600,550,50,50);
        g.fillRect(600,600,50,50);
        g.fillRect(650,400,50,50);
        g.fillRect(650,450,50,50);
        g.fillRect(650,500,50,50);
        g.fillRect(650,550,50,50);
        g.fillRect(650,600,50,50);
        g.fillRect(650,650,50,50);        
        g.fillRect(700,400,50,50);
        g.fillRect(700,450,50,50);
        g.fillRect(700,500,50,50);
        g.fillRect(700,550,50,50);
        g.fillRect(700,600,50,50);
        g.fillRect(700,650,50,50);        
        g.fillRect(750,400,50,50);
        g.fillRect(750,450,50,50);
        g.fillRect(750,500,50,50);
        g.fillRect(750,550,50,50);
        g.fillRect(750,600,50,50);
        g.fillRect(750,650,50,50);        
        g.fillRect(800,400,50,50);
        g.fillRect(800,450,50,50);
        g.fillRect(800,500,50,50);
        g.fillRect(800,550,50,50);
        g.fillRect(800,600,50,50);
        g.fillRect(800,650,50,50);
        g.fillRect(850,400,50,50);
        g.fillRect(850,450,50,50);
        g.fillRect(850,500,50,50);
        g.fillRect(850,550,50,50);
        g.fillRect(850,600,50,50);
        g.fillRect(900,400,50,50);
        g.fillRect(900,450,50,50);
        g.fillRect(900,500,50,50);
        g.fillRect(900,550,50,50);
        
        //Making the Eyes
        g.setColor(white);
        g.fillRect(350,500,50,50);
        g.fillRect(650,500,50,50); 
        white = new Color(255, 255, 255); 
        g.setColor(white);
        g.fillRect(350,450,50,50);
        g.fillRect(300,450,50,50);
        g.fillRect(300,500,50,50);
        Color black = new Color(20, 19, 19); 
        g.setColor(black);
        g.fillRect(350,eye,50,50);     
        white = new Color(255, 255, 255); 
        g.setColor(white);
        g.fillRect(600,450,50,50);
        g.fillRect(650,450,50,50);
        g.fillRect(600,500,50,50);
        black = new Color(20, 19, 19); 
        g.setColor(black);
        g.fillRect(650,eye,50,50);   
        white = new Color(255, 255, 255); 
        
        
        //Making the nose 
        Color DarkBlue = new Color(10,127,166); 
        g.setColor(DarkBlue);
        g.fillRect(475,500,50,50);
        g.fillRect(450,550,50,50);
        g.fillRect(500,550,50,50);
        
        
      
        
        
        
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
            
            //Animation for mouth 
            mouth = mouth + moveMouth;
            if(mouth>800){
             moveMouth = -1;  
        } else if(mouth<750) {
            moveMouth = +1;
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