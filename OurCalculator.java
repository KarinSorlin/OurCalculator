import java.util.Scanner;

public class OurCalculator {

  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    while (true){
      String operator = "";
      do {
        System.out.println("Choose operator +, -, *, / or q to quit");
        operator = scan.next();
        if(operator.equals("q")){
          System.out.println("Good Bye");
          return ;
        }
      } while ((operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))==false);

      System.out.println("Enter first number");
      double num1 = scan.nextDouble();
      System.out.println("Enter second number");
      double num2 = scan.nextDouble();

      if(operator.equals("+")){
        System.out.println("The sum is: "+(num1+num2));
      }
      else if(operator.equals("-")){
        System.out.println("The difference is: "+(num1-num2));
      }
      else if(operator.equals("*")){
        System.out.println("The product is: "+(num1*num2));
      }
      else if(operator.equals("/")){
        if(num2 == 0){
          System.out.println("You can't divide by 0");
        } else {
          System.out.println("The quotient is: "+(num1/num2));
        }
      }
    } //while
  } //main
} //class
