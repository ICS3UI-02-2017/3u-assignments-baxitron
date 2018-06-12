
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
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
public class newJava_Game_Class extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1100;
    static final int HEIGHT = 900;

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
   
  // paddle integers
    int padOneX = (WIDTH/2) - 45;
    int padTwoX = (WIDTH/2) - 45;
     Rectangle paddle1 = new Rectangle(padOneX,8, 90, 10);
     Rectangle paddle2 = new Rectangle(padTwoX, 885, 90, 10);
// ball integers
 int ballX = 550;
 int ballY = (HEIGHT/2) - 3;
Rectangle ball = new Rectangle(ballX, ballY, 10, 10);
int ballAngle = 45;
int ballSpeed = 5;
// mouse integers
int mouseX = 0;
int mouseY = 0;
//game controls
boolean moveLeft = false;
boolean moveRight = false;
boolean moveLeft2 = false;
boolean moveRight2 = false;
 Color lime = new Color(84, 255, 0);
 boolean ballup = true;
 boolean balldown = true;
 
 // player scores
    int score1 = 0;
    int score2 = 0;
    
    // create a custom font
    Font biggerFont = new Font("arial", Font.BOLD, 36);
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
       g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // GAME DRAWING GOES HERE
  g.setColor(lime);
    // make paddles   
  g.fillRect(padOneX, 8, 90, 10);
    g.fillRect(padTwoX, 885, 90, 10);
	// make a ball
    g.fillRect(ballX, ballY, 12, 12);
	
     // draw the scores
       g.setFont(biggerFont);
        g.drawString("" + score1, WIDTH/2 - 400, 50);
        g.drawString("" + score2, WIDTH/2 - 400, 850);
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
 // if the paddle leaves the screen 
        if(padOneX > WIDTH){
         padOneX = -100;
     }
        if(padOneX < -150){
            padOneX = padOneX + 1250;
        }
        if(padTwoX > WIDTH){
         padTwoX = -100;
     }
        if(padTwoX < -150){
            padTwoX = padTwoX + 1250;
        }
     
        // to move left and right
       if(moveLeft){
       padOneX= padOneX - 10;
  }else if(moveRight){padOneX = padOneX + 10;
  }
      if(ballY <= 8){
          balldown = true;
      }
      if (ballY >= 885) {
          ballup = true;
      }
      if(ballup){
          ballY = ballY - 1;
      }
      if(balldown) {
          ballY = ballY + 1;
         
      }
       if(moveLeft2){
       padTwoX= padTwoX - 10;
  }else if(moveRight2){padTwoX = padTwoX + 10;
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

if(keyCode == KeyEvent.VK_A){
    moveLeft = true;
}else if(keyCode == KeyEvent.VK_D){
    moveRight = true;
}
if(keyCode == KeyEvent.VK_SPACE){
  
 
}
if(keyCode == KeyEvent.VK_LEFT){
    moveLeft2 = true;
}else if(keyCode == KeyEvent.VK_RIGHT){
    moveRight2 = true;
}
if(keyCode == KeyEvent.VK_SPACE){
    ballY = ballY + 30;
 
}
 
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
int keyCode = e.getKeyCode();
  if(keyCode == KeyEvent.VK_A){
    moveLeft = false;
}else if(keyCode == KeyEvent.VK_D){
    moveRight = false;
}
   if(keyCode == KeyEvent.VK_LEFT){
    moveLeft2 = false;
}else if(keyCode == KeyEvent.VK_RIGHT){
    moveRight2 = false;
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
        newJava_Game_Class game = new newJava_Game_Class();
    }
}

