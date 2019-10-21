//Student version
//Name - Emery Porter
//Date - 3/3/2017
//Lab  - Pong

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import static java.lang.Character.*;

import java.awt.image.BufferedImage;

public class Pong extends Canvas implements KeyListener, Runnable {
    private Ball ball;
    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private boolean[] keys;
    private BufferedImage back;
    private int leftScore = 0;
    private int rightScore = 0;
    private int speedIncChance = 30;

    public Pong() {
        ball = new Ball(200, 200, 10, 10, Color.GREEN);
        leftPaddle = new Paddle(20, 300, 10, 50, Color.WHITE, 4);
        rightPaddle = new Paddle(765, 300, 10, 50, Color.WHITE, 4);
        keys = new boolean[4];

        setBackground(Color.BLACK);
        setVisible(true);

        new Thread(this).start();
        addKeyListener(this);        //starts the key thread to log key strokes
    }

    public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {

        //set up the double buffering to make the game animation nice and smooth
        Graphics2D twoDGraph = (Graphics2D) window;

        //take a snap shop of the current screen and same it as an image
        //that is the exact same width and height as the current screen
        if (back == null)
            back = (BufferedImage) (createImage(getWidth(), getHeight()));

        //create a graphics reference to the back ground image
        //we will draw all changes on the background image
        Graphics graphToBack = back.createGraphics();
        Font f = new Font("Impact", Font.PLAIN, 50);
        graphToBack.setFont(f);
        graphToBack.setColor(Color.BLACK);
        graphToBack.fillRect(getX(), getY(), getWidth(), getHeight());
        graphToBack.setColor(Color.WHITE);
        graphToBack.fillRect(0, 90, 800, 10);
        graphToBack.fillRect(0, 510, 800, 10);
        if(leftScore >= 7){
            graphToBack.drawString("Player 1 Wins", 400, 300);
        }
        else if(rightScore >= 7){
            graphToBack.drawString("Player 2 Wins", 400, 300);
        }
        else {
            graphToBack.drawString(Integer.toString(leftScore), 200, 70);
            graphToBack.drawString(Integer.toString(rightScore), 570, 70);
            //graphToBack.drawString(Integer.toString(ball.getXSpeed()), 400, 500);
            //graphToBack.drawString(Integer.toString(ball.getYSpeed()), 400, 550);
            graphToBack.fillRect(400, 100, 10, 10);
            graphToBack.fillRect(400, 120, 10, 10);
            graphToBack.fillRect(400, 140, 10, 10);
            graphToBack.fillRect(400, 160, 10, 10);
            graphToBack.fillRect(400, 180, 10, 10);
            graphToBack.fillRect(400, 200, 10, 10);
            graphToBack.fillRect(400, 220, 10, 10);
            graphToBack.fillRect(400, 240, 10, 10);
            graphToBack.fillRect(400, 260, 10, 10);
            graphToBack.fillRect(400, 280, 10, 10);
            graphToBack.fillRect(400, 300, 10, 10);
            graphToBack.fillRect(400, 320, 10, 10);
            graphToBack.fillRect(400, 340, 10, 10);
            graphToBack.fillRect(400, 360, 10, 10);
            graphToBack.fillRect(400, 380, 10, 10);
            graphToBack.fillRect(400, 400, 10, 10);
            graphToBack.fillRect(400, 420, 10, 10);
            graphToBack.fillRect(400, 440, 10, 10);
            graphToBack.fillRect(400, 460, 10, 10);
            graphToBack.fillRect(400, 480, 10, 10);
            graphToBack.fillRect(400, 500, 10, 10);
            ball.moveAndDraw(graphToBack);
            leftPaddle.draw(graphToBack);
            rightPaddle.draw(graphToBack);

            //see if ball hits top wall or bottom wall
            if (!(ball.getY() >= 100 && ball.getY() <= 500)) {
                ball.setYSpeed(-ball.getYSpeed());
            }

            if (leftPaddle.getY() <= 100) {
                leftPaddle.setY(100);
            }

            if (leftPaddle.getY() + leftPaddle.getHeight() >= 510) {
                leftPaddle.setY(510 - leftPaddle.getHeight());
            }

            if (rightPaddle.getY() <= 100) {
                rightPaddle.setY(100);
            }

            if (rightPaddle.getY() + rightPaddle.getHeight() >= 510) {
                rightPaddle.setY(510 - rightPaddle.getHeight());
            }


            //left paddle
            if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed()) && (ball.getY() >= leftPaddle.getY() && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() || ball.getY() + ball.getHeight() >= leftPaddle.getY() && ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight())) {
                if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())) {
                    ball.setYSpeed(-ball.getYSpeed());
                } else {
                    if ((int) Math.random() * 100 <= speedIncChance) {
                        ball.setXSpeed(-ball.getXSpeed() + 1);
                    } else {
                        ball.setXSpeed(-ball.getXSpeed());
                    }
                }
            }
            //right paddle
            if (ball.getX() + ball.getWidth() >= rightPaddle.getX() + Math.abs(ball.getXSpeed()) && (ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight() || ball.getY() + ball.getHeight() >= rightPaddle.getY() && ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight())) {
                if (ball.getX() >= rightPaddle.getX() + Math.abs(ball.getXSpeed())) {
                    ball.setYSpeed(-ball.getYSpeed());
                } else {
                    if ((int) Math.random() * 100 <= speedIncChance) {
                        ball.setXSpeed(-ball.getXSpeed());
                    } else {
                        ball.setXSpeed(-ball.getXSpeed());
                    }
                }
            }

            //**see if the paddles need to be moved (I did left paddle)
            if (keys[0]) {
                leftPaddle.moveUpAndDraw(graphToBack);
            }
            if (keys[1]) {
                leftPaddle.moveDownAndDraw(graphToBack);
            }
            if (keys[2]) {
                rightPaddle.moveUpAndDraw(graphToBack);
            }
            if (keys[3]) {
                rightPaddle.moveDownAndDraw(graphToBack);
            }

            if (ball.getX() > rightPaddle.getX() + 100) {
                ball = new Ball(200, 200, 10, 10, Color.WHITE);
                leftScore++;
            }
            if (ball.getX() < leftPaddle.getX() - 100) {
                ball = new Ball(500, 200, 10, 10, Color.WHITE, -3, 1);
                rightScore++;
            }
        }
		twoDGraph.drawImage(back, null, 0, 0);
    }

    public void keyPressed(KeyEvent e) {
        switch (toUpperCase(e.getKeyChar())) {
            case 'W':
                keys[0] = true;
                break;
            case 'Z':
                keys[1] = true;
                break;
            case 'I':
                keys[2] = true;
                break;
            case 'M':
                keys[3] = true;
                break;
            case 'G':
                keys[4] = true;
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (toUpperCase(e.getKeyChar())) {
            case 'W':
                keys[0] = false;
                break;
            case 'Z':
                keys[1] = false;
                break;
            case 'I':
                keys[2] = false;
                break;
            case 'M':
                keys[3] = false;
                break;
            case 'G':
                keys[4] = false;
                break;
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(8);
                repaint();
            }
        } catch (Exception e) {
        }
    }
}