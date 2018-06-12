package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author baxl2873
 */
public class newJava_Game_Class extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    

 Color pale = new Color(249, 247, 127);

 int leftpupil = 30;
 int rightpupil = 30;

 
 // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public newJava_Game_Class(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

     
        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
       //set the colour
     g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        
        // GAME DRAWING GOES HERE
      // draw head
        g.setColor(pale);
        g.fillOval(275, 125, 325, 400);
       g.setColor(Color.BLACK);
        g.drawOval(275, 125, 325, 400);
      // draw eyes
        g.setColor(Color.WHITE);
        g.fillOval(335, 210, 65, 65);
        g.fillOval(500, 210, 65, 65);
     // draw pupils   
        g.setColor(Color.BLACK);
         g.fillOval(335, 220, 30, leftpupil);
        g.fillOval(500, 220, 30, rightpupil);
        
        // make teeth, mouth, and a tongue
        g.fillArc(347, 400, 200, 100, 0, 180);
        g.setColor(Color.WHITE);
        g.fillRect(425, 400, 13, 18);
        g.fillRect(440, 400, 13, 18);
        g.setColor(Color.RED);
        g.fillArc(395, 425 , 100, 50, 0, 180);
        
        // make eyebrows
        g.setColor(Color.BLACK);
        g.drawLine(350, 190, 400, 210);
        g.drawLine(485, 210, 535, 195);
        
        // make nose
        g.setColor(Color.BLACK);
        g.drawArc(410, 325, 55, 20, 0, 180);
        g.fillOval(422, 330, 5, 5);
        g.fillOval(445, 330, 5, 5);
        
    
       
		
		
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {

    }
    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
    
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        newJava_Game_Class game = new newJava_Game_Class();
    }
}

