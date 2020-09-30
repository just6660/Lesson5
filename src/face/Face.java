
package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Face {
    
    private int xPos, yPos, eye1xPos, eye2xPos, diameter;
    private Color facecolor, eyecolor;
    private Graphics g;
    private boolean isHappy;
    
    public Face(Graphics g, int x, int y){
        xPos = x;
        yPos = y;
        
        //let the "g" property = the "g" param
        this.g = g;
        //defualt size and color
        diameter = 100;
        facecolor = Color.red;
        eyecolor = Color.blue;
        isHappy = true;
        
    }
    
    
    private void drawHead(){
       g.setColor(facecolor);
       g.drawOval(xPos,yPos,diameter,diameter);
       g.fillOval(xPos,yPos,diameter,diameter);
       
    }
    private void drawEyes(){
        eye1xPos = xPos + diameter/5;
        eye2xPos = xPos + diameter *2/3;
        g.setColor(eyecolor);
        g.drawOval(eye1xPos, yPos + diameter/4, diameter/6, diameter/6);
        g.drawOval(eye2xPos, yPos + diameter/4, diameter/6,diameter/6);
        g.fillOval(eye1xPos, yPos + diameter/4, diameter/6, diameter/6);
        g.fillOval(eye2xPos, yPos + diameter/4, diameter/6,diameter/6);
    }
    private void drawMouth(){
        eye1xPos = xPos + diameter/5;
        eye2xPos = xPos + diameter *2/3;
        g.setColor(Color.black);
        g.drawLine((eye1xPos + eye1xPos + diameter/6) /2, yPos + diameter*3/4, (eye2xPos + eye2xPos + diameter/6) /2, yPos+diameter*3/4);
        g.drawLine((eye1xPos+eye1xPos+diameter/6)/2,yPos+diameter*3/4,eye1xPos,yPos + diameter*3/5);
        g.drawLine((eye2xPos+eye2xPos+diameter/6)/2, yPos+diameter*3/4,eye2xPos + diameter/6, yPos + diameter*3/5);
    }
    private void drawSadMouth(){
        eye1xPos = xPos + diameter/5;
        eye2xPos = xPos + diameter *2/3;
        g.setColor(Color.black);
        g.drawLine((eye1xPos + eye1xPos + diameter/6) /2, yPos + diameter*3/5, (eye2xPos + eye2xPos + diameter/6) /2, yPos+diameter*3/5);
        g.drawLine((eye1xPos+eye1xPos+diameter/6)/2,yPos+diameter*3/5,eye1xPos,yPos + diameter * 3/4);
        g.drawLine((eye2xPos+eye2xPos+diameter/6)/2, yPos+diameter*3/5,eye2xPos + diameter/6, yPos + diameter*3/4);
        
    }
    
    public void draw(){
        drawHead();
        drawEyes();
        if(isHappy){
            drawMouth();
        }
        else if(!isHappy){
            drawSadMouth();
        }
       
            
        
    }
    
    public void erase(){
        g.setColor(Color.white);
        g.fillRect(xPos-10,yPos-10, diameter +20, diameter+20);
        
    }
    
    public void move(int x, int y){
        xPos = x;
        yPos = y;
        
    }
    
    public void setFaceColor(Color c){
        facecolor = c;
        
    }
    public void setEyeColor(Color c){
        eyecolor = c;
    }
    
    public void resizeFace(int d){
        diameter = d;
    }
    
    public void toggleMood(boolean h){
        isHappy = h;
    }
    

    
    
    
    
    
}
