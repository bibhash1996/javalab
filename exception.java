import java.util.*;

class exception {

    public static void main(String[] args)
      {
          Scanner input = new Scanner(System.in);
	  try {
	  int a,b;
	  a=input.nextInt();
	  b=input.nextInt();
	  float c = (float)a/b;
	  System.out.println("Ans is : " + c );
	  }
	  catch(InputMismatchException e)
	  {
	   System.out.println("Input mismatch");
	  }
	  catch(ArithmeticException e)
	  {
	    System.out.println("Divide by zero");
	  }
      }
}