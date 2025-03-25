package Phase1;

import java.util.Scanner;

public class CalculateGrade{
    public static void calculate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many subjects to calculate the marks:");
        int noOfSubject=Integer.parseInt(sc.next());
        int total=0;
        for(int i=0;i<noOfSubject;i++){
            System.out.println("Enter the subject name:");
            String s=sc.next();
            System.out.println("Enter the mark of the subject "+s);
            int mark=Integer.parseInt(sc.next());
            total+=mark;
        }
        grade(total,noOfSubject);
    }
    public static void grade(int total,int noOfSubject){
            System.out.println("Your total mark:"+total);
            double percentage=(total*100)/(noOfSubject*100);
            System.out.println(percentage);
            if(percentage<=100&&percentage>90){
                System.out.println("Your grade is A");
            }
            else if(percentage<=89&&percentage>70){
                System.out.println("Your grade is B");
            }
            else if(percentage<=69&&percentage>50){
                System.out.println("Your grade is B");
            }
            else if(percentage<=49&&percentage>40){
                System.out.println("Your grade is B");
            }
            else{
                System.out.println("Fail");
            }

    }
}
