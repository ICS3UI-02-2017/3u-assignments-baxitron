package examples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
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
public class DrawingExample extends JComponent implements ActionListener {

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
 int pacmanX = 100;
 int pacmanY = 400;
int pacmanAngle = 45;
int pacmanRotate = 270;
boolean pacmanClosing = true;

int mouseX = 0;
int mouseY = 0;

//game controls
boolean moveUp = false;
boolean moveDown = false;


    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public DrawingExample(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        Color Pale = new Color(249, 247, 127);
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
     g.setColor(Color.BLACK);
        // GAME DRAWING GOES HERE
       // draw a filled in rectangle
        g.fillRect(100, 75, 150, 50);
        // (x, y, Width, and height^^^)
      
       g.setColor(Color.GREEN);
        // draw anything that is an "oval"
        // (x,7,width,height)
        g.fillOval(100, 75, 150, 50);
         g.fillOval(100, 125, 150, 50);
         
        // draw a black outline around an oval
         g.setColor(Color.black);
         g.drawOval(100, 75, 150, 50);
         
         // rounded corners (x,y,width,height, radius width, radius height
        g.fillRoundRect(300, 75, 150, 50, 20, 20);
        
        int[] triangleX = {mouseX,600, 450};
        int[] triangleY = {mouseY, 500, 500};
	// array of x points array of y points, number of points
        g.fillPolygon(triangleX, triangleY, 3);
        
        g.setColor(Color.yellow);
        // (x,y,width,height,start angle, amount to rotate)
        g.fillArc(pacmanX,pacmanY,100, 100, pacmanAngle, pacmanRotate);
       
        g.setColor(Color.black);
        g.drawLine(250, 125, 500, 400);
     
       
        g.fillRect(100, 75, 150, 50);
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
     pacmanX = pacmanX + 1;
     
     // when pacman leaves the the screen
     if(pacmanX > WIDTH){
         pacmanX = -100;
     }
     if(pacmanAngle <= 0) {
         pacmanClosing = false;
     }
     if(pacmanAngle >= 45){
         pacmanClosing = true;
     }
     // make pacman roll
  if(pacmanClosing){
     pacmanAngle = pacmanAngle - 1;

     pacmanRotate = pacmanRotate + 2;
  }else{
       pacmanAngle = pacmanAngle + 1;

     pacmanRotate = pacmanRotate - 2;
 
  if(moveUp){
      pacmanY = pacmanY - 3;
  }else if(moveDown){pacmanY = pacmanY + 3;
  }
  
  }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
mouseX = e.getX();
mouseY = e.getY();
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
int keyCode = e.getKeyCode();

if(keyCode == KeyEvent.VK_W){
    moveUp = true;
}else if(keyCode == KeyEvent.VK_S){
    moveDown = true;
}
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
int keyCode = e.getKeyCode();
  if(keyCode == KeyEvent.VK_W){
    moveUp = false;
}else if(keyCode == KeyEvent.VK_S){
    moveDown = false;
}
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
        DrawingExample game = new DrawingExample();
    }
}

