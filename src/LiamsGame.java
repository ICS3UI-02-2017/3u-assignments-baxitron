
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

// Used to implement any of the Mouse Actions
/**
 *
 * @author baxl2873
 */
public class LiamsGame extends JComponent implements ActionListener {

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
    Rectangle paddle1 = new Rectangle(505, 8, 90, 10);
    Rectangle paddle2 = new Rectangle(505, 885, 90, 10);
    Rectangle powerup1 = new Rectangle (540,440, 35,35);
    Rectangle powerup2 = new Rectangle (540,440, 35,35);
    Rectangle powerup3 = new Rectangle (540, 440, 35, 35);
   Rectangle barrier1 = new Rectangle (540, 440, 50, 50);
    // ball integers
    Rectangle ball = new Rectangle(550, 447, 10, 10);
    int ballAngle = 45;
    int ballAngle2 = 55;
    int ballAngle3 = 60;
    int ballAngle4 = 65;
    int ballSpeed = 10;
    
    
    // start game
    boolean startgame = false;
// power up integers
    int paddle1speed = 10;
    int paddle2speed = 10;
    int paddlePowerUp1 = 15;
    int paddlePowerUp2 = 100;
    int ballpowerup3 = 11;
    
// mouse integers
    int mouseX = 0;
    int mouseY = 0;
//game controls
    boolean moveLeft = false;
    boolean moveRight = false;
    boolean moveLeft2 = false;
    boolean moveRight2 = false;
    Color lime = new Color(84, 255, 0);
    // player scores
    int score1 = 0;
    int score2 = 0;
   int sumscore = (score1 + score2);
    int powerUpX = 540;
    
    boolean player1hit = false;
    boolean player2hit = false;
    boolean leftwallhit = false;
    boolean rightwallhit = false;
    boolean endgame = false;
    int movePowerUp = 7;
    int moveBarrier = 4;
    
