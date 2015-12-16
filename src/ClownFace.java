/*
 * create a spongebob squarepants program
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
    
    // create variable to store the hieght of the tongue
    int tongueHeight = 50;
    // create variable to determine if the tongue height is increasing or decreasing
    boolean tongueIncrease = true;
    // create a variable to store the height of the eyelids
    int lidsHeight = 0;
    // create a variable to store if the eyelids height is increasing or decreasing
    boolean lidsIncrease = true;
    // create varaible to store the height of the eyelashes
    int eyelashHeight = 40;
    // create a variable to store the x and y position offset of the both eyes
    int eyesXPosition = 0;
    int eyesYPosition = 0;
    // create a variable to store the current X and Y eyePositionMovement direction and speed
    int eyeXPositionMovement = 0;
    int eyeYPositionMovement = 0;
    // create a variable to store the next blink time in milliseconds
    long nextBlinkTime = 0;           
    // create a variable to store the x position of the teeth
    int teethPosition1 = 345;
    // create a variable to determine if the x position of the first tooth is increasing or decreasing
    boolean teethIncrease1 = false;
    // create a variable to determine if the x position of the second tooth is increasing or decreasing
    boolean teethIncrease2 = true;
    // create a variable to store the x position of the second tooth
    int teethPosition2 = 415;
 
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 100;
    long desiredTime = (1000)/desiredFPS;
   
    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        BufferedImage img = null;

        //  Load the background picture that Spongebob will be drawn on top of
        try {
            img = ImageIO.read( new File("SpongeBackground.jpg") );
        } catch (IOException e) {
        }
        
        g.drawImage(img, 0, 0, null);

        // GAME DRAWING GOES HERE 
        
        // colours
        Color brown = new Color(207,136,80); // (Pants)
        Color darkGreen = new Color(159, 196, 63); // (Face detail)
        Color darkRed = new Color(145, 36, 3); // (Mouth)
        Color lightPink = new Color(255, 167, 140); // (Tongue)
        
        // head outline
        g.setColor(Color.YELLOW);
        g.fillRect(150, 20, 500, 500);
        
        // shirt
        g.setColor(Color.WHITE);
        g.fillRect(150, 490, 500, 50);
        
        // pants
        g.setColor(brown);
        g.fillRect(150, 540, 500, 70);
        
        // detail of pants
        g.setColor(Color.BLACK);
        g.fillRect(170, 555, 90, 30);
        g.fillRect(290, 555, 90, 30);
        g.fillRect(415, 555, 90, 30);
        g.fillRect(535, 555, 90, 30);
        
        // tie
        g.setColor(Color.RED);
        g.fillArc(375, 445 + 20, 50, 50, 180, 180);
        int[] kiteX = {400, 420, 400, 380};
        int[] kiteY = {505, 535, 575, 535};
        g.fillPolygon(kiteX, kiteY, 4);
        
        // detail on shirt
        g.setColor(Color.BLACK);
        int[] triangleX = {280, 370, 325};
        int[] triangleY = {475, 475, 525};
        g.drawPolygon(triangleX, triangleY, 3);
        int[] triangleX2 = {430, 520, 475};
        int[] triangleY2 = {475, 475, 525};
        g.drawPolygon(triangleX2, triangleY2, 3);
        
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
        
        // sponge design
        // left
        g.setColor(Color.YELLOW);
        g.fillOval(125, 0, 50, 50);
        g.fillOval(125, 50, 50, 50);
        g.fillOval(125, 100, 50, 50);
        g.fillOval(125, 150, 50, 50);
        g.fillOval(125, 200, 50, 50);
        g.fillOval(125, 250, 50, 50);
        g.fillOval(125, 300, 50, 50);
        g.fillOval(125, 350, 50, 50);
        g.fillOval(125, 400, 50, 50);
        g.fillOval(125, 450, 50, 50);
        // bottom
        g.fillOval(125, 450, 50, 50);
        g.fillOval(175, 450, 50, 50);
        g.fillOval(225, 450, 50, 50);
        g.fillOval(275, 450, 50, 50);
        g.fillOval(325, 450, 50, 50);
        g.fillOval(375, 450, 50, 50);
        g.fillOval(425, 450, 50, 50);
        g.fillOval(475, 450, 50, 50);
        g.fillOval(525, 450, 50, 50);
        g.fillOval(575, 450, 50, 50);
        g.fillOval(625, 450, 50, 50);
        // right side
        g.fillOval(625, 0, 50, 50);
        g.fillOval(625, 50, 50, 50);
        g.fillOval(625, 100, 50, 50);
        g.fillOval(625, 150, 50, 50);
        g.fillOval(625, 200, 50, 50);
        g.fillOval(625, 250, 50, 50);
        g.fillOval(625, 300, 50, 50);
        g.fillOval(625, 350, 50, 50);
        g.fillOval(625, 400, 50, 50);
        g.fillOval(625, 450, 50, 50);
        // top
        g.fillOval(125, 0, 50, 50);
        g.fillOval(175, 0, 50, 50);
        g.fillOval(225, 0, 50, 50);
        g.fillOval(275, 0, 50, 50);
        g.fillOval(325, 0, 50, 50);
        g.fillOval(375, 0, 50, 50);
        g.fillOval(425, 0, 50, 50);
        g.fillOval(475, 0, 50, 50);
        g.fillOval(525, 0, 50, 50);
        g.fillOval(575, 0, 50, 50);
        g.fillOval(625, 0, 50, 50);
        
        // face detail
        g.setColor(darkGreen);
        // left top
        g.fillOval(170, 40, 40, 60);
        g.fillOval(160, 110, 30, 30);
        // left bottom
        g.fillOval(160, 410, 40, 60);
        g.fillOval(170, 370, 30, 30);
        // right bottom
        g.fillOval(600, 370, 40, 60);
        g.fillOval(590, 440, 30, 30);
        // right top
        g.fillOval(590, 40, 50, 50);
        
        // eyes
        // eyelashes
        // 1st set
        g.setColor(Color.BLACK);
        g.fillRect(290, 80, 20, eyelashHeight);
        g.fillRect(235, 100, 20, eyelashHeight);
        g.fillRect(345, 100, 20, eyelashHeight);
        // 2nd set
        g.fillRect(490, 80, 20, eyelashHeight);
        g.fillRect(435, 100, 20, eyelashHeight);
        g.fillRect(545, 100, 20, eyelashHeight);
        // 1st outline of eyes
        g.setColor(Color.WHITE);
        g.fillOval(200, 120, 200, 180);
        g.fillOval(400, 120, 200, 180);
        // 2nd outline of eyes
        g.setColor(Color.BLACK);
        g.fillOval(300 - 35 + eyesXPosition , 175 + eyesYPosition, 80, 80);
        g.fillOval(425 + 35 + eyesXPosition , 175 + eyesYPosition, 80, 80);
        // 3rd outline of eyes
        Color lightBlue = new Color(10,186,209);
        g.setColor(lightBlue);
        g.fillOval(435 + 35 + eyesXPosition , 184 + eyesYPosition, 60, 60);
        g.fillOval(310 - 35 + eyesXPosition , 184 + eyesYPosition, 60, 60);
        // 4th outline of eyes
        g.setColor(Color.BLACK);
        g.fillOval(325 - 35 + eyesXPosition , 200 + eyesYPosition, 30, 30);
        g.fillOval(450 + 35 + eyesXPosition , 200 + eyesYPosition, 30, 30);
        
        // mouth
        g.setColor(darkRed);
        g.fillArc(200, 250, 400, 200, 180, 180);
        
        // teeth
        g.setColor(Color.WHITE);
        g.fillRect(teethPosition1, 350, 45, 45);
        g.fillRect(teethPosition2, 350, 45, 45);
        
        // tongue
        g.setColor(lightPink);
        g.fillRoundRect(360, 400, 80, tongueHeight, 30, 30);
        
        // dimples 
        g.setColor(Color.BLACK);
        g.drawArc(180, 325, 45, 45, 20, 200);
        g.drawArc(570, 325, 45, 45, 340, 160);
        
        // nose
        g.drawArc(380, 285, 40, 80, 0, 180);
        
        // eye lids
        g.setColor(Color.YELLOW);
        g.fillOval(200, 120, 200, lidsHeight);
        g.fillOval(400, 120, 200, lidsHeight);
        
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
        
        // delay game
        try{
            Thread.sleep(1000);
        } catch(Exception e){
            e.printStackTrace();
        }
        
        while(!done)
        {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();
            
            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE
            
            // move the tongue in or out of the mouth with each loop
            // of the game until it's fully in or fully out
            if(tongueIncrease){
                if(tongueHeight < 120){
                    tongueHeight++;
                }else{
                    tongueIncrease = false;
                }
            } else{
                if(tongueHeight > 50){
                    tongueHeight--;
                } else{
                    tongueIncrease = true;
                }
            }
            
            // Move the eyelids up and down over top of the eyes to simulate
            // blinking of the eyelids.   Delay movement of the eyelid
            // to simulate the blink of a real person.    
            // To simulate the eyelid open and closing, increate and decrease the 
            // each time it's drawn
            if ( nextBlinkTime < System.currentTimeMillis() ) {
                if(lidsIncrease){
                    if(lidsHeight < 180){
                        lidsHeight += 8;
                        eyelashHeight = 0;
                    } else{
                       lidsIncrease = false;
                       eyelashHeight = 0;
                    }
                } else{
                    if(lidsHeight > 0){
                        lidsHeight -= 8;
                        eyelashHeight = 0;
                    } else{
                        lidsIncrease = true;
                        eyelashHeight = 40;
                        
                        // determine the next blink time in milliseconds from now
                        // the eyes should blink from 3-5 seconds from now
                        nextBlinkTime = System.currentTimeMillis() + 2000 + (long) (Math.random() * 3000.0);
                        
                    }
                }
            } 
               
            // Move the position of the eye to simulate a living spongebob 
            // Randomize the movement of the eyes to make is slightly more realistic
            if ( (int) (Math.random() * 20.0) == 1 ) {
                // determine the eye direction for X and Y but only compute a new direction 
                // every so often randomly to make it more realistic
                if ( Math.random() >= 0.5 ) {
                    eyeXPositionMovement = -1;
                } else {
                    eyeXPositionMovement = +1;
                }
                if ( Math.random() >= 0.5 ) {
                    eyeYPositionMovement = -1;
                } else {
                    eyeYPositionMovement = +1;
                }
            }

            // Move eye1 provide it doesn't move he pupil outside of the eye
            if ( (eyesXPosition + eyeXPositionMovement ) > -45 && 
                 (eyesXPosition + eyeXPositionMovement ) < 45 ) {
                eyesXPosition += eyeXPositionMovement;
            }
            // Move eye2 provide it doesn't move he pupil outside of the eye
            if ( (eyesYPosition + eyeYPositionMovement ) > -25 && 
                 (eyesYPosition + eyeYPositionMovement ) < 25 ) {
                eyesYPosition += eyeYPositionMovement;
            }
 
            // Move the teeth in the mouth to make the character more interesting
            if(teethIncrease1){
                if(teethPosition1 < 347){
                    teethPosition1++;
                }else{
                    teethIncrease1 = false;
                }
            }else{
                if(teethPosition1 > 327){
                    teethPosition1--;
                } else{
                    teethIncrease1 = true;
                }
            }
            
            if(teethIncrease2){
                if(teethPosition2 < 433){
                    teethPosition2++;
                }else{
                    teethIncrease2 = false;
                }
            }else{
                if(teethPosition2 > 413){
                    teethPosition2--;
                } else{
                    teethIncrease2 = true;
                }
            }
            
            // GAME LOGIC ENDS HERE 
            
            // update the drawing of the character (calls paintComponent)
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