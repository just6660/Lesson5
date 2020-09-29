
package lucky7;


public class Dice {
    private int number; 
    
    public Dice(){
        
    }
    public void roll(){
         number = (int)(Math.random()*6+1);
    }
    public int getNumber(){
        return number;
    }
     

    
}