   // create a custom font
     int gamestartfontsize = 48;
    Font biggerFont = new Font("arial", Font.BOLD, 36);
     Font gamestartfont = new Font("arial", Font.BOLD, gamestartfontsize);
  int HeightPressSpace = 450;
     // GAME VARIABLES END HERE    

    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public LiamsGame() {
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

        gameTimer = new Timer(desiredTime, this);
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
        g.fillRect(paddle1.x, paddle1.y, paddle1.width, paddle1.height);
        g.fillRect(paddle2.x, paddle2.y, paddle2.width, paddle2.height);

        //draw the  ball
        g.fillRect(ball.x, ball.y, ball.width, ball.height);
        // split the paddles 
       g.setColor(Color.BLACK);
      if (score1>= 10){
       endgame = true; 
       g.setColor(lime);
        g.setFont(gamestartfont);
        g.drawString("Player One Wins! ", WIDTH /2 - 220, HEIGHT / 2);
        ballSpeed = 0;
    }else{ if (score2>= 10){
       endgame = true; 
         g.setFont(gamestartfont);
       g.setColor(lime);
        g.drawString("Player Two Wins! ", WIDTH /2 - 220, HEIGHT /2);
   ballSpeed = 0;
    }
       // end game 
       if(endgame){
           g.setColor(Color.BLACK);
           g.fillRect(0, 0, 1100, 900);
       }
       
       // draw the scores
       g.setColor(lime);
        g.setFont(biggerFont);
        g.drawString("" + score1, WIDTH / 2 - 400, 50);
        g.drawString("" + score2, WIDTH / 2 - 400, 850);
       
        // press space to start
        
         g.setFont(gamestartfont);
          g.drawString("Press space to play", WIDTH/2 - 220, HeightPressSpace);
        if (startgame){
            HeightPressSpace = -500;
        }
        if (score1 + score2 >= 2){
           g.setColor(Color.RED);
            g.fillRect(barrier1.x, barrier1.y, barrier1.width, barrier1.height);
        }
        
         if(score1 + score2 == 3){
         g.fillRect(powerup1.x,powerup1.y, powerup1.width, powerup1.height);
         }
         if(score1 + score2 == 5){
             g.setColor(Color.ORANGE);
             g.fillRect(powerup2.x,powerup2.y, powerup2.width, powerup2.height);
         }
         if(score1 + score2 == 7){
             g.setColor(Color.cyan);
             g.fillRect(powerup3.x, powerup3.y,powerup3.width, powerup3.height);
         }
    
    }}
        // GAME DRAWING ENDS HERE
    

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
   if (player1hit = true){
       player2hit = false;
   }else{ if (player2hit= true){
       player1hit = false;
   }
    }
    }
    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        moveBall();
        movePaddles();
        checkForCollision();
        checkForGoal();
        powerups();
    }

    private void moveBall() {

        double newAngle = Math.toRadians(ballAngle);
        if (startgame == true){
        // determine how much to move ball x and ball y using trig
        double moveX = ballSpeed * Math.sin(newAngle);
        double moveY = ballSpeed * Math.cos(newAngle);
        
        // move the ball
       
        ball.x = ball.x + (int) moveX;
        ball.y = ball.y + (int) moveY;

    }
    // change ball angles throughout the game
        if ((sumscore) >= 3  && (sumscore) < 5){
       ballAngle = ballAngle2; 
    }
    if ((sumscore) >= 5 && (sumscore) < 7){
       ballAngle = ballAngle3; 
    }
     if ((sumscore) >= 7){
       ballAngle = ballAngle4; 
    }
    }

    private void checkForCollision() {
        // collision with sides
        if (ball.x < 0) {
            ball.x = (ball.x + 5);
            ballAngle = ballAngle * -1;
           leftwallhit = true;
           rightwallhit = false;
        }
        if (ball.x + ball.width > WIDTH) {
          ball.x = (ball.x -5);
            ballAngle = ballAngle * -1;
            rightwallhit = true;
            leftwallhit = false;
        }
        // % 360 makes sure we dont go over 360 degrees
       //code for ball hitting paddle coming from left
       // ball hits left side of paddle1 from left
        if (ball.intersects(paddle1)&& (ball.x + 5) <= (paddle1.x + 30) && (leftwallhit = true)) {
           ball.y=ball.y + 4;
            ballAngle = (ballAngle * -1);
       player1hit = true;
       
       
        }
        // ball hits left side of paddle1 from right
          if (ball.intersects(paddle1)&& (ball.x + 5) <= (paddle1.x + 30) && (rightwallhit = true)) {
              ball.y = ball.y + 4;
              ballAngle = (90 + ballAngle * -1);
       player1hit = true;
       
              System.out.println("1");
        }
          // ball hits paddle 1 middle 
          if (ball.intersects(paddle1)&& (paddle1.x + 60) > (ball.x + 5) && (ball.x + 5) > (paddle1.x + 30)) {
           ball.y = ball.y + 4;
              ballAngle = (90 + ballAngle*-1);
       player1hit = true;
              System.out.println("2");
    
          }
          // if ball hits right side of paddle1 from left
            if (ball.intersects(paddle1)&& (ball.x + 5) >= (paddle1.x + 60) && (leftwallhit = true)) {
            ball.y = ball.y + 4;
                ballAngle = (90 + ballAngle*-1);
       player1hit = true;
                System.out.println("3");
       
        }
    // if ball hits right side of paddle1 from right
    if (ball.intersects(paddle1)&& (ball.x + 5) >= (paddle1.x + 60) && (rightwallhit = true)) {
     ball.y = ball.y + 4;
        ballAngle = (ballAngle * -1 );
     player1hit = true;
     
    }
            // if ball hits left side of paddle 2 from left
             if (ball.intersects(paddle2)&& (ball.x + 5) <= (paddle2.x + 30) && (leftwallhit = true)) {
           ball.y=ball.y-4;
                 ballAngle = ( ballAngle * -1);
       player2hit = true;
      
       
        }
             // if ball hits left side of paddle2 from the right
               if (ball.intersects(paddle2)&& (ball.x + 5) <= (paddle2.x + 30) && (rightwallhit = true)) {
             ball.y=ball.y-4;
                   ballAngle = (90 + ballAngle);
       player2hit = true;
      
       
        }
               // if ball hits middle of paddle 2
          if (ball.intersects(paddle2)&& (paddle2.x + 60) > (ball.x + 5) && (ball.x + 5) > (paddle2.x + 30)) {
           ball.y=ball.y-4;
              ballAngle = (90 + ballAngle * -1  );
       player2hit = true;
       
          }
          //if ball hits right side of paddle2 from right
           if (ball.intersects(paddle2)&& (ball.x + 5) >= (paddle2.x + 60) && (rightwallhit = true)) {
            ball.y=ball.y-4;
               ballAngle = (ballAngle * -1);
       player2hit = true;
       
       
        }
             //if ball hits right side of paddle2 from left
           if (ball.intersects(paddle2)&& (ball.x + 5) >= (paddle2.x + 60) && (leftwallhit = true)) {
            ball.y=ball.y-4;
               ballAngle = (90+ballAngle * -1);
       player2hit = true;
      
       
        }
          
            
          
    
      
     // if ball hits powerup 1
        if (ball.intersects(powerup1) && (player1hit == true) && (score1 + score2==3)){
   paddle1speed = paddlePowerUp1;
   powerup1.x = -2000000;
        // make the powerup last two levels
   if ((score1+score2) >= 5) {
       paddle1speed = paddle1speed;
   }
        }
    if (ball.intersects(powerup1) && (player2hit == true) && (score1 + score2 == 3)){
   paddle2speed = paddlePowerUp1;
    powerup1.x = -2000000;
     if ((score1+score2) >= 5) {
       paddle2speed = paddle2speed;
    }}
     // if ball hits power up 2
      if (ball.intersects(powerup2) && (player1hit == true)&&(score1 + score2 == 5)){
   paddle1.width = paddlePowerUp2;
    powerup2.x = -2000000;
       // make it only last two lifes
       if ((score1+score2) >= 7) {
       paddle1.width = paddle1.width;
       }
      }
       if (ball.intersects(powerup2) && (player2hit == true)&&(score1 + score2 == 5)){
   paddle2.width = paddlePowerUp2;
    powerup2.x = -2000000;
       if ((score1+score2) >= 7) {
       paddle2.width = paddle2.width;
       }
      }
     
    
        
   if (ball.intersects(powerup3)&& (player1hit == true)&&(score1 + score2 == 7)){
       ballSpeed = ballSpeed = ballpowerup3;
    powerup3.x = -2000000;
       if(player2hit = true){
       ballSpeed = ballSpeed;
    }
    if ((score1+score2) >= 10) {
       ballSpeed = ballSpeed;
   }}
     if (ball.intersects(powerup3)&& (player2hit == true)&&(score1 + score2 == 7)){
       ballSpeed = ballSpeed = ballpowerup3;
   powerup3.x = -2000000;
       if(player1hit = true){
       ballSpeed = ballSpeed;
   }
       if ((score1+score2) >= 10) {
       ballSpeed = ballSpeed;
   }}
     if(ball.intersects(barrier1)&& (player1hit == true)&& (score1 + score2 >= 2)){
   ballAngle = (ballAngle * -1);
     }
   
       
    }
    private void checkForGoal() {
        // ball off top
        if (ball.y < 0) {
            // add to player two score
            score2++;
            ball.x = WIDTH / 2 - ball.width / 2;
            ball.y = HEIGHT / 2 - ball.height / 2;
        }
        //ball hits bottom
        if (ball.y + ball.height > HEIGHT) {
            // add to player one score
            score1++;
            ball.x = WIDTH / 2 - ball.width / 2;
            ball.y = HEIGHT / 2 - ball.height / 2;
        }
    }

    private void movePaddles() {
        if (paddle1.x > WIDTH) {
            paddle1.x = -100;
        }
        if (paddle1.x < -150) {
            paddle1.x = paddle1.x + 1250;
        }
        if (paddle2.x > WIDTH) {
            paddle2.x = -100;
        }
        if (paddle2.x < -150) {
            paddle2.x = paddle2.x + 1250;
        }

        // to move left and right
        if (moveLeft) {
            paddle1.x = paddle1.x - paddle1speed;
        } else if (moveRight) {
            paddle1.x = paddle1.x + paddle1speed;
        }
        if (moveLeft2) {
            paddle2.x = paddle2.x - paddle2speed;
        } else if (moveRight2) {
            paddle2.x = paddle2.x + paddle2speed;
        }

    }

    private void powerups() {
  
barrier1.x = barrier1.x + moveBarrier;
if(barrier1.x> 1140){
    barrier1.x = 5;
}
         powerup1.x = powerup1.x + movePowerUp;
         if(powerup1.x > 1140){
             powerup1.x = 5;
         } 
        powerup2.x = powerup2.x + movePowerUp;
         if(powerup2.x > 1140){
             powerup2.x = 5;
         }        
          powerup3.x = powerup3.x + movePowerUp;
         if(powerup3.x > 1140){
             powerup3.x = 5;
         }        
    }
    

   


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
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_SPACE){
                startgame = true;
            }
            if (keyCode == KeyEvent.VK_A) {
                moveLeft = true;
            } else if (keyCode == KeyEvent.VK_D) {
                moveRight = true;
            }

            if (keyCode == KeyEvent.VK_LEFT) {
                moveLeft2 = true;
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                moveRight2 = true;
            }
            

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
           
            if (keyCode == KeyEvent.VK_A) {
                moveLeft = false;
            } else if (keyCode == KeyEvent.VK_D) {
                moveRight = false;
            }
            if (keyCode == KeyEvent.VK_LEFT) {
                moveLeft2 = false;
            } else if (keyCode == KeyEvent.VK_RIGHT) {
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
        LiamsGame game = new LiamsGame();
    }
}
