
package student;

import java.util.Scanner;


public class StudentInterface {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner scan = new Scanner(System.in);
        
        String name;
        int score, highestscore;
        double highestaverage;
        
        while(true){
            //Input first Student's data
            System.out.print("Enter name for first studnet (min 1 letter): ");
            name = scan.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", i, stu1.getName());
                score = scan.nextInt();
                stu1.setScore(i,score);
            
            
            }
            String errormag = stu1.validateData();
            if(errormag == null){
                break;
            }
            else{
                System.out.println(errormag);
                scan.nextLine();//clear scanner buffer
            }
        }
        scan.nextLine();//clear scanner buffer
        while(true){
            
            System.out.println("\n--------------------------------------\n");
            //input the second student's data
            //input first Student's data
            System.out.print("Enter name for second student: ");
            name = scan.nextLine();
            stu2.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", i, stu2.getName());
                score = scan.nextInt();
                stu2.setScore(i,score);
            
            
            }
            String errormag = stu2.validateData();
            if(errormag == null){
                break;
            }
            else{
                System.out.println(errormag);
                scan.nextLine();//clear scanner buffer
            }
        }
        
        highestscore = Math.max(stu1.getHighScore(),stu2.getHighScore());
        highestaverage = Math.max(stu1.getAverage(),stu2.getAverage());
        
            
        System.out.println("\n--------------------------------------\n");
        //output the Student's information
        System.out.println(stu1);
        System.out.print("\n");
        System.out.println(stu2+"\n");
        if(stu1.getHighScore()==stu2.getHighScore())
            System.out.format("Both students had a high score of %d\n",highestscore);
        else if(stu1.getHighScore()==highestscore)
            System.out.format("%s had the highest score with a score of %d\n",stu1.getName(),highestscore);
        else if(stu2.getHighScore()==highestscore)
            System.out.format("%s had the highest score with a score of %d\n",stu2.getName(),highestscore);
        
        if(stu1.getAverage() == stu2.getAverage())
            System.out.format("Both students had the same average of %.2f\n",highestaverage);
        else if(stu1.getAverage() == highestaverage)
            System.out.format("%s had the highest average with an average of %.2f\n",stu1.getName(),highestaverage);
        else if(stu2.getAverage() == highestaverage)
            System.out.format("%s had the highest average with an average of %.2f\n",stu2.getName(),highestaverage);
        
        System.out.println("\n");
    }
    
}
