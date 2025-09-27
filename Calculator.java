import java.util.Scanner;
class Calculations{
  int add(int num1,int num2) {
    return num1 + num2;
  }
  int sub(int num1,int num2){
    return num1 - num2;
  }
  float mul(int num1, int num2){
    return num1*num2;
  } 
  double div(int num1, int num2){
    return num1/num2;
  }
}

public class Calculator {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num 1:\t");
    int num1=sc.nextInt();
    System.out.println("Enter num 2:\t");
    int num2=sc.nextInt();
    Calculations c=new Calculations();
    while(true){
      System.out.println("Enter your choice");
      int ch=sc.nextInt();
      switch (ch) {
        case 1:System.out.println("This is addidtion");
                int rs=c.add(num1, num2);
                System.out.println("The result of addition is:\t"+rs);
                break;
        case 2:System.out.println("This is subtraction");
                int r=c.sub(num1, num2);
                System.out.println("The result of subtraction is:\t"+r);
                break;
        case 3:System.out.println("This is multiplication");
                float s=c.mul(num1, num2);
                System.out.println("The result of multiplication is:\t"+s);
                break;
        case 4:System.out.println("This is division");
                double d=c.div(num1, num2);
                System.out.println("The result of division is:\t"+d);
                break;
        default:
                System.out.println("Invalid case entered");
                System.out.println("User Exited");
                return;
      }
    }

    }

}

