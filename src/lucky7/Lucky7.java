
package lucky7;

import java.util.Scanner;


public class Lucky7 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money,roll1,roll2,rollsum,rollcount=0,highestmoney=0,highestroll=0;
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        System.out.print("How many dollars do you have? > ");
        money = s.nextInt();
        
        
        while(true){
            d1.roll();
            d2.roll();
            rollcount++;
            roll1 = d1.getNumber();
            roll2 = d2.getNumber();
            rollsum = roll1+roll2;
            highestmoney = money>highestmoney ? money:highestmoney;
            highestroll = money>=highestmoney ? rollcount:highestroll;
            if(rollsum==7)
                money+=4;
            else
                money-=1;
            if(money==0){
                break; 
            }
        }
        
        System.out.format("You are broke after %d rolls. \n", rollcount);
        System.out.format("You should have quit after %d rolls when you had $%d \n", highestroll, highestmoney);
    }
    
}
