public class OurCalculator{
  public static void main(String[] args){
    Scanner scan = new Scanner (System.in);

    while (true){
      operator = enterOperator();

      if(operator.equals("q")){
        System.out.println("Exiting program");
        break;
      }

      System.out.println("Enter first number");
      firstNumber = enterDouble();
      System.out.println("Enter second number");
      secondNumber = enterDouble();

      if(operator.equals("+")){
        answer = add(firstNumber,secondNumber);
        System.out.println("The sum is: " + answer);
      }
      else if(operator.equals("-")){
        answer = sub(firstNumber,secondNumber);
        System.out.println("The difference is: " + answer);
      }
      else if(operator.equals("*")){
        answer = mult(firstNumber,secondNumber);
        System.out.println("The product is: " + answer);
      }
      else if(operator.equals("/")){
        if(secondNumber == 0){
          System.out.println("You can't divide by 0");
        } else {
          answer = div(firstNumber,secondNumber);
          System.out.println("The quotient is: " + answer);
        }
      }
    }
  }
}
